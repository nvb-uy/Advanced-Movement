package agnya.advanced_movement;

import agnya.advanced_movement.config.AMConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class AdvMovement implements ModInitializer {
	public static final String MOD_ID = "advanced_movement";

	@Override
	public void onInitialize() {
		AutoConfig.register(AMConfig.class, GsonConfigSerializer::new);
	}
}
