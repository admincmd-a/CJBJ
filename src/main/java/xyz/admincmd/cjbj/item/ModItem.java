package xyz.admincmd.cjbj.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import xyz.admincmd.cjbj.CJBJ2;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.admincmd.cjbj.item.groups.ModItemGroups;
import xyz.admincmd.cjbj.main;

import java.util.Objects;

import static xyz.admincmd.cjbj.item._var.CONFIG_TOOL_MODE;
import static xyz.admincmd.cjbj.main.*;

public class ModItem {
    /**
     * 注册物品
     * @param path 物品 ID
     * @param item 物品实例
     * @return 注册后的物品实例
     * @param <T> 物品
     */
    public static <T extends Item> T registerItem(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        CONSOLE.debug("Trying to register the Item now, ID: '{}'", path);
        try {
            return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), item);
        } catch (Exception e) {
            CONSOLE.error("Failed to register the Item, ID: '{}', Error:{}", path, e.getMessage());
            return null;
        }
    }

    /**
     * 注册方块对应的物品
     * @param block 方块 ID
     * @return 对应物品
     */
    public static Item registerBlockItem(String block) {
        CONSOLE.debug("Trying to register the BlockItem now, Block & Item (ID): '{}'", block);
        try {
            return Registry.register(Registries.ITEM,
                new Identifier(MOD_ID,block),
                new BlockItem(
                        Registries.BLOCK.get(new Identifier(MOD_ID,block)), // 这里需要用Registries.BLOCK.get()获取Block实例
                        new FabricItemSettings()
                )
            );
        } catch (Exception e) {
            CONSOLE.error("Failed to register the BlockItem, Block: '{}', Error:{}", block, e.getMessage());
            return null;
        }
    }

    /**
     * 注册方块对应的物品
     * @param block 方块实例
     * @return 对应物品
     */
    public static Item registerBlockItem(Block block) {
        CONSOLE.debug("Trying to register the BlockItem now, Block & Item (Class): {}", block.getName());
        try {
            return Registry.register(Registries.ITEM,
                new Identifier(MOD_ID,
                        Registries.BLOCK.getId(Blocks.STONE).getPath()
                ),
                new BlockItem(
                        block,
                        new FabricItemSettings()
                )
            );
        } catch (Exception e) {
            CONSOLE.error("Failed to register the BlockItem, Block(Class): {}, Error:{}", block.getName(), e.getMessage());
            return null;
        }
    }

    /**
     * 注册方块对应的物品
     * @param block 方块 ID
     * @param ItemGroup 物品组
     * @return 对应物品
     */
    public static Item registerBlockItem(String block, String ItemGroup) {
        CONSOLE.debug("Trying to register the BlockItem now, Block & Item (ID): '{}', ItemGroup: '{}'", block, ItemGroup);
        try {
            Item ItemObj = Registry.register(Registries.ITEM,
                new Identifier(MOD_ID,block),
                new BlockItem(
                        Registries.BLOCK.get(new Identifier(MOD_ID,block)), // 这里需要用Registries.BLOCK.get()获取Block实例
                        new FabricItemSettings()
                )
            );
            ModItemGroups.addItemToItemGroup(block, ItemGroup);
            return ItemObj;
        } catch (Exception e) {
            CONSOLE.error("Failed to register the BlockItem, Block (ID): '{}', Error: {}", block, e.getMessage());
            return null;
        }
    }
    /**
     * 获取物品实例
     * @param name 物品 ID
     * @return {@code Item} | {@code null} 物品实例，如没有该物品，返回 null
     */
    public static Item getItem(String name) {
        if (Registries.ITEM.containsId(Identifier.of(MOD_ID,name))) { // 检查注册表中是否存在该物品
            CONSOLE.warn("Item '{}' already exists, please check the registry.", name);
            return null;
        }
        return Registries.ITEM.get(Identifier.of(MOD_ID, name));
    }

    public static void initialize() {
        CONSOLE.info("正在注册物品...");
        _var.initialize();
    }
    

    /*
    // 新物品的实例
    // 对于 1.20.4 以下版本
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    // 对于 1.20.5 之后，1.21.2 之前的版本
    public static final Item CUSTOM_ITEM = new Item(new Item.Settings());

    // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        Registry.register(Registries.ITEM, Identifier.of("tutorial", "custom_item"), CUSTOM_ITEM);
     */
}
