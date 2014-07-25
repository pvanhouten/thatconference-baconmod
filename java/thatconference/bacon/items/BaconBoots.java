package thatconference.bacon.items;

import java.util.UUID;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaconBoots extends ItemArmor {

	public static final UUID BaconBootsMoveBonusUUID = UUID.fromString("bad26167-3094-4a4d-af2c-48e57a248c30");
	public static final AttributeModifier BaconBootsMoveBonus = (new AttributeModifier(BaconBootsMoveBonusUUID, "Bacon Boots Speed Bonus", 0.6D, 2)).setSaved(false);
	
	public BaconBoots() {
		super(ThatConferenceBacon.BaconArmorMaterial, 0, 3); // id = 0, placement = 3 (feet)
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(ThatConferenceBacon.ModId + ":baconBoots");
		setUnlocalizedName("baconBoots");
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return ThatConferenceBacon.ModId + ":textures/models/armor/bacon_layer_1.png";
	}
}
