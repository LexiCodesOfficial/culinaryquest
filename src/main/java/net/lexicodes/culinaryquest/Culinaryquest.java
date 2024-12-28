package net.lexicodes.culinaryquest;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Culinaryquest implements ModInitializer {
    public static final String MOD_ID = "culinaryquest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Thank you for downloading CulinaryQuest");
    }
}