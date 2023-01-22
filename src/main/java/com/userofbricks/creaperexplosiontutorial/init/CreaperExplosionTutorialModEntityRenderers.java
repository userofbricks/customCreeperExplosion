
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.userofbricks.creaperexplosiontutorial.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.userofbricks.creaperexplosiontutorial.client.renderer.CustomExplosionTutorialRenderer;
import com.userofbricks.creaperexplosiontutorial.client.renderer.CreeperTheVanillaWayRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreaperExplosionTutorialModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreaperExplosionTutorialModEntities.CUSTOM_EXPLOSION_TUTORIAL.get(), CustomExplosionTutorialRenderer::new);
		event.registerEntityRenderer(CreaperExplosionTutorialModEntities.CREEPER_THE_VANILLA_WAY.get(), CreeperTheVanillaWayRenderer::new);
	}
}
