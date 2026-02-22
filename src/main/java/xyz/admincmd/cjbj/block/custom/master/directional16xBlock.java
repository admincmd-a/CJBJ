package xyz.admincmd.cjbj.block.custom.master;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
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

import java.util.Objects;

import static xyz.admincmd.cjbj.main.CONSOLE;
import static xyz.admincmd.cjbj.item._var.CONFIG_TOOL_MODE;

/**
 * 一个标准的16向方块，允许其在45度和22.5度方向旋转。
 */
public class directional16xBlock extends HorizontalFacingBlock {
    /**
     * 0=> 0°
     * 1=> 22.5°
     * 2=> 45°
     */
    public static final IntProperty ANGLE_TYPE = IntProperty.of("angle", 0, 2);

    public directional16xBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getDefaultState().with(ANGLE_TYPE, 0));
    }

//    @Override
//    protected MapCodec<? extends VerticalSlabBlock> getCodec() {
//        return CODEC;
//    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
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
        return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    // 对于 1.20.5 以下版本，方法参数应该是“BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit”
    // BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        try {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
//            boolean activated = state.get(ANGLE_TYPE, 0);


                // 判断是否为工具类物品
                if (ModItem.isConfigTool(player, true)) {
                    switch (state.get(ANGLE_TYPE)) { // 切换不同角度
                        case 0 -> world.setBlockState(pos, state.with(ANGLE_TYPE, 1));
                        case 1 -> world.setBlockState(pos, state.with(ANGLE_TYPE, 2));
                        case 2 -> world.setBlockState(pos, state.with(ANGLE_TYPE, 0));
                        default -> {
                            errorSet.addError(
                                    0x000016,
                                    ERROR.ERROR_CODE_WARN,
                                    "Invalid angle type {}",
                                    state.get(ANGLE_TYPE)
                            );
                        }
                    }
                    world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                return ActionResult.SUCCESS;
            }
        } catch (Exception e) {
            errorSet.addError(e.getMessage(), 0x000016, ERROR.ERROR_CODE_WARN);
            return ActionResult.PASS;
        }
    }
}
