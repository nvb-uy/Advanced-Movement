package agnya.advanced_movement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import agnya.advanced_movement.config.AMConfig;
import agnya.advanced_movement.speedometer.Speedometer;
import agnya.advanced_movement.utilities.BhoppingBlock;
import agnya.advanced_movement.utilities.BhoppingItem;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvMovement implements ModInitializer {
	public static final String MOD_ID = "advanced_movement";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	public static final Item SPEEDOMETER = new Speedometer();
	
	public static final Block BHOPPING_BLOCK = new BhoppingBlock();
	public static final BlockItem BHOPPING_BLOCK_ITEM = new BhoppingItem(BHOPPING_BLOCK);
	
	@Override
	public void onInitialize() {
		AutoConfig.register(AMConfig.class, GsonConfigSerializer::new);
		LOGGER.info("Advanced Movement Loaded Sucessfully!");

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "speedometer"), SPEEDOMETER);

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bunnyhop_platform"), BHOPPING_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bunnyhop_platform"), BHOPPING_BLOCK_ITEM);
	}
}
