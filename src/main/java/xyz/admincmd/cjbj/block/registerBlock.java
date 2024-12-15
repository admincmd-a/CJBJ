/*
76967f67f67
 */

package xyz.admincmd.cjbj.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.admincmd.cjbj.CJBJ2;

import static net.minecraft.block.Blocks.register;
import static xyz.admincmd.cjbj.CJBJ2.INFO_LOG;
import xyz.admincmd.cjbj.block.customisation.*;

public class registerBlock {
    public static void registerAllBlocks(String[] names,String[] NoCrashBoxNames) {
        for (String name : names) {
            INFO_LOG.debug("Registering block: {}", name);
            registerBlocks(name);
        }
        for (String NoCrashBoxName : NoCrashBoxNames) {
            INFO_LOG.debug("Registering block[NoCrashBox]: {}", NoCrashBoxName);
            registerBlocksNoCrashBox(NoCrashBoxName);
        }
        // 通过数组传入的名称，注册方块
    }
        //System.out.println("Registering block: " + name);
    public static Block registerBlocksNoCrashBox(String name){
        // 这里是注册不带碰撞箱的方块
        INFO_LOG.debug("Trying to register the Block now[NoCrashBox]: {}", name);
        Block block = Registry.register(Registries.BLOCK,
                new Identifier(CJBJ2.MOD_ID, name),
                new noCrashBox(FabricBlockSettings.create().strength(4.0f)));
        xyz.admincmd.cjbj.item.registerItem.registreBlockItem(name); // 注册物品
        return block;
        // 这里是注册方块的，顺便注册了对应的物品
    }
    //带有碰撞箱的方块
    public static Block registerBlocks(String name){
        INFO_LOG.debug("Trying to register the Block now: {}", name);
        Block block = Registry.register(Registries.BLOCK,
                new Identifier(CJBJ2.MOD_ID, name),
                new Block(FabricBlockSettings.create().strength(4.0f)));
        xyz.admincmd.cjbj.item.registerItem.registreBlockItem(name); // 注册物品
        return block;
        // 这里是注册方块的，顺便注册了对应的物品
    }
//    public static Block registerSTRblock (String name,) {
//        INFO_LOG.debug(".Trying to register the Block now: {}", name);
//        Block block = Registry.register(Registries.BLOCK,
//                new Identifier(CJBJ2.MOD_ID, name),
//                new STR(FabricBlockSettings.create().strength(4.0f)));
//
//        xyz.admincmd.cjbj.item.registerItem.registreBlockItem(name); // 注册物品
//        return block;
//    }

    public static void initializeModBlocks(){
        INFO_LOG.info("正在注册方块...");
        registerAllBlocks(allBlockComponents,allBlockComponentsNoCrashBox);


        //Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "railroad_car_stopper_b"), new railroadCarStopperB(FabricBlockSettings.create().strength(4.0f)));
//      Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), new Block(FabricBlockSettings.create().strength(4.0f)));
    }
    public static final Block COLOR_BLOCK = register("color_block", new Block(AbstractBlock.Settings.create()));

    /*
       声明和初始化我们的自定义方块实例。
       我们将方块材质（material）设置为 METAL（金属）。

       `strength` 会将方块的硬度和抗性设为同一个值。
       硬度决定了方块需要多久挖掘，抗性决定了方块抵御爆破伤害（如爆炸）的能力。
       石头的硬度为 1.5f，抗性为 6.0f，黑曜石的硬度为 50.0f，抗性为 1200.0f。

       可以在`Blocks`类中查找所有原版方块，你可以以此作为参考。

    // 对于 1.20 以下版本：
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    // 对于 1.20.5 以下版本：
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.create().strength(4.0f));
    // 对于自 1.20.5 之后、1.21.2 以前的版本：
    public static final Block EXAMPLE_BLOCK = new Block(Block.Settings.create().strength(4.0f));
     // 对于 1.21 以下版本：-------------
        // Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("tutorial", "example_block"), new Block(FabricBlockSettings.create().strength(4.0f)));
        // 对于 1.21 之后的版本：
        Registry.register(Registries.BLOCK, Identifier.of("tutorial", "example_block"), EXAMPLE_BLOCK);
    */
    // 下面是带碰撞箱的方块

    public static String[] allBlockComponents = {
            "warning_sign_a",
            "warning_sign_b",
            "warning_sign_c",
            "warning_sign_d",
            "warning_sign_e",
            "warning_sign_f",
            "warning_sign_g",
            "warning_sign_h",
            "warning_sign_i",

    };
    // 这里是不带碰撞箱的方块
    public static String[] allBlockComponentsNoCrashBox = {
            "railroad_car_stopper_a",
            "railroad_car_stopper_b",
            "guardrails_a",

    };
}
