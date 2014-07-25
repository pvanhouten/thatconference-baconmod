package thatconference.bacon.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import thatconference.bacon.ThatConferenceBacon;

public class BaconPickaxe extends ItemPickaxe {

	public BaconPickaxe() {
		super(ThatConferenceBacon.BaconToolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(ThatConferenceBacon.ModId + ":baconPickaxe");
		setUnlocalizedName("baconPickaxe");
		
	}

}
