package net.max.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.max.testmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ONION_CROP, RenderLayer.getCutout());
    }
}
