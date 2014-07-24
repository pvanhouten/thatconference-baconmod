package thatconference.bacon;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import thatconference.bacon.items.CookedBacon;
import thatconference.bacon.items.RawBacon;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="ThatConferenceBacon", name="ThatConferenceBacon", version="0.0.1")
public class ThatConferenceBacon {
	@Instance(value = "ThatConferenceBacon")
	public static ThatConferenceBacon instance;
	
	// food
	public static ItemFood rawBaconItem;
	public static ItemFood cookedBaconItem;
	
	@SidedProxy(clientSide = "thatconference.bacon.client.ClientProxy", serverSide="thatconference.bacon.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// food
		rawBaconItem = new RawBacon(2, 10, true);
		cookedBaconItem = new CookedBacon(5, 30, true);
		
		GameRegistry.registerItem(rawBaconItem, "rawBacon");
		GameRegistry.registerItem(cookedBaconItem, "cookedBacon");
		
		// recipes
		// porkchops to 4x bacon
		GameRegistry.addShapelessRecipe(new ItemStack(rawBaconItem, 4), new ItemStack(Items.porkchop));
		
		// smelting
		GameRegistry.addSmelting(rawBaconItem, new ItemStack(cookedBaconItem), 0);
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
