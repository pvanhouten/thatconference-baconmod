package thatconference.bacon.items;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BaconHelmet extends ItemArmor {

	public BaconHelmet() {
		super(ThatConferenceBacon.BaconArmorMaterial, 0, 0); // id = 0, placement = 0 (head)
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(ThatConferenceBacon.ModId + ":baconHelmet");
		setUnlocalizedName("baconHelmet");
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return ThatConferenceBacon.ModId + ":textures/models/armor/bacon_layer_1.png";
	}

}
