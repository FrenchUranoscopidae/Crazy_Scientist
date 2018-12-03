package fr.uranoscopidae.crazyscientist;

import fr.uranoscopidae.crazyscientist.common.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = CrazyScientist.MODID, name = CrazyScientist.NAME, version = CrazyScientist.VERSION, acceptedMinecraftVersions = "1.12.2")
public class CrazyScientist
{
    public static final String MODID = "crazyscientist";
    public static final String NAME = "Crazy Scientist";
    public static final String VERSION = "1.0";

    @Mod.Instance(CrazyScientist.MODID)
    public static CrazyScientist instance;
    @SidedProxy(clientSide = "fr.uranoscopidae.hatedmobs.client.MosquitoClientProxy", serverSide = "fr.uranoscopidae.hatedmobs.server.MosquitoServerProxy")
    public static CrazyScientistCommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new RegistryHandler());
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
