package xyz.admincmd.cjbj.mixin.client.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static xyz.admincmd.cjbj.main.CONSOLE;

public class ModBlockClient {
    public static boolean setBlockImageA(Block block) {
        try {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
            return true;
        } catch (Exception e) {
            CONSOLE.error("Failed to set block image for {} with exception: {}", block.getName().getString(), e.getMessage());
            return false;
        }
    }

    public static boolean setBlockImageA(Block[] blocks) {
        try {
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), blocks);
            return true;
        } catch (Exception e) {
            CONSOLE.error("Failed to set block[] image for {} with exception: {}", blocks[0].getName().getString(), e.getMessage());
            return false;
        }
    }
}
