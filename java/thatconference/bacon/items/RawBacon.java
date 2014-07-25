package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RawBacon extends ItemFood {
	public RawBacon(int hunger, float saturation, boolean wolfFood) {
		super(hunger, saturation, wolfFood);
		this.setAlwaysEdible();
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabFood);
		setUnlocalizedName("rawBacon");
		setTextureName(ThatConferenceBacon.ModId + ":rawBacon");
	}
}
