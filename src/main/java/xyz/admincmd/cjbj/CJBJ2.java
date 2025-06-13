package xyz.admincmd.cjbj;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.admincmd.cjbj.block.ModBlock;
import xyz.admincmd.cjbj.item.groups.ModItemGroups;
import xyz.admincmd.cjbj.item.ModItem;

import java.awt.*;

public class CJBJ2 implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Running 'xyz.admincmd.cjbj.main.init()'");
		main.init();
	}
}
