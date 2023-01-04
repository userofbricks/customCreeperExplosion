
package com.userofbricks.creaperexplosiontutorial.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.userofbricks.creaperexplosiontutorial.procedures.CustomExplosionTutorialEntityShakingConditionProcedure;
import com.userofbricks.creaperexplosiontutorial.entity.CustomExplosionTutorialEntity;

public class CustomExplosionTutorialRenderer
		extends
			HumanoidMobRenderer<CustomExplosionTutorialEntity, HumanoidModel<CustomExplosionTutorialEntity>> {
	public CustomExplosionTutorialRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
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
