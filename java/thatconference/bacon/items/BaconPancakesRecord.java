package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

public class BaconPancakesRecord extends ItemRecord {

	public BaconPancakesRecord() {
		super("BaconPancakes");
		
		setMaxStackSize(1);
		setTextureName(ThatConferenceBacon.ModId + ":baconPancakesRecord");
		setUnlocalizedName("baconPancakesRecord");
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(ThatConferenceBacon.ModId + ":BaconPancakes");
	}

}
