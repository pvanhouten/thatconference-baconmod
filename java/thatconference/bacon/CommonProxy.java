package thatconference.bacon;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy {
	public void initialize() {
		FMLCommonHandler.instance().bus().register(new PlayerTickHandler(Minecraft.getMinecraft()));
	}
	
    public void registerRenderers() {
            // Nothing here as the server doesn't render graphics or entities!
    }
}
