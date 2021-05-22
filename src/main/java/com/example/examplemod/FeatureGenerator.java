package com.example.examplemod;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class FeatureGenerator{
	private static final ArrayList<ConfiguredFeature<?, ?>> ores = new ArrayList<>();
	
	public static void registerOres(){
		ores.add(
				Registry.register(
						WorldGenRegistries.CONFIGURED_FEATURE,
						"copper_ore",
						Feature.ORE.withConfiguration(
								new OreFeatureConfig(
										OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
										ExampleModDefs.COPPER_ORE.get().getDefaultState(),
										4
								)
						).range(64).square()
						 .func_242731_b(64)
				)
		);
		
		ores.add(
				Registry.register(
						WorldGenRegistries.CONFIGURED_FEATURE,
						"copper_block",
						Feature.ORE.withConfiguration(
								new OreFeatureConfig(
										OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
										ExampleModDefs.COPPER_BLOCK.get().getDefaultState(),
										10
								)
						).range(64).square()
						 .func_242731_b(64)
				)
		);
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void gen(BiomeLoadingEvent event){
		BiomeGenerationSettingsBuilder generation = event.getGeneration();
		
		for(ConfiguredFeature<?, ?> ore : ores){
			if(ore != null)
				generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
		}
	}
}
