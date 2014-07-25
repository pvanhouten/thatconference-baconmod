package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CookedBacon extends ItemFood {

	public CookedBacon(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setAlwaysEdible();
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("cookedBacon");
		setTextureName(ThatConferenceBacon.ModId + ":cookedBacon");
	}

}
