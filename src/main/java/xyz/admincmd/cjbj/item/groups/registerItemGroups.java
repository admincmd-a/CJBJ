package xyz.admincmd.cjbj.item.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.admincmd.cjbj.CJBJ2;
import xyz.admincmd.cjbj.item.itemComponentList;

import static xyz.admincmd.cjbj.CJBJ2.LOGLOG;
import static xyz.admincmd.cjbj.CJBJ2.MOD_ID;

public class registerItemGroups {
    public static String[] itemGroupsMianMent = {
            "warning_sign_a",
            "warning_sign_b",
            "warning_sign_c",
            "warning_sign_d",
            "warning_sign_e",
            "warning_sign_f",
            "warning_sign_g",
            "warning_sign_h",
            "warning_sign_i",
            "railroad_car_stopper_a",};

    public static void initializeModItemGroups() {
        LOGLOG.info("一开始注册物品组 > 54645h544546");
        //itemGroupsMianMent =
        registerItemGroups(itemGroupsMianMent,"mian_ment","sett_rods");
    }
    public static void registerItemGroups(String[] items,String name,String icon) {
        // item：string型数组，欲注册进ItemGroups的Item，name：注册表名称，icon：指定图标
        Registry.register(Registries.ITEM_GROUP,
                new Identifier(CJBJ2.MOD_ID,name),
                FabricItemGroup.builder().displayName(Text.translatable("itemGroup."+MOD_ID+"."+name))
                        .icon(() -> new ItemStack(Registries.ITEM.get(new Identifier(MOD_ID, icon)))).entries((displayContext, entries) -> {
                            entries.add(Registries.ITEM.get(new Identifier(MOD_ID, "sett_rods")));
                            for (String item : items)
                                entries.add(Registries.ITEM.get(new Identifier(CJBJ2.MOD_ID,item)));
                        }).build());


    }
}
