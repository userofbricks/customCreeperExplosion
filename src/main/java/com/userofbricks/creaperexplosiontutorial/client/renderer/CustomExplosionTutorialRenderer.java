
package com.userofbricks.creaperexplosiontutorial.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.userofbricks.creaperexplosiontutorial.procedures.CustomExplosionTutorialEntityShakingConditionProcedure;
import com.userofbricks.creaperexplosiontutorial.entity.CustomExplosionTutorialEntity;

public class CustomExplosionTutorialRenderer extends MobRenderer<CustomExplosionTutorialEntity, CreeperModel<CustomExplosionTutorialEntity>> {
	public CustomExplosionTutorialRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CustomExplosionTutorialEntity entity) {
		return new ResourceLocation("creaper_explosion_tutorial:textures/entities/creaper_tutorial_skin.png");
	}

	@Override
	protected boolean isShaking(CustomExplosionTutorialEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return CustomExplosionTutorialEntityShakingConditionProcedure.execute(entity);
	}
}
