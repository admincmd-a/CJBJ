package xyz.admincmd.cjbj.block.custom.master;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import xyz.admincmd.cjbj.errorSet.ERROR;
import xyz.admincmd.cjbj.errorSet.errorSet;
import xyz.admincmd.cjbj.item.ModItem;

/**
 * 一个标准的8向方块，允许旋转45°
 */
public class directional8xBlock extends HorizontalFacingBlock {
    /**
     * 0=> 0°
     * 1=> 45°
     */
    public static final IntProperty ANGLE_TYPE = IntProperty.of("angle", 0, 1);

    public directional8xBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(ANGLE_TYPE, 0));
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ANGLE_TYPE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
            case SOUTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
            case EAST -> VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            case WEST -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        try {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
                if (ModItem.isConfigTool(player, true)) {
                    if (state.get(ANGLE_TYPE) == 1) world.setBlockState(pos, state.with(ANGLE_TYPE, 0));
                    else world.setBlockState(pos, state.with(ANGLE_TYPE, 1));
                    world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                return ActionResult.SUCCESS;
            }
        } catch (Exception e) {
            errorSet.addError(e.getMessage(), 0x000016, ERROR.ERROR_CODE_WARN);
            return ActionResult.PASS;
        }
    }
//    @Override
    // 行走
//    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
//        if (world.getBlockState(pos).get(CHARGED)){
//            // 在方块的位置召唤闪电
//            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(world, SpawnReason.MOB_SUMMONED);
//            lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(pos));
//            world.spawnEntity(lightningEntity);
//        }
//
//        world.setBlockState(pos, state.with(CHARGED, false));
//        super.onSteppedOn(world, pos, state, entity);
//    }
}
