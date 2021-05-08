package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ExampleModDefs{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
	
	public static void init(){
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	
	public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS))
	);
	
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
	
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
			() -> new BlockItem(
					COPPER_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
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
	
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
			() -> new BlockItem(
					COPPER_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
			)
	);
}
