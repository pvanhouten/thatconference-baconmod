package thatconference.bacon.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import thatconference.bacon.ThatConferenceBacon;

public class BaconHoe extends ItemHoe {

	public BaconHoe() {
		super(ThatConferenceBacon.BaconToolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(ThatConferenceBacon.ModId + ":baconHoe");
		setUnlocalizedName("baconHoe");
		
	}

}
