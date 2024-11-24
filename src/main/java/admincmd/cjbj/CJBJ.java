package admincmd.cjbj;

import admincmd.cjbj.registry.ModBlocks;
//import admincmd.cjbj.registry.ModItems;

import admincmd.cjbj.registry.ModCommands;
import admincmd.cjbj.registry.ModItemGroup;
import admincmd.cjbj.registry.ModItems;
import com.mojang.datafixers.types.templates.List;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static admincmd.cjbj.registry.ModBlocks.registerModBlocks;
import static net.minecraft.registry.Registries.ITEM_GROUP;

//import static admincmd.cjbj.registry.ModBlocks.EXAMPLE_BLOCK;

public class CJBJ implements ModInitializer {
	public static final String MOD_ID = "cjbj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);






	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	//public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

/* 声明和初始化我们的自定义方块实例。
           我们将方块材质（material）设置为 METAL（金属）。

           `strength` 会将方块的硬度和抗性设为同一个值。
           硬度决定了方块需要多久挖掘，抗性决定了方块抵御爆破伤害（如爆炸）的能力。
           石头的硬度为 1.5f，抗性为 6.0f，黑曜石的硬度为 50.0f，抗性为 1200.0f。

           可以在`Blocks`类中查找所有原版方块，你可以以此作为参考。
        */

	// 对于 1.20 以下版本：
	// public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	// 对于 1.20.5 以下版本：

	//public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.create().strength(4.0f));
	//public static final Block StandardBlock = new Block(Block.Settings.create().strength(4.0f));
	// 对于自 1.20.5 之后、1.21.2 以前的版本：
	// public static final Block EXAMPLE_BLOCK = new Block(Block.Settings.create().strength(4.0f));




	@Override
	public void onInitialize() { //初始化时运行
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");

		LOGGER.info("正在加载模组（城建不建），请稍等...");
		LOGGER.info("--------------------------------\n"+
				"   ____       _   ____        _ \n" +
				"  / ___|     | | | __ )      | |\n" +
				" | |      _  | | |  _ \\   _  | |\n" +
				" | |___  | |_| | | |_) | | |_| |\n" +
				"  \\____|  \\___/  |____/   \\___/ " +
				"\n 城建不建 原型版"+
				"--------------------------------\n");

		ModItems.registerModItems();// 初始化时注册物品
		ModBlocks.registerModBlocks();//注册方块
		ModBlocks.registerModBlockItems(); //注册方块物品
		ModItemGroup.registerModItemGroups(); // 注册物品组
		ModCommands.registerModCommands(); //注册命令








	}

	//public static void establishModBlocks() {

	//}

}
