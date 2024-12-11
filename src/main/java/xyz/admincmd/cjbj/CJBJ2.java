package xyz.admincmd.cjbj;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static xyz.admincmd.cjbj.block.registerBlock.*;
import static xyz.admincmd.cjbj.item.groups.registerItemGroups.*;
import static xyz.admincmd.cjbj.item.registerItem.*;

public class CJBJ2 implements ModInitializer {
	public static final String MOD_ID = "cjbj";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger INFO_LOG = LoggerFactory.getLogger(MOD_ID);
	public static final Logger LOGLOG = INFO_LOG;


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		INFO_LOG.info("""
				城建不建 ====================================
				开始初始化...
				   ____       _   ____        _\s
				  / ___|     | | | __ )      | |
				 | |      _  | | |  _ \\   _  | |
				 | |___  | |_| | | |_) | | |_| |
				  \\____|  \\___/  |____/   \\___/ \
				
				----------------------------------------
				版本： 原型 0.0.1.0
				
				""");


		INFO_LOG.info("Hello Fabric world!");

		initializeModBlocks();//注册方块&物品
		initializeModItems();
		initializeModItemGroups();


		INFO_LOG.info("""
				城建不建 初始化完毕 =====================================""");
	}
}