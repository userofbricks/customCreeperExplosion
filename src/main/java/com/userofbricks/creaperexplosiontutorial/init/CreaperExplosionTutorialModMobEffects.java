
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.userofbricks.creaperexplosiontutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.userofbricks.creaperexplosiontutorial.potion.FuseMobEffect;
import com.userofbricks.creaperexplosiontutorial.CreaperExplosionTutorialMod;

public class CreaperExplosionTutorialModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS,
			CreaperExplosionTutorialMod.MODID);
	public static final RegistryObject<MobEffect> FUSE = REGISTRY.register("fuse", () -> new FuseMobEffect());
}
