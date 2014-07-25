package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BaconPlate extends ItemArmor {

	public BaconPlate() {
		super(ThatConferenceBacon.BaconArmorMaterial, 0, 1); // id = 0, placement = 1 (chest)
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(ThatConferenceBacon.ModId + ":baconPlate");
		setUnlocalizedName("baconPlate");
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return ThatConferenceBacon.ModId + ":textures/models/armor/bacon_layer_1.png";
	}

}
