package agnya.advanced_movement.utilities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BhoppingBlock extends Block {
    // make block in tab
    public BhoppingBlock() {
        super(Settings.of(Material.STONE)
        .strength(1.0F, 1.0F)
        );
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        // TODO: After the entity touches the block, wait 2 ticks and check if the entity is still touching the block, if so, teleport the entity to their spawnpoint.
        if (entity instanceof PlayerEntity player) {
            if (world.isClient) {
                player.sendMessage(new LiteralText("test"), false);
            }
            // TODO: Check stuff
            
            /*
            if (!Keyboard.isKeyDown(KeyBindingHelper.getBoundKeyOf(KeyBinding.MOVEMENT_CATEGORY.))) {
                // todo
            } */
        } 
    }
}
