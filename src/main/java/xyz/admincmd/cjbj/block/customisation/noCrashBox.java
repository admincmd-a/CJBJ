package xyz.admincmd.cjbj.block.customisation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class noCrashBox extends Block {
    /*
    * 这个方块型通常只用于测试，除某些早期方块*/
    public noCrashBox(AbstractBlock.Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.1f, 0.1f, 0.1f, 0.8f, 0.8f, 0.8f);
    }
}
