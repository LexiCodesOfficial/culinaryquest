package net.lexicodes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CulinaryQuest implements ModInitializer {
	public static final String MOD_ID = "culinary-quest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Thank you for downloading Culinary Quest");
		ModItems.initialize();
	}
}