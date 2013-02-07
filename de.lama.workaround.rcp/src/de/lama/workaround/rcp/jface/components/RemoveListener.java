package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;

public class RemoveListener implements KeyListener {

    private final MultiAddButtonGroup buttonGroup;

    public RemoveListener(MultiAddButtonGroup buttonGroup) {
        this.buttonGroup = buttonGroup;
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.character == SWT.DEL) {
            buttonGroup.remove();
        }
    }

}
