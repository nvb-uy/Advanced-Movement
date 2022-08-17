package agnya.advanced_movement.speedometer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Speedometer extends Item {
    public Speedometer() {
        super(new Item.Settings()
        .group(SpeedometerTab.ADVMOVEMENT)
        .maxCount(1)
        .rarity(Rarity.UNCOMMON)
        );
    }
	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean onhand) {
		super.inventoryTick(itemstack, world, entity, slot, onhand);
		
        if (onhand) {
            if (entity == null) {
                return;
            }
            double vectorialSpeed = new Vec3d(entity.getVelocity().x, 0.0F, entity.getVelocity().z).length();
            double bpsSpeed = (Math.floor((vectorialSpeed)*100)/100.0D)*20.04D;
            
            if (entity instanceof PlayerEntity player && world.isClient) {
                player.sendMessage(new LiteralText("\u00A7a"+String.format("%.2f", bpsSpeed)+" blocks/s"), true);
            }
        }
    }
}