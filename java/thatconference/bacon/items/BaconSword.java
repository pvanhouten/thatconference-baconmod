package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BaconSword extends ItemSword {

	public BaconSword() {
		super(ThatConferenceBacon.BaconToolMaterial);
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(ThatConferenceBacon.ModId + ":baconSword");
		setUnlocalizedName("baconSword");
		
	}

}
