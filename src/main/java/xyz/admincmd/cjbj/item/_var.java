package xyz.admincmd.cjbj.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static xyz.admincmd.cjbj.item.ModItem.registerItem;

public class _var {
    public static final String CONFIG_TOOL_ID = "config_tool";

    public static final Item CONFIG_TOOL_ITEM_OBJECT = registerItem(CONFIG_TOOL_ID, new Item(new FabricItemSettings()));

    public static final Item[] CONFIG_TOOL_MODE = {
            CONFIG_TOOL_ITEM_OBJECT,
    };

    public static void initialize() {}
}
