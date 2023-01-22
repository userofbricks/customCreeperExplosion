
package com.userofbricks.creaperexplosiontutorial.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.userofbricks.creaperexplosiontutorial.entity.CreeperTheVanillaWayEntity;

public class CreeperTheVanillaWayRenderer extends MobRenderer<CreeperTheVanillaWayEntity, CreeperModel<CreeperTheVanillaWayEntity>> {
	public CreeperTheVanillaWayRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperTheVanillaWayEntity entity) {
		return new ResourceLocation("creaper_explosion_tutorial:textures/entities/creaper_tutorial_skin.png");
	}
}
