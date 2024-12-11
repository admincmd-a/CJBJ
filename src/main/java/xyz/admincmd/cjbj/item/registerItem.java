package xyz.admincmd.cjbj.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import xyz.admincmd.cjbj.CJBJ2;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static xyz.admincmd.cjbj.CJBJ2.INFO_LOG;
import static xyz.admincmd.cjbj.CJBJ2.MOD_ID;
import static xyz.admincmd.cjbj.item.itemComponentList.allItemComponents;

public class registerItem {

    public static Item registerItem(String name) {
        INFO_LOG.debug("Trying to register the Block Item now: " + name);
        return Registry.register(Registries.ITEM, new Identifier(CJBJ2.MOD_ID, name),
                new Item(new FabricItemSettings()));
    }

    public static void registerAllItems(String[] names) {
        for (String name : names) {
            registerItem(name);
        }
        // 通过数组传入的名称，注册方块
    }
    public static Item registreBlockItem(String block) {
        INFO_LOG.debug("Try to register the Block Item, Block:"+ block);
        return Registry.register(Registries.ITEM,
                new Identifier(CJBJ2.MOD_ID,block),
                new BlockItem(
                        Registries.BLOCK.get(new Identifier(MOD_ID,block)), // 这里需要用Registries.BLOCK.get()获取Block实例
                        new FabricItemSettings()));
    }
    public static void initializeModItems() {
        INFO_LOG.info("正在注册物品...");
        registerAllItems(allItemComponents);

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
