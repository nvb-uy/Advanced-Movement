package agnya.advanced_movement.utilities;

import agnya.advanced_movement.speedometer.SpeedometerTab;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class BhoppingItem extends BlockItem {

    public BhoppingItem(Block block, Settings settings) {
        super(block, settings
        .group(SpeedometerTab.ADVMOVEMENT));
    }
    @Override
    public void appendTooltip(ItemStack itemstack, World world, java.util.List<Text> tooltip, TooltipContext context) {
        tooltip.add(new LiteralText("\u00A77"+"Teleports the player to their spawnpoint if they stay on top of the block. Forcing them to keep jumping"));
    }
}