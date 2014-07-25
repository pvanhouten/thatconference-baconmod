package thatconference.bacon.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import thatconference.bacon.ThatConferenceBacon;

public class BaconShovel extends ItemSpade {

	public BaconShovel() {
		super(ThatConferenceBacon.BaconToolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(ThatConferenceBacon.ModId + ":baconShovel");
		setUnlocalizedName("baconShovel");
		
	}

}
