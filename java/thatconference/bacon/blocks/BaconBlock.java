package thatconference.bacon.blocks;

import thatconference.bacon.ThatConferenceBacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaconBlock extends Block {

	public BaconBlock() {
		super(Material.ice);
		setHardness(25.0F); // 0.5 is dirt, 50.0 is obsidian
		setStepSound(soundTypeSnow);
		setBlockName("baconBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 0);
		setBlockTextureName(ThatConferenceBacon.ModId + ":baconBlock");
	}

}
