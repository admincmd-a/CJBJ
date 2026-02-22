package xyz.admincmd.cjbj.item.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.admincmd.cjbj.CJBJ2;
import xyz.admincmd.cjbj.errorSet.ERROR;

import java.sql.Date;
import java.sql.Time;

import static xyz.admincmd.cjbj.main.CONSOLE;
import static xyz.admincmd.cjbj.main.MOD_ID;
import static xyz.admincmd.cjbj.item.ModItem.getItem;
import static xyz.admincmd.cjbj.item._var.CONFIG_TOOL_ID;

public class ModItemGroups {
    private static final int itemGroupsMax  = 16; // 最大物品组数量
    private static final int itemGroupsItemMax = 999;
    private static Item[][]  itemGroupsMen  = new Item[itemGroupsMax][itemGroupsItemMax]; // 物品组数组
    private static String[]  itemGroupsIcon = new String[itemGroupsMax]; // 物品组图标
    private static String[]  itemGroupsName = new String[itemGroupsMax]; // 物品组名称
    private static int       groupCount = 0; // 记录当前物品组的数量
    private static int       classCode = 0x1256;

    public static void initialize() {
        _var.initialize(); // 初始化变量
        CONSOLE.info("正在注册物品组...");
        for (int i = 0; i < groupCount; i++) {
            if (itemGroupsName[i] != null && !itemGroupsName[i].isEmpty()) {
                registerItemGroups(itemGroupsMen[i + 1], itemGroupsName[i], itemGroupsIcon[i]);
            }
        }
        CONSOLE.debug("物品组注册完毕!");
    }

    /**
     * 注册物品组
     * @param items 物品集
     * @param name 注册名称
     * @param icon 图标
     */
    public static void registerItemGroups(Item[] items, String name, String icon) {
        // item：string型数组，欲注册进ItemGroups的Item，name：注册表名称，icon：指定图标
        CONSOLE.debug("[registerItemGroups] Registering item group Name: {} , Icon: {} , Items: {}", name, icon, items);
        try {
            // 前置检查
            if (items == null || items.length == 0) {
                xyz.admincmd.cjbj.errorSet.errorSet.addError(0x001, ERROR.ERROR_CODE_WARN ,0x1256001, ModItemGroups.class ,"No item in group {}!", name);
                return;
            }
            if (name == null || name.isEmpty()) {
                xyz.admincmd.cjbj.errorSet.errorSet.addError(0x001, ERROR.ERROR_CODE_WARN ,0x1256001, ModItemGroups.class ,"No name in group {}!", name);
                return;
            }
            if (icon == null || icon.isEmpty()) {
                xyz.admincmd.cjbj.errorSet.errorSet.addError(0x001, ERROR.ERROR_CODE_WARN ,0x1256001, ModItemGroups.class ,"No icon in group {}! Assign the 'example_block' item as an icon", name);
                icon = "example_block";
            }
            String finalIcon = icon;
            Registry.register(Registries.ITEM_GROUP,
                    new Identifier(MOD_ID, name),
                    FabricItemGroup.builder().displayName(
                                    Text.translatable("itemGroup." + MOD_ID + "." + name))
                            .icon(() -> new ItemStack(getItem(finalIcon)))
                            .entries((displayContext, entries) -> {
                                for (Item item : items) {
                                    if (item == null) {
                                        continue;
                                    }
                                    entries.add(item);
                                    CONSOLE.debug("[registerItemGroups] Adding item {} to Group {}", item, name);
                                }
                            })
                            .build());
        } catch (Exception e) {
            CONSOLE.error("[registerItemGroups] Failed to register item group Name: {} , Icon: {} , Items: {} , Error: {}", name, icon, items, e);
        }
    }

    /**
     * 添加物品组
     * @param path 物品组名称
     */
    public static void addItemGroup(String path, String icon) {
        CONSOLE.debug("Adding item group: {}", path);
        if (groupCount >= itemGroupsName.length) {
            CONSOLE.error("Item group array is full! Max is {}!", itemGroupsName.length);
            return;
        }
        itemGroupsName[groupCount] = path;
        itemGroupsIcon[groupCount] = icon;
        itemGroupsMen[groupCount] = new Item[0]; // 初始化物品数组
        groupCount++;
    }

    /**
     * 删除物品组
     * @param path 物品组名称
     */
    public static void deleteItemGroup(String path) {
        CONSOLE.debug("Deleting item group: {}", path);
        boolean found = false;
        for (int i = 0; i < groupCount; i++) {
            if (itemGroupsName[i].equals(path)) {
                itemGroupsMen[i] = new Item[0]; // 重置物品数组
                itemGroupsName[i] = ""; // 清空名称
                itemGroupsIcon[i] = ""; // 清空图标
                found = true;
                groupCount--; // 减少物品组计数
                if (i < groupCount) {
                    itemGroupsName[i] = itemGroupsName[groupCount];
                    itemGroupsIcon[i] = itemGroupsIcon[groupCount];
                    itemGroupsMen[i] = itemGroupsMen[groupCount];
                }
                break;
            }
        }
        if (!found) {
            CONSOLE.error("Item group {} not found!", path);
        }
    }

    /**
     * 添加物品到物品组
     * @param item 物品名称
     * @param group 物品组名称
     */
    public static void addItemToItemGroup(String item, String group) {
        try {
            CONSOLE.debug("Adding Item '{}' to Group '{}'", item, group);
            if (groupCount == 0) { // 物品组未找到
                CONSOLE.debug("All ItemGroup '{}' not found! , adding to Group...", group);
                addItemGroup(group, CONFIG_TOOL_ID);
            }
            for (int i = 1; i < groupCount + 1; i++) {
                if (itemGroupsName[i - 1].equals(group)) {// 找到物品组
                    for (int j = 0; j < itemGroupsMen[i].length; j++) {
                        if (itemGroupsMen[i][j] == null) {
                            itemGroupsMen[i][j] = getItem(item);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            CONSOLE.error("Failed to add item {} to group {}! , Error: {}", item, group, e);
        }
    }


    /**
     * 删除物品从物品组
     * @param item 物品名称
     * @param group 物品组名称
     */
    public static void deleteItemFromItemGroup(String item, String group) {
        CONSOLE.debug("Deleting item {} from group {}", item, group);
        for (int i = 0; i < groupCount; i++) {
            if (itemGroupsName[i].equals(group)) {
                boolean foundItem = false;
                if (itemGroupsMen[i] != null) {
//                    for (Item j : itemGroupsMen[i]) {
//                        if (j == null) {
//                            itemGroupsMen[i]
//                        }
//                    }
                    for (int j = 0; j < itemGroupsMen[i].length; j++) {
                        if (itemGroupsMen[i][j] != null && itemGroupsMen[i][j].equals(item)) {
                            itemGroupsMen[i][j] = null; // 清空物品
                            foundItem = true;
                        }
                    }
                } else {
                    CONSOLE.error("Item {} not found in group {}! Error: Null", item, group);
                }
                if (!foundItem) {
                    CONSOLE.error("Item {} not found in group {}!", item, group);
                }
                break;
            }
            if (i == groupCount - 1) { // 物品组未找到
                CONSOLE.warn("Item group {} not found!", group);
                return;
            }
        }
    }

    public static String[] getItemGroupsIcon() {
        return itemGroupsIcon;
    }

    public static String[] getItemGroupsName() {
        return itemGroupsName;
    }

    public static Item[][] getItemGroupsMen() {
        return itemGroupsMen;
    }

    public static int getItemGroupsMax() {
        return itemGroupsMax;
    }

    public static int getGroupCount() {
        return groupCount;
    }
}
