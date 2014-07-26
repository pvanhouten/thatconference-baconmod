That Conference Bacon Mod   
=========================   

###Don't go outside; stay inside and make your first Minecraft mod!   
   
   
A reference of applications needed for creating Minecraft mods using Minecraft Forge.  

1. **JRE v.7 (Java Runtime Engine)** 
 1. You will have this if you play Minecraft on your computer
 1. Google JRE 7 Download
 1. Install using the provided installer
1. **JDK v.7 (Java Development Kit)**  
 1. Google Java JDK 7 download  
 1 Install using the provided installer  
1. **Minecraft Forge** ("latest" source (src))
 1. http://files.minecraftforge.net/
 1. See below for installation
1. **Eclipse**
 1. http://www.eclipse.org/downloads/
 1. See below for installation
1. **Paint.net** (for working with assests, images)
 1. http://getpaint.net
 1. Install using provided installer
1. **7zip**
 1. http://www.7-zip.org/download.html
 1. Install using provided installer

It is very important to know if you are running a 32-bit or 64-bit operating system.  
   
To Check from Windows 7 you click on the start button and right-click Computer. From the menu choose **Properies**.

In Windows 8, from the start screen, type **my computer**. When it shows in the search list, right click on it and choose **Properties**  
  
  
#### Installing Eclipse
Inclipse doesn't require an installer.  You basically copy it into a folder and run eclipse.exe.  Wen you open the Eclipse zip file you will see a folder named *eclipse*.  Simply copy this folder into c:\Program Files\ and create a shortcut to eclipse.exe on your desktop or taskbar.  

Simply double-click the shortcut and you are good to go. 

#### Installing Minecraft Forge
Create a folder where you want to create your mod.  For simplicity we are going to create the folder on the desktop and name it BaconMod  

Once you have the folder crated, open the zip file from Minecraft Forge and copy its contents into your BaconMod folder.  
  
Now we need to decompile Minecraft and setup our mod to work with Eclipse.  Don't worry, the Minecraft Forge people made this very simple.  

While holding the shit key down, right-click anywhere in the blank area of the BaconMod folder.  From the menu select **Open command window here**.  This will open a command window and save you the trouble of having to type in the path of where you need to be.  

From the command window type (letter cAsE matters!):  

`gradlew setupDecompWorkspace`  

Once that complete then type this in the command window:  

`gradlew eclipse`

   
   
You are now ready to build some mods!  Open eclipse.  Have eclipse open the Workspace at BaconMod\eclipes and write some code!



