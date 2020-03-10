/*
 * Licensed for single use only
 * One backup copy is permitted 
 * For full Terms & Conditions see Manual
 */
package wagonflow5;

//import java.awt.Toolkit;

import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.imageio.*;

/**
 * Java implementation of Harry Drummond's WagonFlow 4 Delphi implementation
 * @author Judith Rastall
 */
public class NewStart extends javax.swing.JFrame {
    
    /**
     * Creates new StartScreen from scratch
     */
    
    JButton StartButton;
    JButton ExitButton;
    JLabel Signal;
    JLabel Banner;
    JLabel CopyStart;
    JLabel HarryExit;
    JButton Start;
    JButton Exit;
    BufferedImage img;
    String imagePath = "E:\\Judith\\NetBeansProjects\\WagonFlow5\\src\\wagonflow5\\Images\\";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public NewStart() {
        super("WagonFlow5");
//        initComponents();
        URL iconURL = getClass().getResource("Flow5.png");
        // iconURL is null when not found and will not run when compiled
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        setLocationRelativeTo(null); // places frame in centre of screen
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//private void initComponents() {
        // set up panel 1
        JPanel leftPan = new JPanel();
        Signal = new JLabel();
        Signal.setPreferredSize(new Dimension(125, 365));
        Signal.setBackground(new java.awt.Color(0, 255, 255));
        Signal.setHorizontalAlignment(JLabel.LEFT);
        Signal.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/SignalClear.gif")));
        Signal.setOpaque(true);
        
        
        
        // set up panel 2
        JPanel topPan = new JPanel();
        Banner = new JLabel();
        Banner.setPreferredSize(new Dimension(125, 365));
        Banner.setBackground(new java.awt.Color(0, 255, 255));
        Banner.setHorizontalAlignment(JLabel.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/WagonFlow5.gif")));
        Banner.setOpaque(true);
        
        // set up panel 3
        JPanel midPan = new JPanel();
        CopyStart = new JLabel("© Judith Rastall 2020");
        CopyStart.setFont(new java.awt.Font("Tahoma", 0, 36));
        CopyStart.setPreferredSize(new Dimension(125, 365));
        CopyStart.setBackground(new java.awt.Color(0, 255, 255));
        CopyStart.setHorizontalAlignment(JLabel.RIGHT);
        CopyStart.setOpaque(true);
        
        // set up panel 4
        JPanel btmPan = new JPanel();
        HarryExit = new JLabel("Originally created by Harry Drummond");
        HarryExit.setFont(new java.awt.Font("Tahoma", 0, 18));
        HarryExit.setPreferredSize(new Dimension(125, 365));
        HarryExit.setBackground(new java.awt.Color(0, 255, 255));
        HarryExit.setHorizontalAlignment(JLabel.RIGHT);
        HarryExit.setOpaque(true);
        
        // build leftPan
        GridLayout panLeft = new GridLayout(1, 1);
        setLayout(panLeft);
        leftPan.add(Signal);
        leftPan.setBackground(new java.awt.Color(0, 255, 255));
        leftPan.setOpaque(true);
        
        // assemble frame
//        FlowLayout left = new FlowLayout();
//        setLayout(left);
//        leftPan.add(Signal);
//        leftPan.add(Banner);
//        leftPan.add(CopyStart);
//        leftPan.add(HarryExit);
        leftPan.setBackground(new java.awt.Color(0, 255, 255));
        leftPan.setOpaque(true);
        pack();
        setVisible(true);
    }
 
    private void setLookAndFeel() {
            try {
                UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                );
            } catch (Exception exc) {
                // ignore error
            }
        }

     private void ButtonStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
            dispose();        
            SelSess TopMenu = new SelSess();
            TopMenu.setVisible(true);
        }                                        
    
    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
            System.exit(0);
        }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewStart().setVisible(true);
//            }
//        });
        NewStart frame = new NewStart();
        frame.pack();
        frame.setVisible(true);
    }
}
