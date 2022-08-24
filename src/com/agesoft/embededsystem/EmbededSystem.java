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

    // If true then nothing happends | if false then the machine is bricked till the bool is set to true again
    private final boolean availability = true;

    /**
     * Starts up the application
     * @since v0.1
     * */
    private void createStartupFrame(){

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
     * will stop the start up and put the device into the unavailability mode. it can be triggered if the start-up was faulty or if the availability bool is false
     * @since v0.1
     */
    private void unavailableDeviceError(){
        sys.remove(companynver);
        statusLabel.setText("This Machine is currently unavailable!"); // Restart the application to try again.
    }

    /**
     * When started up this function gets called!<br>
     * <b><code>finalApp</code></b> - pass your main frame in it!
     * @since v0.1
     */
    private void startedUp(JFrame finalApp){
        sys.remove(statusLabel);
        sys.remove(companynver);

        finalApp.setVisible(true);
    }

    private void StartUp(){
        // Creates the startup frame.
        createStartupFrame();

        // try catch block if there is any errors in it. if it has it will be put in unavailability mode
        try {

            // Add your own functions / code here:

        } catch (Exception e){
            e.printStackTrace();
            unavailableDeviceError();
        }

        // if finished this if statement gets called if the machine is allowed to be booted.
        if(availability){
            // replace null with your main frame!
            startedUp(new JFrame("Replace this frame with your frame."));
        } else {
            unavailableDeviceError();
        }
    }

    /**
     * Initializes The Embedded Machine Software.
     * @since v0.1
     */
    public void Init(){
        StartUp();
    }
}
