package de.lama.workaround.rcp;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.hibernate.cfg.Configuration;

import workaround.WorkaroundFactory;
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
        String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=MyDb";
        final URI uri = URI.createURI(uriStr);
        loadResource(uri);
        return uri;
    }

    private void loadResource(final URI uri)
    {
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(uri);
        try
        {
            resource.load(null);
            if (resource.getContents().size() == 0)
            {
                resource.getContents().add(WorkaroundFactory.eINSTANCE.createWorkaround());
                resource.save(null);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void initializeHibernateDataStore()
    {
        HbDataStore hbds = (HbDataStore) HbHelper.INSTANCE.createRegisterDataStore("MyDb");

        String path = "/resources/hibernate.cfg.xml";
        Configuration xmlConfiguration = new Configuration();
        xmlConfiguration = xmlConfiguration.configure(path);
        Properties properties = xmlConfiguration.getProperties();
        hbds.setDataStoreProperties(properties);
        // Register EMF package
        hbds.setEPackages(new EPackage[] { WorkaroundPackage.eINSTANCE });
        hbds.initialize();
    }
}
