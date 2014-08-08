package thatconference.bacon;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.*;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import sun.util.logging.resources.logging;
import thatconference.bacon.items.*;
import thatconference.bacon.blocks.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

// tell forge that this is our mod file
@Mod(modid=ThatConferenceBacon.ModId, name="ThatConferenceBacon", version="0.0.1")
public class ThatConferenceBacon {
	// tell forge this is the instance of our mod
	@Instance(value = "ThatConferenceBacon")
	public static ThatConferenceBacon instance;
	
	public static final String ModId = "thatconferencebacon";
	
	// materials
	//   armor
	private static final int baconArmorMaterialDurability = 70; // how much damage the armor can take before it loses a damage point, leather = 5, diamond = 33 
	private static final int[] baconArmorReductionAmounts = new int[] { 6, 14, 12, 6 }; // how much half armor points delivered { head, chest, legs, feet }
	private static final int baconArmorEnchantability = 10; // levels of enchantability of the armor (Gold = 25, Iron = 9)
	public static final ArmorMaterial BaconArmorMaterial = 
			EnumHelper.addArmorMaterial("BACON", baconArmorMaterialDurability, baconArmorReductionAmounts, baconArmorEnchantability);
	
	//   tools
	private static final int baconToolHarvestLevel = 3; // what this tool can harvest (3 = diamond, 4 = obsidian)
	private static final int baconToolMaxUses = 1500; // how many times it can be used
	private static final float baconToolEfficiency = 10.0F; //
	private static final float baconToolDamage = 9.0F; //
	private static final int baconToolEnchantability = 15; // how many levels of enchantment can be added
	public static final ToolMaterial BaconToolMaterial = 
			EnumHelper.addToolMaterial("BACON", baconToolHarvestLevel, baconToolMaxUses, baconToolEfficiency, baconToolDamage, baconToolEnchantability);
	
	// food
	public static ItemFood RawBaconItem = new RawBacon(2, 10, true);
	public static ItemFood CookedBaconItem = new CookedBacon(5, 30, true);
	
	// tools
	public static ItemAxe BaconAxe = new BaconAxe();
	public static ItemSword BaconSword = new BaconSword();
	public static ItemHoe BaconHoe = new BaconHoe();
	public static ItemPickaxe BaconPickaxe = new BaconPickaxe();
	public static ItemSpade BaconShovel = new BaconShovel();

	// armor (slot: head = 0, chest = 1, legs = 2, feet = 3)
	public static ItemArmor BaconHelmet = new BaconHelmet(); 
	public static ItemArmor BaconPlate = new BaconPlate();
	public static ItemArmor BaconLeggings = new BaconLeggings();
	public static ItemArmor BaconBoots = new BaconBoots();
	
	// records
	public static ItemRecord BaconPancakesRecord = new BaconPancakesRecord();
	
	// blocks
	public static Block BaconBlock = new BaconBlock();
	
	@SidedProxy(clientSide = "thatconference.bacon.client.ClientProxy", serverSide="thatconference.bacon.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.initialize();
		
		// food
		GameRegistry.registerItem(RawBaconItem, "rawBacon");
		GameRegistry.registerItem(CookedBaconItem, "cookedBacon");
		
		// armor
		GameRegistry.registerItem(BaconHelmet, "baconHelmet");
		GameRegistry.registerItem(BaconPlate, "baconPlate");
		GameRegistry.registerItem(BaconLeggings, "baconLeggings");
		GameRegistry.registerItem(BaconBoots, "baconBoots");
		
		// tools
		GameRegistry.registerItem(BaconAxe, "baconAxe");
		GameRegistry.registerItem(BaconSword, "baconSword");
		GameRegistry.registerItem(BaconHoe, "baconHoe");
		GameRegistry.registerItem(BaconPickaxe, "baconPickaxe");
		GameRegistry.registerItem(BaconShovel, "baconShovel");
		
		// records
		GameRegistry.registerItem(BaconPancakesRecord, "baconPancakesRecord");
		
		// shapeless recipes
		GameRegistry.addShapelessRecipe(new ItemStack(RawBaconItem, 4), new ItemStack(Items.porkchop)); // porkchops to 4x bacon
		
		// shaped recipes
		//   armor
		GameRegistry.addShapedRecipe(new ItemStack(BaconHelmet, 1), new Object[] { "BBB", "B B", 'B', CookedBaconItem });
		GameRegistry.addShapedRecipe(new ItemStack(BaconPlate, 1), new Object[] { "B B", "BBB", "BBB", 'B', CookedBaconItem });
		GameRegistry.addShapedRecipe(new ItemStack(BaconLeggings, 1), new Object[] { "BBB", "B B", "B B", 'B', CookedBaconItem });
		GameRegistry.addShapedRecipe(new ItemStack(BaconBoots, 1), new Object[] { "B B", "B B", 'B', CookedBaconItem });
		
		//   tools
		GameRegistry.addShapedRecipe(new ItemStack(BaconAxe, 1), new Object[] { "BB ", "BS ", " S ", 'B', CookedBaconItem, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(BaconSword, 1), new Object[] { " B ", " B ", " S ", 'B', CookedBaconItem, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(BaconHoe, 1), new Object[] { "BB ", " S ", " S ", 'B', CookedBaconItem, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(BaconPickaxe, 1), new Object[] { "BBB", " S ", " S ", 'B', CookedBaconItem, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(BaconShovel, 1), new Object[] { " B ", " S ", " S ", 'B', CookedBaconItem, 'S', Items.stick });
		
		// blocks
		GameRegistry.registerBlock(BaconBlock, "baconBlock");
		GameRegistry.addShapedRecipe(new ItemStack(BaconBlock, 1),  new Object[] { "BBB", "BBB", "BBB", 'B', CookedBaconItem });
		GameRegistry.addShapelessRecipe(new ItemStack(CookedBaconItem, 9), new ItemStack(BaconBlock));
		
		// smelting recipes
		GameRegistry.addSmelting(RawBaconItem, new ItemStack(CookedBaconItem), 0);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// stub
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		// stub
	}
}
