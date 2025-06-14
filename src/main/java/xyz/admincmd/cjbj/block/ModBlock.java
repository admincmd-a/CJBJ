/*
76967f67f67
 */

package xyz.admincmd.cjbj.block;

import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import static xyz.admincmd.cjbj.errorSet.errorSet.addError;

import static xyz.admincmd.cjbj.block._var.EXAMPLE_BLOCK_OBJECT;
import static xyz.admincmd.cjbj.block._var.FIRE_DOOR_B_BLOCK_ID;
import static xyz.admincmd.cjbj.errorSet.ERROR.ERROR_CODE_CRITICAL;
import static xyz.admincmd.cjbj.errorSet.ERROR.ERROR_CODE_CRITICAL;
import static xyz.admincmd.cjbj.item.groups._var.MAIN_GROUP;
import static xyz.admincmd.cjbj.main.CONSOLE;
import static xyz.admincmd.cjbj.main.MOD_ID;
import static xyz.admincmd.cjbj.item.ModItem.registerBlockItem;


public class ModBlock {

    /**
     * 注册方块，同时注册物品
     * @param path 方块ID
     * @param block 方块实例
     * @return {@link Block} | {@code null} 注册的方块实例
     * @param <T> 方块类型
     */
    public static <T extends Block> T registerBlock(String path, T block) {
        CONSOLE.debug("Trying to register the Block now: '{}' , Class: {}", path, block.getClass().getName());
        try {
            Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
            registerBlockItem(path); // 注册物品
            return block;
        } catch (Exception e) {
            addError(0, ERROR_CODE_CRITICAL,"Failed to register block: '{}' , Class: {} , Error: '{}'",
                    path, block.getClass().getName(), e.getMessage());
            return null; // 注册失败
        }
    }

    /**
     * 注册方块，可以选择是否注册物品
     * @param path 方块ID
     * @param block 方块实例
     * @param registerItem 是否注册物品
     * @return {@link Block} | {@code null} 注册的方块实例
     * @param <T> 方块类型
     */
    public static <T extends Block> T registerBlock(String path, T block, boolean registerItem) {
        CONSOLE.debug("Trying to register the Block now(isRegisterItem: '{}'): '{}' , Class: {}", registerItem, path, block);
        try {
            Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
            if (registerItem) {
                registerBlockItem(path); // 注册物品
            }
            return block;
        } catch (Exception e) {
            addError(0, ERROR_CODE_CRITICAL,"Failed to register block(isRegisterItem: '{}'): '{}' , Class: {} , Error: '{}'",
                    registerItem, path, block.getClass().getName(), e.getMessage());
            return null;
        }
    }

    /**
     * 注册方块，可以选择是否注册物品
     * @param path 方块ID
     * @param blockClass 方块类（需继承Block）
     * @param registerItem 是否注册物品
     * @return {@link Block} | {@code null} 注册的方块实例
     */
    public static <T extends Block> T registerBlock(String path, Class<T> blockClass, boolean registerItem) {
        CONSOLE.debug("Trying to register the Block now(isRegisterItem: '{}'): '{}' , Class(.class): {}",
            registerItem, path, blockClass.getName());

        try {
            // 通过反射创建方块实例
            T block = blockClass
                .getDeclaredConstructor(AbstractBlock.Settings.class)
                .newInstance(
                        // 所有非特殊控制的方块都使用默认
                        AbstractBlock.Settings.create().strength(16.0f));

            Registry.register(
                Registries.BLOCK,
                Identifier.of(MOD_ID, path),
                block
            );

            if (registerItem) {
                registerBlockItem(path);
            }
            return block;
        } catch (ReflectiveOperationException | IllegalArgumentException e) { // 捕获所有反射异常
            addError(-10, ERROR_CODE_CRITICAL,"Failed to register block(isRegisterItem: '{}'): '{}' , Class(.class): {} , Error: '{}'",
                    blockClass.getName(), e.getMessage());
            return null;
        } catch (Exception e) { // 捕获所有其他异常
            addError(-10, ERROR_CODE_CRITICAL,"Failed to register block(isRegisterItem: '{}'): '{}' , Class(.class): {} , Error: '{}'",
                    registerItem, path, blockClass.getName(), e.getMessage());
            return null;
        }
    }

    /**
     * 注册方块，同时注册物品
     * @param path 方块ID
     * @param blockClass 方块类（需继承Block）
     * @return {@link Block} | {@code null} 注册的方块实例
     */
    public static <T extends Block> T registerBlock(String path, Class<T> blockClass) {
        CONSOLE.debug("Trying to register the Block now: '{}' , Class(.class): {}",
                path, blockClass.getName());

        try {
            // 通过反射创建方块实例
            T block = blockClass
                    .getDeclaredConstructor(AbstractBlock.Settings.class)
                    .newInstance(
                            // 所有非特殊控制的方块都使用默认
                            AbstractBlock.Settings.create()
                                    .strength(16.0f));

            Registry.register(
                    Registries.BLOCK,
                    Identifier.of(MOD_ID, path),
                    block
            );

            registerBlockItem(path);

            return block;
        } catch (ReflectiveOperationException | IllegalArgumentException e) { // 捕获所有反射异常
            addError(-10, ERROR_CODE_CRITICAL,"Failed to register block: '{}' , Class(.class): {} , Error: '{}'",
                    blockClass.getName(), e.getMessage());
            return null;
        } catch (Exception e) { // 捕获所有其他异常
            addError(-10, ERROR_CODE_CRITICAL,"Failed to register block: '{}' , Class(.class): {} , Error: '{}'",path, blockClass.getName(), e.getMessage());
            return null;
        }
    }

    public static Block registerBlock(String path, Block block, String BlockItemToItemGroup) {
        CONSOLE.debug("Trying to register the Block now: '{}' , Class: {} , ItemGroup: {}", path, block.getClass().getName(), BlockItemToItemGroup);
        try {
            Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
            registerBlockItem(path, BlockItemToItemGroup);
            return block;
        } catch (Exception e) { // 捕获所有其他异常
            addError(-10, ERROR_CODE_CRITICAL,"Failed to register block: '{}' , Class(.class): {} , Error: '{}'",path, block.getClass().getName(), e.getMessage());
            return null;
        }
    }

    /**
     * 取到注册的方块实例
     * @param name 方块ID
     * @return {@link Block} | {@code null}
     */
    public static Block getBlock(String name) {
        if (!Registries.BLOCK.containsId(Identifier.of(MOD_ID, name))) {
            CONSOLE.warn("Block not found: '{}'", name);
            return null; // 方块不存在
        }
        return Registries.BLOCK.get(Identifier.of(MOD_ID, name));
    }

    public static void initialize(){
        CONSOLE.info("正在注册方块...");
        _var.initialize();
        CONSOLE.debug("注册方块完成。");
//        final Block  FIRE_DOOR_B_BLOCK_OBJECT               = registerBlock(FIRE_DOOR_B_BLOCK_ID                      , new DoorBlock                          (AbstractBlock.Settings.copy(EXAMPLE_BLOCK_OBJECT), BlockSetType.STONE)          , MAIN_GROUP);

    }


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