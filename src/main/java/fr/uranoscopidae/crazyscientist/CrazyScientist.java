package fr.uranoscopidae.crazyscientist;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = CrazyScientist.MODID, name = CrazyScientist.NAME, version = CrazyScientist.VERSION)
public class CrazyScientist
{
    public static final String MODID = "crazyscientist";
    public static final String NAME = "Crazy Scientist";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
