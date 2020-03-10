/*
 * Licensed for single use only
 * One backup copy is permitted for security
 * For full Terms & Conditions see Manual
 */
package wagonflow5;

import javax.swing.*;

/**
 * Java implementation of Harry Drummond's WagonFlow 4 Delphi implementation
 * @author Judith Rastall
 */
public class WagonFlow5 {
    /**
     * @param args the command line arguments
     */
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
    
    public static void main(String[] args) {
        StartScreen splash = new StartScreen(); // calls opening splash
        splash.setVisible(true);
    }
    
}
