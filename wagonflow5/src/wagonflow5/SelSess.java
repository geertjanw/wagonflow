/*
 * Licensed for single use only
 * One backup copy is permitted
 * For full Terms & Conditions see Manual
 */
package wagonflow5;

/**
 * Java implementation of Harry Drummond's WagonFlow 4 Delphi implementation
 * @author Judith Rastall
 */

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class SelSess extends JFrame {

    JButton WagonflowButton;
    JButton AutoflowButton;
    JButton TimeflowButton;
    JButton FastStartButton;
    JButton TableEditButton;
    JButton QuitButton;
    JButton HintButton;
    JLabel PickLabel;
    JLabel LogoLabel;
//    BufferedImage WF5Logo;
    
//    public void LoadWF5() {
//        try {
//           WF5Logo = ImageIO.read(new File("images/WF5_200.gif"));
//        } catch (IOException e) {
//           System.out.println("File not found");  // error checking
//        }
//    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public SelSess() {
        super("Wagonflow5 Task Picker");
//        URL iconURL = getClass().getResource("Flow5.png");
//        // iconURL is null when not found
        ImageIcon icon = new ImageIcon("Flow5.png");
        setIconImage(icon.getImage());
        setLookAndFeel();
        setSize(600, 75);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(45, 25);  // sets location 
        
       
        // build top row elements
        JPanel topRow = new JPanel();

        LogoLabel = new JLabel();
        LogoLabel.setPreferredSize(new Dimension(295, 30));
        LogoLabel.setHorizontalAlignment(JLabel.LEFT);
//        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/WF5_200.gif")));
        LogoLabel.setIcon(new javax.swing.ImageIcon("Images/WF5_200.gif"));
//        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("WF5.gif")));
//        LogoLabel.add(new LoadWF5());
        LogoLabel.setOpaque(true);
        LogoLabel.setBackground(Color.BLUE);
        
        PickLabel = new JLabel("Pick a task");
        PickLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        PickLabel.setPreferredSize(new Dimension(180, 30));
        PickLabel.setHorizontalAlignment(JLabel.CENTER);
        PickLabel.setBackground(Color.BLUE);
        PickLabel.setOpaque(true);
        PickLabel.setForeground(Color.YELLOW);
        
        HintButton = new JButton("? Hint ?");
        HintButton.setPreferredSize(new java.awt.Dimension(90, 25));
        HintButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        HintButton.setToolTipText("Simple help");
        HintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintButtonActionPerformed(evt);
            }
        });
        
        // build top row
        GridLayout top = new GridLayout(1, 5);
        setLayout(top);
        
        topRow.add(LogoLabel);
        topRow.add(PickLabel);
        topRow.add(HintButton);
        topRow.setOpaque(true);
        topRow.setBackground(Color.BLUE);
        
        // build bottom row elements
        GridLayout buttons = new GridLayout(1, 6);
        setLayout(buttons);
        WagonflowButton = new JButton("Wagonflow");
        WagonflowButton.setPreferredSize(new java.awt.Dimension(90, 45));
        WagonflowButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        WagonflowButton.setToolTipText("Launch Wagonflow5");
        WagonflowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WagonflowButtonActionPerformed(evt);
            }
        });
        AutoflowButton = new JButton("Autoflow");
        AutoflowButton.setPreferredSize(new java.awt.Dimension(90, 45));
        AutoflowButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        AutoflowButton.setToolTipText("Launch Autoflow");
        AutoflowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoflowButtonActionPerformed(evt);
            }
        });
        TimeflowButton = new JButton("Timeflow");
        TimeflowButton.setPreferredSize(new java.awt.Dimension(100, 45));
        TimeflowButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        TimeflowButton.setToolTipText("Launch Timeflow");
        TimeflowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeflowButtonActionPerformed(evt);
            }
        });
        FastStartButton = new JButton("Fast Start");
        FastStartButton.setPreferredSize(new java.awt.Dimension(90, 45));
        FastStartButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        FastStartButton.setToolTipText("Launch Fast Start");
        FastStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastStartButtonActionPerformed(evt);
            }
        });
        TableEditButton = new JButton("Edit Tables");
        TableEditButton.setPreferredSize(new java.awt.Dimension(90, 45));
        TableEditButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        TableEditButton.setToolTipText("Edit tables");
        TableEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableEditButtonActionPerformed(evt);
            }
        });
        QuitButton = new JButton("Quit");
        QuitButton.setPreferredSize(new java.awt.Dimension(90, 45));
        QuitButton.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        QuitButton.setToolTipText("Quit");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });
        
        // build bottom row
        JPanel btmRow = new JPanel();
        btmRow.add(WagonflowButton);
        btmRow.add(AutoflowButton);
        btmRow.add(TimeflowButton);
        btmRow.add(FastStartButton);
        btmRow.add(TableEditButton);
        btmRow.add(QuitButton);
        btmRow.setOpaque(true);
        btmRow.setBackground(Color.BLUE);
        
        // create frame
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add("North", topRow);
        add("South", btmRow);
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

        private void WagonflowButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
            java.awt.Toolkit.getDefaultToolkit().beep();
        }                                        

        private void AutoflowButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
            java.awt.Toolkit.getDefaultToolkit().beep();
        }                                        

        private void TimeflowButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
            java.awt.Toolkit.getDefaultToolkit().beep();
        }                                        

        private void FastStartButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
            java.awt.Toolkit.getDefaultToolkit().beep();
        }                                        

        private void TableEditButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
//            java.awt.Toolkit.getDefaultToolkit().beep();
            TableTest TopMenu = new TableTest();  // test call
            TopMenu.setVisible(true);
        }                                        

        private void HintButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // Add code to display help text
            // Call general help file with various pages in context
            DispHelp Hint = new DispHelp();
            Hint.setVisible(true);
        }                                        

        private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
            System.exit(0);     // quit whole program and close all windows
        }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SelSess frame = new SelSess();
    }
}
