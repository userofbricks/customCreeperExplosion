
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.userofbricks.creaperexplosiontutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.userofbricks.creaperexplosiontutorial.entity.CustomExplosionTutorialEntity;
import com.userofbricks.creaperexplosiontutorial.entity.CreeperTheVanillaWayEntity;
import com.userofbricks.creaperexplosiontutorial.CreaperExplosionTutorialMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreaperExplosionTutorialModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
			CreaperExplosionTutorialMod.MODID);
	public static final RegistryObject<EntityType<CustomExplosionTutorialEntity>> CUSTOM_EXPLOSION_TUTORIAL = register("custom_explosion_tutorial",
			EntityType.Builder.<CustomExplosionTutorialEntity>of(CustomExplosionTutorialEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CustomExplosionTutorialEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<CreeperTheVanillaWayEntity>> CREEPER_THE_VANILLA_WAY = register("creeper_the_vanilla_way",
			EntityType.Builder.<CreeperTheVanillaWayEntity>of(CreeperTheVanillaWayEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CreeperTheVanillaWayEntity::new)

					.sized(0.6f, 1.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CustomExplosionTutorialEntity.init();
			CreeperTheVanillaWayEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CUSTOM_EXPLOSION_TUTORIAL.get(), CustomExplosionTutorialEntity.createAttributes().build());
		event.put(CREEPER_THE_VANILLA_WAY.get(), CreeperTheVanillaWayEntity.createAttributes().build());
	}
}
