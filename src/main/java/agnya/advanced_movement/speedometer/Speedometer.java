package agnya.advanced_movement.speedometer;

import net.minecraft.item.Item;

public class Speedometer extends Item {
    public Speedometer() {
        super(new Item.Settings()
        .group(SpeedometerTab.ADVMOVEMENT)
        .maxCount(1)
        );
    }
}