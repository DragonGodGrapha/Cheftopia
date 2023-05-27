package net.grapha.cheftopia;

import net.fabricmc.api.ModInitializer;
import net.grapha.cheftopia.item.ModItems;
import net.grapha.cheftopia.util.ModLootTableModifiers;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Cheftopia implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "cheftopia";
	public static final Logger LOGGER = LoggerFactory.getLogger("cheftopia");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading "+MOD_ID);
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();

	}

}
