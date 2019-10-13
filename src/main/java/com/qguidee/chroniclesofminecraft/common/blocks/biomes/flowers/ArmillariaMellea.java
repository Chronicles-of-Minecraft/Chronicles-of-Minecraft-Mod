package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ArmillariaMellea extends FlowerBlockWithStages {

    private static final IntegerProperty AGE = IntegerProperty.create("age", 0, 4);

    public ArmillariaMellea() {
        super(4);
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.flowerArmillariaMellea;
    }

    @Nonnull
    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return isLeaves(worldIn.getBlockState(pos.up(2)).getBlock());
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return isLeaves(world.getBlockState(pos.up(2)).getBlock());
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    }

    private boolean isLeaves(Block block) {
        Block[] leaveBlocks = {
                Blocks.ACACIA_LEAVES,
                Blocks.BIRCH_LEAVES,
                Blocks.DARK_OAK_LEAVES,
                Blocks.JUNGLE_LEAVES,
                Blocks.OAK_LEAVES,
                Blocks.SPRUCE_LEAVES,
        };

        for (Block leave : leaveBlocks) {
            if (block == leave)
                return true;
        }

        return false;
    }
}
