#Presentation Notes
##Environmental Setup
1. JDK v7
1. Eclipse (Luna or Kepler)
1. Minecraft Forge (Installer and Src)
1. Paint.NET
1. WinRAR (or 7Zip)
1. Minecraft (v1.7.10)


##Set up our workspace
- Download Eclipse
- Download Forge
- Run Forge installer for Minecraft Client
- Extract Forge src to folder on desktop
 - From command line in forge folder: 
  - `gradlew setupDecompWorkspace`
  - `gradlew eclipse`
- Open Eclipse and set workspace folder to [Forge Folder]\eclipse
- Import code templates (Window -> Preferences -> Java -> Editor -> Templates -> Import)
- Show empty parent packages (Package Explorer dropdown -> Filters -> uncheck 'Empty Parent Packages')


##Mod Structure
- 4 main files:
 - Main mod file (where all our code goes)
 - Client proxy (client specific code)
 - Common proxy (server specific code)
 - mcmod.info (details about or mod shown within Minecraft)


## Demo 1 - Mod shell
Package naming conventions:
- assets.[modid]...
- [modid].items...

Add packages:

- assets.thatconferencebacon
- assets.thatconferencebacon.lang
- assets.thatconferencebacon.sounds
- assets.thatconferencebacon.textures.blocks
- assets.thatconferencebacon.textures.items
- assets.thatconferencebacon.textures.models.armor
- thatconferencebacon
- thatconferencebacon.blocks
- thatconferencebacon.client
- thatconferencebacon.items

Add files:

1. Package: thatconferencebacon.client
 1. ClientProxy.java `demo1ClientProxy`
1. Package: thatconferencebacon
 1. CommonProxy.java `demo1CommonProxy`
 1. ThatConferenceBacon.java `demo1ModClass`
1. main/resources
 1. mcmod.info `demo1McModInfo`

###Run the game to show that mod is now appearing in Minecraft with our mcmod.info details in it.


##Demo 2 - Bacon Item
Add files:

1. Package: thatconferencebacon.items
 1. RawBacon.java `demo2RawBaconClass`

Update files:

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo2ItemInstantiation`
  1. In preInit `demo2ModPreInit`

### Run the game to show the bacon item in the game with busted image

Add files:

1. Package: assets.thatconferencebacon.textures.items
 1. rawBacon.png

### Run the game to show image appearing in the game with correct image


##Demo 4 - Language file
Add files:

1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo4LanguageFile`


##Demo 5 - Recipes
Intro: Shapeless, Shaped, Smelting

Update files:

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In preInit `demo5Recipe`

### Run the game to show that you can make raw bacon from porkchops


##Demo 6 - Smelting recipe
Intro: Let's cook some bacon!

Add files

1. Package: thatconferencebacon.items
 1. CookedBacon.java `demo6CookedBaconClass`
1. Package: assets.thatconferencebacon.items
 1. cookedBacon.png

Update files:

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo6CookedBaconInstance`
  1. In preInit `demo6RegisterCookedBacon`, `demo6Smelting`
1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo6Language`

### Run the game to show cooking some bacon


##Demo 7 - Armor
Intro: Materials
 - Durability: How much damage can the armor take before it loses a damage point?
 - Reductions: How many half-armor points are delivered by each piece of armor?
 - Enchantability: Number of levels the armor can be enchanted

Add files

1. Package: thatconferencebacon.items
 1. BaconBoots.java `demo7BaconBoots`
 1. BaconHelmet.java `demo7BaconHelmet`
 1. BaconLeggings.java `demo7BaconLeggings`
 1. BaconPlate.java `demo7BaconPlate`
1. Package: assets.thatconferencebacon.textures.items
 1. baconBoots.png
 1. baconHelmet.png
 1. baconLeggings.png
 1. baconPlate.png
1. Package: assets.thatconferencebacon.textures.models.armor
 1. bacon_layer_1.png
 1. bacon_layer_2.png

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo7ArmorMaterial`, `demo7InstantiateArmor`
  1. In preInit `demo7RegisterArmor`
1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo7Language`

### Run the game to show that the armor is available


##Demo 8 - Shaped Recipes
Intro:
- Recipe format: Top row items, middle row items, bottom row items, [letter], [item to replace with the letter]
- Example: "B B", "BBB", "BBB", 'B', CookedBaconItem

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In preInit `demo8ShapedRecipes`

### Run the game to show crafting of armor from bacon


##Demo 9 - Blocks
Add files

1. Package: thatconferencebacon.blocks
 1. BaconBlock.java `demo9BaconBlock`
1. Package: assets.thatconferencebacon.blocks
 1. baconBlock.png

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo9InstantiateBaconBlock`
  1. In preInit `demo9RegisterBlock`, `demo9Recipes`
1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo9Language`

### Run the game to show creation of the bacon block from cooked bacon


##Demo 10 - Tools
Intro: Tool Material
- Harvest level: What can this tool harvest (3 = diamond, 4 = obsidian)
- Maximum uses: How many times the tool can be used before it breaks
- Tool efficiency: How well the tool works
- Tool damage: Determines the attack damage for the tool
- Enchantability: Number of levels the armor can be enchanted

Add files

1. Package: thatconferencebacon.items
 1. BaconAxe.java `demo10BaconAxeClass`
 1. BaconHoe.java `demo10BaconHoeClass`
 1. BaconPickaxe.java `demo10BaconPickaxeClass`
 1. BaconShovel.java `demo10BaconShovelClass`
 1. BaconSword.java `demo10BaconSwordClass`
1. Package: assets.thatconferencebacon.textures.items
 1. baconAxe.png
 1. baconHoe.png
 1. baconPickaxe.png
 1. baconShovel.png
 1. baconSword.png

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo10InstantiateTools`, `demo10ToolMaterial`
  1. In preInit `demo10RegisterTools`, `demo10Recipes`
1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo10Language`

### Run the game to show creation of the tools and their crafting


##Advanced Topics

##Demo 11 - Tick Handlers
Intro: Ticks = events that happen many times per second that you can hook into to perform an action

Add files

1. Package: thatconferencebacon
 1. PlayerTickHandler.java `demo11PlayerTickHandlerClass`

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In preInit `demo11ModPreInit`
 1. CommonProxy.java
  1. In initialize `demo11CommonProxyInitialize`
1. Package: thatconferencebacon.items
 1. BaconBoots.java
  1. In class `demo11BaconBootProperties`

### Run the game to show that wearing the boots gives us a boost of speed and we slow back down when we take them off


##Demo 12 - Sounds
Add files

1. Package: thatconferencebacon.items
 1. BaconPancakesRecord.java `demo12BaconPancakesRecord`
1. Package: assets.thatconferencebacon.textures.items
 1. baconPancakesRecord.png
1. Package: assets.thatconferencebacon
 1. sounds.json `demo12SoundsJson`
1. Package: assets.thatconferencebacon.sounds
 1. BaconPancakes.ogg

Update files

1. Package: thatconferencebacon
 1. ThatConferenceBacon.java
  1. In mod class `demo12InstantiateRecord`
  1. In preInit `demo12RegisterRecord`
1. Package: assets.thatconferencebacon.lang
 1. en_US.lang `demo12Language`

### Start bumping some bacon pancakes


##Demo 13 - Packaging our mod
1. Command prompt in forge directory, run `gradlew build`
1. Rename resulting jar file
1. Open jar and copy in assets folder
