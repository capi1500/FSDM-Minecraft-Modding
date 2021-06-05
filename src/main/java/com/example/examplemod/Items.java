package com.example.examplemod;

import com.example.examplemod.items.ArmorMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items{
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
	
	public static void init(){
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS))
	);
	
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
			() -> new BlockItem(
					Blocks.COPPER_ORE.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
			)
	);
	
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
			() -> new BlockItem(
					Blocks.COPPER_BLOCK.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
			)
	);
	
	public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(
			ArmorMaterial.COPPER,
			EquipmentSlotType.HEAD,
			new Item.Properties().group(ItemGroup.COMBAT)
	));
	
	public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(
			ArmorMaterial.COPPER,
			EquipmentSlotType.CHEST,
			new Item.Properties().group(ItemGroup.COMBAT)
	));
	
	public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(
			ArmorMaterial.COPPER,
			EquipmentSlotType.LEGS,
			new Item.Properties().group(ItemGroup.COMBAT)
	));
	
	public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(
			ArmorMaterial.COPPER,
			EquipmentSlotType.FEET,
			new Item.Properties().group(ItemGroup.COMBAT)
	));
}
