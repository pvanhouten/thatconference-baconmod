package thatconference.bacon.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import thatconference.bacon.ThatConferenceBacon;

public class BaconAxe extends ItemAxe {

	public BaconAxe() {
		super(ThatConferenceBacon.BaconToolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(ThatConferenceBacon.ModId + ":baconAxe");
		setUnlocalizedName("baconAxe");
		
	}

}
