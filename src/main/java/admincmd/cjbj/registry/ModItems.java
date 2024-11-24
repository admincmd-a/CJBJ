package admincmd.cjbj.registry;

import admincmd.cjbj.CJBJ;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import admincmd.cjbj.registry.item.*;

import static admincmd.cjbj.CJBJ.LOGGER;

public class ModItems {
    //public static final ItemStack SETTING_RODS = ;
   //static final Item SETTING_RODS = Registry.register(Registries.ITEM, new Identifier("cjbj", "setting_rods"), new Item(new Item.Settings()));

    public static void registerModItems() {
        //启动时被调用，注册模组物品
        LOGGER.info("正在注册物品...");
        item1.regitem1();


    }

    }

//
//    // 定义物体示例: ZER_DIAMOND
//    public static final Item ZER_DIAMOND = regItem("setting_rods",
//            new Item(new FabricItemSettings()));
//
//    // 定义物品示例：ZER_INGOT
//    public static final Item ZER_INGOT = regItem("zer_ingot",
//            new Item(new FabricItemSettings()));
//
//    // 定义物品写入物品注册表方法
//    // 物品注册表需两个参数：
//    // 1.MODID 2.物品ID
//    private static Item regItem(String name,Item item) {
//        return Registry.register(Registries.ITEM, new Identifier(CJBJ.MOD_ID, name), item);
//        //return Registries.register(Registries.ITEM, new Identifier(CJBJ.MOD_ID, name), item);
//    }
//
//    // 初始化时调用，注册模组物品
//    public static void registerModItems() {
//        CJBJ.LOGGER.debug("Mod 城建不建 正在注册Items,MOD_ID" + CJBJ.MOD_ID) ;
//    }
//
