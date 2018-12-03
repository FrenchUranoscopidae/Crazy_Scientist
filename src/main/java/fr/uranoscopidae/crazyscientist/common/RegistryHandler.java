package fr.uranoscopidae.crazyscientist.common;

import fr.uranoscopidae.crazyscientist.CrazyScientist;
import fr.uranoscopidae.crazyscientist.common.entities.EntityCrazyScientistVillager;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

public class RegistryHandler
{
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(CrazyScientist.MUTANT_MACHINE_BRICKS);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event)
    {
        ItemBlock mutantMachineBricksItem = new ItemBlock(CrazyScientist.MUTANT_MACHINE_BRICKS);
        mutantMachineBricksItem.setRegistryName(CrazyScientist.MUTANT_MACHINE_BRICKS.getRegistryName());
        event.getRegistry().registerAll(mutantMachineBricksItem);
    }

    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityEntry> event)
    {
        EntityEntry crazyScientistVillagerEntry = EntityEntryBuilder.<EntityCrazyScientistVillager>create()
                .entity(EntityCrazyScientistVillager.class)
                .id(new ResourceLocation(CrazyScientist.MODID, "crazyscientistvillager"), 0)
                .name("crazyscientist.crazyscientistvillager")
                .tracker(64, 3, true)
                .factory(EntityCrazyScientistVillager::new)
                .egg(0, 0)
                .build();
        event.getRegistry().register(crazyScientistVillagerEntry);
    }
}
