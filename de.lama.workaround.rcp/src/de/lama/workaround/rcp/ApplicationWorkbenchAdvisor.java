package de.lama.workaround.rcp;

import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.hibernate.cfg.Configuration;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.handler.OpenEditorRunnable;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor
{

    private static final String PERSPECTIVE_ID = "de.lama.workaround.rcp.perspective"; //$NON-NLS-1$

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer)
    {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

    public String getInitialWindowPerspectiveId()
    {
        return PERSPECTIVE_ID;
    }

    @Override
    public void initialize(IWorkbenchConfigurer configurer)
    {
        super.initialize(configurer);
        configurer.setSaveAndRestore(true);
        initializeHibernateDataStore();
        final URI uri = initializeDatabaseContentdata();
        openEditor(uri);
    }

    private void openEditor(final URI uri)
    {
        OpenEditorRunnable openEditor = new OpenEditorRunnable(uri);
        Display.getDefault().asyncExec(openEditor);
    }

    private URI initializeDatabaseContentdata()
    {
        String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=WorkaroundDB";
        final URI uri = URI.createURI(uriStr);
        return uri;
    }

    private void initializeHibernateDataStore()
    {
        final HbDataStore hbds = (HbDataStore) HbHelper.INSTANCE.createRegisterDataStore("WorkaroundDB");

        final String path = "/resources/hibernate.cfg.xml";
        Configuration xmlConfiguration = new Configuration();
        xmlConfiguration = xmlConfiguration.configure(path);
        final Properties properties = xmlConfiguration.getProperties();
        hbds.setDataStoreProperties(properties);
        // Register EMF package
        hbds.setEPackages(new EPackage[] { WorkaroundPackage.eINSTANCE });
        hbds.initialize();
    }
}
