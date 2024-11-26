package admincmd.cjbj.registry;

import admincmd.cjbj.CJBJ;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {



    static public void registerModItemGroups() {
        final ItemGroup SILVER_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(CJBJ.MOD_ID, "aaaaa"),
                FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cjbj.main_menu"))
                        .icon(() -> new ItemStack(Registries.ITEM.get(new Identifier("cjbj", "setting_rods")))).entries((displayContext, entries) -> {
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "setting_rods")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "example_block")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "railway_crossing_signals_0")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "railway_crossing_signals_1")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "railway_crossing_signals_2")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "railway_crossing_signals_3")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "railway_crossing_signals_4")));
                            entries.add(Registries.ITEM.get(new Identifier("cjbj", "highway_signage_racking_pole_crossbar_n")));

                        }).build());


        //        public static final ItemGroup MODOTHER_GROUP = Registry.register(Registries.ITEM_GROUP,
//                new Identifier(CJBJ.MOD_ID, "modother"),
//                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modother"))
//                        .icon(() -> new ItemStack(ModItems.COAL_BALL)).entries((displayContext, entries) -> {
//                            entries.add(ModItems.COAL_BALL);
//                            entries.add(ModItems.PETROLEUM_BUCKET);
//                            entries.add(ModItems.EGG_BLUE_SLIME);
//                            entries.add(ModItems.EGG_RED_SLIME);
//                            entries.add(ModItems.EGG_YELLOW_SLIME);
//                            entries.add(ModItems.BLUE_SLIMEBALL);
//                            entries.add(ModItems.RED_SLIMEBALL);
//                            entries.add(ModItems.YELLOW_SLIMEBALL);
//                            entries.add(ModItems.CABBAGE);
//                            entries.add(ModItems.CABBAGE_SEEDS);
//                        }).build());
        CJBJ.LOGGER.debug("Registering mod item group for"+ CJBJ.MOD_ID);


        //Registry.register(ITEM_GROUP, new Identifier("tutorial", "test_group"), ITEM_GROUP);
//       Registry.register(Registries.ITEM, new Identifier("cjbj", "setting_rods"), new Item(new Item.Settings()));
//
//        final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier("tutorial", "test_group"), FabricItemGroup.builder()
//                .icon(() -> new ItemStack(Registry.register(Registries.ITEM, new Identifier("cjbj", "setting_rods"), new Item(new Item.Settings()));))
//                .displayName(Text.translatable("itemGroup.cjbj.master_list"))
//                .entries((context  m, entries) -> {
//                    entries.add(Registry.register(Registries.ITEM, new Identifier("cjbj", "setting_rods"), new Item(new Item.Settings())););
//                })
//                .build());

//        public static void initialize() {
//        }
        /*
        * public static final ItemGroup FISH_GROUP = FabricItemGroupBuilder.build(
        new Identifier("fishmod", "general"),
        () -> new ItemStack(Blocks.SALMON));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
        new Identifier("fishmod", "other"))
        .icon(() -> new ItemStack(Items.TROPICAI_FISH))
        .appendItems(stacks -> {
            stacks.add(new ItemStack(Blocks.BONE_BLOCK));
            stacks.add(new ItemStack(Items.APPLE));
            stacks.add(PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER));
            stacks.add(ItemStack.EMPTY);
            stacks.add(new ItemStack(Items.IRON_SHOVEL));
        })
        .build();*/


    }
}
