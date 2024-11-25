package admincmd.cjbj.registry;

import admincmd.cjbj.CJBJ;
import admincmd.cjbj.registry.block.blockitem1;
import admincmd.cjbj.registry.block.block1;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
//import net.minecraft.r

import static admincmd.cjbj.CJBJ.*;


public class ModBlocks {
//    public static final Block CITRINE_BLOCK = registerModBlocks("citrine_block",
//            new Block(FabricBlockSettings.create().strength(4.0f)));

    public static void registerModBlockItems() {
        LOGGER.info("Mod 城建不建 正在注册方块Items,MOD_ID：" + CJBJ.MOD_ID);
        blockitem1.block1 ();
    }

    public static void registerModBlocks() {
        // 对于 1.21 以下版本：
        // Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
        // 对于 1.21 之后的版本：
        //Registry.register(Registries.BLOCK, Identifier.of("tutorial", "example_block"), EXAMPLE_BLOCK);

        //Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), new Block(Block.Settings.create().strength(4.0f)));

        // 对于 1.20.5 以下版本：
//        Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"),
  //              new BlockItem(new Block(Block.Settings.create().strength(4.0f)), new FabricItemSettings()));

        // 对于 1.21 以下版本：
        // Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings()));
        // 对于 1.21 之后的版本：
        //Registry.register(Registries.ITEM, Identifier.of("tutorial", "example_block"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings()));


        LOGGER.info("Mod 城建不建 正在注册方块,MOD_ID：" + CJBJ.MOD_ID);
        block1.rblock1 ();

//        @Override
//        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
//            return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.0f, 0.5f);





        //Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(new Block(Block.Settings.create().strength(4.0f)), new FabricItemSettings()));

    }
}