package com.agesoft.embededsystem;

import javax.swing.*;
import java.awt.*;

/**
 * <b>Agesoft EmbeddedSystems</b><br>
 * Agesoft EmbeddedSystems is a Java Application which creates a Flexible Embedded Application.<br><br>
 * The <code>EmbededSystem</code> class is the entry point to the application you just need to change some variables that's marked with the <code>Configurable Variables</code> Comment!
 * */
public class EmbededSystem {

    private final JFrame sys = new JFrame();
    private final JLabel statusLabel = new JLabel();
    private final JLabel companynver = new JLabel();


    /**
     * Configurable Variables
     *
     * You can configurate these variables so that they fit into your embedded machine!
     * Please read the StartUp() Function before playing with these settings!
     * */

    private final String CompanyName = "Agesoft Systems"; // (c) 2022 <CompanyName>

    private final Color startupBackColor = Color.decode("#153e73");

    private final Color statusForeColor = Color.decode("#cfcd4e");
    private final String statusFont = "Verdana";
    private final int statusFontSize = 50;

    /**
     * Starts up the application
     * @since v0.1
     * */
    private void StartUp(){

        companynver.setText("© 2022 " + CompanyName);
        companynver.setFont(new Font("Consolas", Font.PLAIN, 20));
        companynver.setForeground(Color.white);
        companynver.setHorizontalAlignment(SwingConstants.CENTER);

        statusLabel.setText("Starting System...");
        statusLabel.setFont(new Font(statusFont, Font.PLAIN, statusFontSize));
        statusLabel.setForeground(statusForeColor);
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        statusLabel.setVerticalAlignment(JLabel.CENTER);

        sys.getContentPane().setBackground(startupBackColor);

        // Disables alt + f4 (nobody wants to enter the backend of their mashines and mess around the actual pc right?)
        sys.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        sys.setExtendedState(Frame.MAXIMIZED_BOTH);
        sys.setUndecorated(true);


        sys.add(statusLabel, BorderLayout.CENTER);
        sys.add(companynver, BorderLayout.SOUTH);

        sys.setVisible(true);
    }

    /**
     * Initializes The Embedded Machine Software.
     * @since v0.1
     */
    public void Init(){
        StartUp();
    }
}