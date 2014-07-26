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

When you initially setup the folder for modding there will be an example mod under the BaconMod\src\main\ folder.  You may delete all the files 