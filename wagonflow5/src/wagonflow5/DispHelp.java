/*
 * Licensed for single use only
 * One backup copy is permitted
 * For full Terms & Conditions see Manual
 */
package wagonflow5;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.stream.Stream;
import javax.swing.*;

public class DispHelp extends JFrame {

    JTextArea DispHelp = new JTextArea(20, 50);
        
    public DispHelp() {
        super("Wagonflow5 Help");
//        URL iconURL = getClass().getResource("Flow5.png");
        // iconURL is null when not found
//        ImageIcon icon = new ImageIcon(iconURL);
//        lines above no longer work but simplified line below does. Go figga!
        ImageIcon icon = new ImageIcon("Flow5.png");
        setIconImage(icon.getImage());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = getSize();
        int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
        int windowY = Math.max(0, (screenSize.height - windowSize.height) / 8);
        setLocation(windowX, windowY);  // sets location 

        //... Set textarea's initial text, scrolling, and border.
        DispHelp.setText("");
        JScrollPane scrollingArea = new JScrollPane(DispHelp);
        DispHelp.setLineWrap(true);
        DispHelp.setWrapStyleWord(true);
        DispHelp.setEditable(false);
        DispHelp.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        DispHelp.append(text0);
        DispHelp.setCaretPosition(0);
        //... Get the content pane, set layout, add to center
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(scrollingArea, BorderLayout.CENTER);
        this.setContentPane(content);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
    }
    
//        JEditorPane editorPane = createEditorPane();
//        JScrollPane editorScrollPane = new JScrollPane(editorPane);
//        editorScrollPane.setVerticalScrollBarPolicy(
//                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        editorScrollPane.setPreferredSize(new Dimension(250, 145));
//        editorScrollPane.setMinimumSize(new Dimension(10, 10));

    
    
//    public JEditorPane createEditorPane() {
//        JEditorPane editorPane = new JEditorPane();
//        editorPane.setEditable(false);
//        java.net.URL helpURL = DispHelp.class.getResource(
//                                        "HelpText/wf5h001.html");
//        if (helpURL != null) {
//            try {
//                editorPane.setPage(helpURL);
//            } catch (IOException e) {
//                System.err.println("Attempted to read a bad URL: " + helpURL);
//            }
//        } else {
//            System.err.println("Couldn't find html file.");
//        }


    
    public static void main(String[] args) {
        JFrame win = new DispHelp();
        win.setVisible(true);
    }
    // Text for help pages
    private String text0 = "General hints are offered throughout the program " +
            "but they are not intended to be a substitute for reading the manual.\n\n" +
            "Your options here are:\n\n" +
            "Wagonflow: the original, prototypical system which keeps track " +
            "of all wagons, tells you when to move them, and what kind of " +
            "traffic your town would welcome on the next train in. " +
            "You decide which vehicles will carry that traffic, " +
            "and you can add extra wagons if you wish. If no suitable wagons are " +
            "available when requested, they follow later as Late Traffic. " +
            "Block trains such as weekly cattle trains are catered for, " +
            "and interchange of traffic is possible for up to fifteen stations.\n\n" +
            "Autoflow: While Wagonflow copies prototype operation and problems, " +
            "some modellers will wish for a more relaxed system. " +
            "Autoflow has Wagonflow’s intelligence to take full control of wagon " +
            "movements and leaves you to concentrate purely on " +
            "running and shunting. It has fewer prototype problems but " +
            "traffic still goes to sensible places and you still have shunting, " +
            "block trains, and so on. This is the relaxed way to run your " +
            "freight services.\n\n" +
            "Timeflow: the timetabling system. " +
            "At the press of a button it lists train movements station by " +
            "station, or as a single, integrated list. Timeflow can also keep " +
            "track of what day it is, so you can easily run “Monday Only”, " +
            "“Saturday Excepted” and other trains that run irregularly or rarely. " +
            "And the timetable can display just the ones due to run today!\n\n" +
            "Fast Start: remembers how you last closed Wagonflow and simply " +
            "resumes things where you left off.\n\n" +
            "Edit Tables: where you create your data files, add new wagons, " +
            "rename stations, change your timetables, etc.\n\n" +
            "Quit: Exits the program, saving your data and current position as it does.\n";
    
         
}
