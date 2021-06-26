package com.example.examplemod;

import com.example.examplemod.entities.BigSkeleton;
import com.example.examplemod.entities.BigSkeletonRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Entities{
	private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MODID);
	
	public static void init(){
		ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<EntityType<BigSkeleton>> BIG_SKELETON = ENTITIES.register(
			"big_skeleton",
			() -> EntityType.Builder.<BigSkeleton>create(EntityClassification.MONSTER)
					.immuneToFire()
					.size(2, 2)
					.build("examplemod:big_skeleton")
	);
}
