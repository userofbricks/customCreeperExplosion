package com.userofbricks.creaperexplosiontutorial.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import com.userofbricks.creaperexplosiontutorial.entity.CustomExplosionTutorialEntity;

public class FuseEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CustomExplosionTutorialEntity) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.BREAK);
		}
	}
}
