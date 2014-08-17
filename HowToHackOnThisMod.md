#That Conference Bacon Mod
###How to Hack On This Mod From Your Own Machine

So you want to run and fiddle with the Bacon Mod we showed off at [That Conference](http://thatconference.com).  The instructions below will explain how to get this mode ready for you to explore and hack on.  

If your computer isn't setup for Minecraft modding follow the instructions [here](moddingSetup.md) to get everything loaded.  You can skip the Minecraft Forge part, as we will cover it below.  
  
  
Create a mod folder to hold all the files.  For simplicity we will add this folder on the desktop and call it BaconMod. The folder may be placed anywhere you know where to find it.  

Open the Minecraft Forge zip file and copy it's contents into the BaconMod folder we just created.  While holding the shift key down, right-click anywhere in the open area of the BaconMod folder.  Click on **Open command window here** from the menu.  

From the command window type (letter cAsE matters!):  

`gradlew setupDecompWorkspace`

Once that completes then type:  

'gradlew eclipse`

The folder is now ready to work on the mod.  

#### Where do I put the BaconMod code?   
The bacon mod code goes in the following folder (which we put on the desktop in our example):  

> BaconMod\src\main

When you initially setup the folder for modding there will be an example mod under the BaconMod\src\main\ folder.  You may delete all the files in that location.

#### I'm done with my changes, how do I package up my mod?
In our BaconMod folder, hold down the shift key, right-click and click on **Open command window here**.

From the command window type (letter cAsE matters!):

`gradlew build`

After the mod has finished compiling, go to 

> BaconMod\build\libs

Locate the file `modid-1.0.jar`.  This is the compiled version of our mod that we can use in Minecraft, but first we need to add all of the asset files to the mod file.  Open the jar file using 7zip (or Winrar).  You should see three items in the file: `META-INF` folder, `thatconference` folder and a `mcmod.info` file.  Go to `BaconMod\src\main\java` and drag the assets folder into the mod file.  Our mod is ready to go!

#### I'm ready to run my mod in Minecraft!
The first thing you need to do is install the Minecraft Forge client.  This makes the necessary modifications to your Minecraft game so that we can use our mod.

Go to [the Minecraft Forge download site](http://files.minecraftforge.net/).  Find the version of Forge for your version of Minecraft (1.7.10) and download the installer for the recommended version.  After the installer has finished downloading, double click on the installer jar file and choose `Install client`.  It should automatically select the appropriate location for your Minecraft installation, but if it doesn't, click on the `...` button and specify the correct path.  Once that is set, click `OK`.  The next step you should see is the installer downloading the necessary libraries to install the Forge client on your machine.  When the installation is complete, you should see a message that the installation was successful.

The next thing we need to do is copy our compiled mod from `BaconMod\build\libs` to the Minecraft mod folder.  Navigate to your Minecraft folder by typing `%appdata%` in the windows run dialog (Windows key + r brings up the "run" dialog).  When that folder opens, you should see a folder called `.minecraft`.  Double click on `.minecraft`.  

You're now in your Minecraft installation folder.  Create a folder called `mods` if it doesn't already exist.  Copy the mod file from `BaconMod\build\libs\modid-1.0.jar` to the `mods` folder.  Rename the file to `BaconMod-0.0.1.jar` or whatever you would like to call your mod file.

Start up Minecraft.  There should be a profile called `Forge` in the Minecraft launcher.  Choose that profile to enable the Forge mod functionality and start the game.  If you did everything correctly, there should be a button called `Mods`.  Click on that button and the list of currently loaded mods should appear.  The BaconMod should be the fourth mod in the list.

Have fun!

If you have questions, the easiest way to contact me is through twitter @pvanhouten.
