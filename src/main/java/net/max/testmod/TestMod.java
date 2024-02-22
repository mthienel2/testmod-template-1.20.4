package net.max.testmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.max.testmod.Item.ModItems;
import net.max.testmod.Item.ModItemGroups;
import net.max.testmod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		CompostingChanceRegistry.INSTANCE.add(ModItems.ONION_SEEDS,0.1F);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ONION, 0.4f);
	}
}