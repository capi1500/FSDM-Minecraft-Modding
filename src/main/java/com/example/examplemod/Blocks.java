package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks{
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
	
	public static void init(){
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",
			() -> new Block(
					Block.Properties
							.create(Material.IRON)
							.hardnessAndResistance(5.0f, 6.0f)
							.sound(SoundType.STONE)
							.harvestTool(ToolType.PICKAXE)
							.harvestLevel(1)
							.setRequiresTool()
			)
	);
	
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",
			() -> new Block(
					Block.Properties
							.create(Material.IRON)
							.hardnessAndResistance(5.0f, 6.0f)
							.sound(SoundType.STONE)
							.harvestTool(ToolType.PICKAXE)
							.harvestLevel(1)
							.setRequiresTool()
			)
	);
}
