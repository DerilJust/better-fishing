package net.theawesomegem.fishingmadebetter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.theawesomegem.fishingmadebetter.proxy.CommonProxy;

@Mod(ModInfo.MOD_ID)
public class Primary {
    public static Primary Instance;

    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent e) {
        proxy.onPreInit(e);
    }

    @EventHandler
    public void onInit(FMLInitializationEvent e) {
        proxy.onInit(e);
    }

    @EventHandler
    public void onPostInit(FMLPostInitializationEvent e) {
        proxy.onPostInit(e);
    }

    @EventHandler
    public void onServerStarting(FMLServerStartingEvent e){
        proxy.onServerStarting(e);
    }
}
