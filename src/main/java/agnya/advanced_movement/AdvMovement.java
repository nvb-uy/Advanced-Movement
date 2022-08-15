package agnya.advanced_movement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agnya.advanced_movement.config.AMConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class AdvMovement implements ModInitializer {
	public static final String MOD_ID = "advanced_movement";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override
	public void onInitialize() {
		AutoConfig.register(AMConfig.class, GsonConfigSerializer::new);
		LOGGER.info("Advanced Movement Loaded Sucessfully!");
	}
}
