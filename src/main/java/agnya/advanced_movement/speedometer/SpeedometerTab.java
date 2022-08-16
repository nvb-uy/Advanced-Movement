package agnya.advanced_movement.speedometer;

import agnya.advanced_movement.AdvMovement;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class SpeedometerTab {
    public static final ItemGroup ADVMOVEMENT = FabricItemGroupBuilder.create(
        new Identifier(AdvMovement.MOD_ID, "main"))
        .icon(() -> new ItemStack(AdvMovement.SPEEDOMETER))
        .build();
}