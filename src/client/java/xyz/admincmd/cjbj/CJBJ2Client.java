package xyz.admincmd.cjbj;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import xyz.admincmd.cjbj.block.registerBlock;

import static net.minecraft.block.Blocks.register;

public class CJBJ2Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		// ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x3495eb, registerBlock.COLOR_BLOCK);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}