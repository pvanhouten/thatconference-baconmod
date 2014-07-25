package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BaconLeggings extends ItemArmor {

	public BaconLeggings() {
		super(ThatConferenceBacon.BaconArmorMaterial, 0, 2); // id = 0, placement = 2 (legs)
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(ThatConferenceBacon.ModId + ":baconLeggings");
		setUnlocalizedName("baconLeggings");
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return ThatConferenceBacon.ModId + ":textures/models/armor/bacon_layer_2.png";
	}

}
