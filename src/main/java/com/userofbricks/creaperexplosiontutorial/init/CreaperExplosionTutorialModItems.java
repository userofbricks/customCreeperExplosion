
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.userofbricks.creaperexplosiontutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.userofbricks.creaperexplosiontutorial.CreaperExplosionTutorialMod;

public class CreaperExplosionTutorialModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreaperExplosionTutorialMod.MODID);
	public static final RegistryObject<Item> CUSTOM_EXPLOSION_TUTORIAL = REGISTRY.register("custom_explosion_tutorial_spawn_egg",
			() -> new ForgeSpawnEggItem(CreaperExplosionTutorialModEntities.CUSTOM_EXPLOSION_TUTORIAL, -1, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
