package thatconference.bacon;

import thatconference.bacon.items.BaconBoots;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;

public class PlayerTickHandler {
	private Minecraft _mc;
	
	public PlayerTickHandler(Minecraft mc) {
		_mc = mc;
	}

	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event) {
		// this happens on every tick (20x per second)
		EntityClientPlayerMP player = _mc.thePlayer;

		IAttributeInstance movement = player.getEntityAttribute(SharedMonsterAttributes.movementSpeed); 
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() instanceof BaconBoots) {
			// if they're wearing bacon boots and they don't have the move bonus applied, then apply it
			if (movement.getModifier(BaconBoots.BaconBootsMoveBonusUUID) == null) {
				movement.applyModifier(BaconBoots.BaconBootsMoveBonus);
			}
		}
		else {
			// if they're not wearing bacon boots and they have the move bonus applied, then remove it
			if (movement.getModifier(BaconBoots.BaconBootsMoveBonusUUID) != null) {
				movement.removeModifier(BaconBoots.BaconBootsMoveBonus);
			}
		}
	}
}
