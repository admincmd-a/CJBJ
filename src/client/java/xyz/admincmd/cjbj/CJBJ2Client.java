package xyz.admincmd.cjbj;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.Block;

import static xyz.admincmd.cjbj.block._var.*;
import static xyz.admincmd.cjbj.main.CONSOLE;
import static xyz.admincmd.cjbj.mixin.client.block.ModBlockClient.setBlockImageA;

public class CJBJ2Client implements ClientModInitializer {

	public static final Block[] A_BLOCKS = {FIRE_DOOR_A_BLOCK_OBJECT, FIRE_DOOR_B_BLOCK_OBJECT};

	@Override
	public void onInitializeClient() {
		CONSOLE.info("CJBJ2 Client initialized.");
//		setBlockImageA(A_BLOCKS);
	}
}