package fr.uranoscopidae.crazyscientist.client;

import fr.uranoscopidae.crazyscientist.CrazyScientist;
import fr.uranoscopidae.crazyscientist.CrazyScientistCommonProxy;
import fr.uranoscopidae.crazyscientist.client.renders.RenderCrazyScientistVillager;
import fr.uranoscopidae.crazyscientist.common.entities.EntityCrazyScientistVillager;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class CrazyScientistClientProxy extends CrazyScientistCommonProxy
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        MinecraftForge.EVENT_BUS.register(this);
        RenderingRegistry.registerEntityRenderingHandler(EntityCrazyScientistVillager.class, RenderCrazyScientistVillager::new);
    }

    @Override
    public void init()
    {
        super.init();
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event)
    {
        registerBlockModel(CrazyScientist.MUTANT_MACHINE_BRICKS);
    }

    private void registerBlockModel(Block block)
    {
        ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
    }

    public void registerBlockModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
    }
}
