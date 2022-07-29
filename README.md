# EmbedSys

**EmbedSys** is a flexible Java application template which is designed for embedded systems

# Setup

Clone the files and open up the `EmbededSystem.java` file and configurate these variables so that they fit to your embedded system.

```java
private final String CompanyName = "Agesoft Systems"; // (c) 2022 <CompanyName>

private final Color startupBackColor = Color.decode("#153e73");

private final Color statusForeColor = Color.decode("#cfcd4e");
private final String statusFont = "Verdana";
private final int statusFontSize = 50;
```

Go to the `StartUp()` method and add your own code for the start up of your embedded system:

```java
Jframe mainFrame = new Jframe();

private void StartUp(){
        // Creates the startup frame.
        createStartupFrame();

        // Add your own functions / code here:
        // Example: Some calculation before the app finished booting!
        int i = 69;
        if(i != 420){
            i += 420;
        } else {
            System.exit(-1);
        }

        // If finished this function gets called, replace null with your main frame!
        startedUp(mainFrame);
    }
```

Then Start it:

```java
public static void main(String[] args) {
        EmbededSystem system = new EmbededSystem();
        system.Init();
}
```

# For Machine Administrators

**Keyboard:**

This application is designed to be used without a keyboard that's why we recomend to avoid running this software in a machine with a keyword because we only could disable alt + f4!

**Autorun:**

Incase of a crash or reboot of the firmware we recomend you to put the Java application into the Autorun so that nobody can mess around the machine **(Additionally Security Recomended)**

**Did you found a bug?**

Please open a issue and provide the bug so we can quickly fix it as possible, especially on embedded softwares is the security very important<br><br><br>

**Agesoft is not responsible for any harm, the machine administrator or company is responsible for any harm.**