/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deviceListener;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author rafikhan
 */
public class LabelButtonListener implements MouseListener{
    private Component parent;
    private Component own;
    private Component domain;
    private boolean triger=true;
    public LabelButtonListener(Component own,Component domain) {
        this.parent=own.getParent();
        this.own=own;
        this.domain=domain;
        own.setBackground(parent.getBackground());
    }
    public LabelButtonListener(Component parent,Component own,Component domain) {
        this.parent=parent;
        this.own=own;
        this.domain=domain;
        own.setBackground(parent.getBackground());
    }
    @Override
    public void mouseEntered(MouseEvent me) {
        if(triger){
            own.setBackground(parent.getBackground().darker());
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(triger){
            own.setBackground(parent.getBackground());
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }
    
}
