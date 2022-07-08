package mod.acgaming.cie;

import org.apache.commons.lang3.exception.ExceptionUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class CIE implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	@Override
	public void onInitialize() {
		ModLoadingContext.registerConfig(Loader.MODID, ModConfig.Type.COMMON, CIEConfigHandler.SPEC);
		Loader.LOGGER.info("CIE - Fabric Loaded!");
	}
}