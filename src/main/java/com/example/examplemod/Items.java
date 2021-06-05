package com.example.examplemod;

import com.example.examplemod.items.ArmorMaterial;
import com.example.examplemod.items.ItemMaterial;
import com.example.examplemod.items.SuperSword;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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
	
	public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(
			ItemMaterial.COPPER,
			1,
			-2.8f,
			new Item.Properties().group(ItemGroup.TOOLS)
	));
	
	public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(
			ItemMaterial.COPPER,
			7,
			-3.2f,
			new Item.Properties().group(ItemGroup.TOOLS)
	));
	
	public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(
			ItemMaterial.COPPER,
			1.5f,
			-3,
			new Item.Properties().group(ItemGroup.TOOLS)
	));
	
	public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(
			ItemMaterial.COPPER,
			-2,
			-1,
			new Item.Properties().group(ItemGroup.TOOLS)
	));
	
	public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SuperSword(
			ItemMaterial.COPPER,
			3,
			-2.4f,
			new Item.Properties().group(ItemGroup.COMBAT)
	));
}
