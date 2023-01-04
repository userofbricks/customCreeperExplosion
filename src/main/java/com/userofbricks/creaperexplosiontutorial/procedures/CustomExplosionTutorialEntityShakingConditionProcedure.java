package com.userofbricks.creaperexplosiontutorial.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.userofbricks.creaperexplosiontutorial.init.CreaperExplosionTutorialModMobEffects;

public class CustomExplosionTutorialEntityShakingConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CreaperExplosionTutorialModMobEffects.FUSE.get()) : false) {
			return true;
		}
		return false;
	}
}
