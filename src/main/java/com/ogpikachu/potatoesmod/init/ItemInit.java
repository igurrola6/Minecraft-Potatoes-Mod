package com.ogpikachu.potatoesmod.init;

import java.util.function.Supplier;

import com.ogpikachu.potatoesmod.PotatoesMod;
import com.ogpikachu.potatoesmod.PotatoesMod.PotatoesItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PotatoesMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PotatoesMod.MOD_ID)
public class ItemInit {
	//Every item must be declared here as well as under register items below
	//Don't forget to add in en_us with "," then next line
	//And also must create a new json file with name of item
	public static Item french_fry = null;
	public static Item sweet_potato = null;
	public static Item red_potato = null;
	public static Item pink_potato = null;
	public static Item truffle = null;
	public static Item dark_potato = null;
	public static Item rotten_potato = null;
	public static Item toxic_potato = null;
	public static Item caviar = null;
	public static Item violet_potato = null;
	public static Item diamond_potato = null;
	public static Item la_bonnette = null;
	public static Item color_potato = null;
		
	//Tools
	public static final Item potato_sword = null;
	public static final Item potato_pickaxe = null;
	public static final Item potato_shovel = null;
	public static final Item potato_axe = null;
	public static final Item potato_hoe = null;
	
	public static final Item sweet_potato_sword = null;
	public static final Item sweet_potato_pickaxe = null;
	public static final Item sweet_potato_shovel = null;
	public static final Item sweet_potato_axe = null;
	public static final Item sweet_potato_hoe = null;
	
	public static final Item red_potato_sword = null;
	public static final Item red_potato_pickaxe = null;
	public static final Item red_potato_shovel = null;
	public static final Item red_potato_axe = null;
	public static final Item red_potato_hoe = null;
	
	public static final Item pink_potato_sword = null;
	public static final Item pink_potato_pickaxe = null;
	public static final Item pink_potato_shovel = null;
	public static final Item pink_potato_axe = null;
	public static final Item pink_potato_hoe = null;
	
	public static final Item truffle_potato_sword = null;
	public static final Item truffle_potato_pickaxe = null;
	public static final Item truffle_potato_shovel = null;
	public static final Item truffle_potato_axe = null;
	public static final Item truffle_potato_hoe = null;
	
	public static final Item dark_potato_sword = null;
	public static final Item dark_potato_pickaxe = null;
	public static final Item dark_potato_shovel = null;
	public static final Item dark_potato_axe = null;
	public static final Item dark_potato_hoe = null;
	
	public static final Item toxic_potato_sword = null;
	public static final Item toxic_potato_pickaxe = null;
	public static final Item toxic_potato_shovel = null;
	public static final Item toxic_potato_axe = null;
	public static final Item toxic_potato_hoe = null;
	
	public static final Item violet_potato_sword = null;
	public static final Item violet_potato_pickaxe = null;
	public static final Item violet_potato_shovel = null;
	public static final Item violet_potato_axe = null;
	public static final Item violet_potato_hoe = null;
	
	public static final Item la_bonnette_sword = null;
	public static final Item la_bonnette_pickaxe = null;
	public static final Item la_bonnette_shovel = null;
	public static final Item la_bonnette_potato_axe = null;
	public static final Item la_bonnette_potato_hoe = null;
	
	public static final Item color_potato_sword = null;
	public static final Item color_potato_pickaxe = null;
	public static final Item color_potato_shovel = null;
	public static final Item color_potato_axe = null;
	public static final Item color_potato_hoe = null;
	
	//Armor
	public static final Item potato_helmet = null;
	public static final Item potato_chestplate = null;
	public static final Item potato_leggings = null;
	public static final Item potato_boots = null;
	
	public static final Item sweet_potato_helmet = null;
	public static final Item sweet_potato_chestplate = null;
	public static final Item sweet_potato_leggings = null;
	public static final Item sweet_potato_boots = null;
	
	public static final Item red_potato_helmet = null;
	public static final Item red_potato_chestplate = null;
	public static final Item red_potato_leggings = null;
	public static final Item red_potato_boots = null;
	
	public static final Item pink_potato_helmet = null;
	public static final Item pink_potato_chestplate = null;
	public static final Item pink_potato_leggings = null;
	public static final Item pink_potato_boots = null;
	
	public static final Item truffle_helmet = null;
	public static final Item truffle_chestplate = null;
	public static final Item truffle_leggings = null;
	public static final Item truffle_boots = null;
	
	public static final Item dark_potato_helmet = null;
	public static final Item dark_potato_chestplate = null;
	public static final Item dark_potato_leggings = null;
	public static final Item dark_potato_boots = null;
	
	public static final Item la_bonnette_helmet = null;
	public static final Item la_bonnette_chestplate = null;
	public static final Item la_bonnette_leggings = null;
	public static final Item la_bonnette_boots = null;
	
	public static final Item toxic_potato_helmet = null;
	public static final Item toxic_potato_chestplate = null;
	public static final Item toxic_potato_leggings = null;
	public static final Item toxic_potato_boots = null;
	
	public static final Item violet_potato_helmet = null;
	public static final Item violet_potato_chestplate = null;
	public static final Item violet_potato_leggings = null;
	public static final Item violet_potato_boots = null;
	
	public static final Item color_potato_helmet = null;
	public static final Item color_potato_chestplate = null;
	public static final Item color_potato_leggings = null;
	public static final Item color_potato_boots = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event){
		//This is where items are named and categorized
		//DON'T FORGET THE .json file under models->item and to add it under lang
		//DON'T FORGET RECIPES (data->recipes-> example.json)
		//DON't FORGET THE TEXTURES (textures->items)
		
		//French Fry
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)
		.food(new Food.Builder().hunger(1).saturation(0.3f).build())).setRegistryName("french_fry"));
		
		//Sweet Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)//(effect, time[610 = 30 seconds, 9620 = 8 minutes],level [-1 is level one 1 is level 2]
		.food(new Food.Builder().hunger(2).saturation(2.0f).setAlwaysEdible().effect(new EffectInstance(Effects.SPEED, 9620, -1), 1.0f)
		.build())).setRegistryName("sweet_potato"));
		
		//Red Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)  
		.food(new Food.Builder().hunger(4).saturation(4.0f).setAlwaysEdible().effect(new EffectInstance(Effects.STRENGTH, 9620, -1), 1.0f)
		.build())).setRegistryName("red_potato"));
		
		//Pink Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)  
		.food(new Food.Builder().hunger(6).saturation(8.0f).setAlwaysEdible().effect(new EffectInstance(Effects.SPEED, 610, 1), 1.0f)
		.build())).setRegistryName("pink_potato"));
		
		//Truffle
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance).food(new Food.Builder().hunger(2).saturation(16.0f).build())).setRegistryName("truffle"));
		
		//Dark Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)  
		.food(new Food.Builder().hunger(8).saturation(16.0f).setAlwaysEdible().effect(new EffectInstance(Effects.NIGHT_VISION, 9620, -1), 1.0f)
		.build())).setRegistryName("dark_potato"));
		
		//Rotten Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)//10 second duration
		.food(new Food.Builder().hunger(1).saturation(1.0f).effect(new EffectInstance(Effects.POISON, 210, -1), 0.80f)
		.build())).setRegistryName("rotten_potato"));
		
		//Toxic Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)//15 second duration
		.food(new Food.Builder().hunger(8).saturation(8.0f).effect(new EffectInstance(Effects.POISON, 310, 1), 1.0f)
		.build())).setRegistryName("toxic_potato"));
		
		//Caviar
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)//1 minute
		.food(new Food.Builder().hunger(2).saturation(10.0f).effect(new EffectInstance(Effects.WATER_BREATHING, 1210, -1), 1.0f)
		.build())).setRegistryName("caviar"));
		
		//Violet Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)  
		.food(new Food.Builder().hunger(10).saturation(10.0f).setAlwaysEdible().effect(new EffectInstance(Effects.WATER_BREATHING, 9620, -1), 1.0f)
		.build())).setRegistryName("violet_potato"));
		
		//Diamond Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance).rarity(Rarity.RARE).food(new Food.Builder().hunger(20).saturation(100.0f).build())).setRegistryName("diamond_potato"));
		
		//La Bonnotte Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance)  
		.food(new Food.Builder().hunger(20).saturation(14.0f).setAlwaysEdible().effect(new EffectInstance(Effects.REGENERATION, 610, 1), 1.0f)
		.build())).setRegistryName("la_bonnette"));
		
		//Color Potato
		event.getRegistry().register(new Item(new Item.Properties().group(PotatoesItemGroup.instance).rarity(Rarity.EPIC)
		.food(new Food.Builder().hunger(20).saturation(100.0f).effect(new EffectInstance(Effects.REGENERATION, 610, 1), 1.0f)
		.effect(new EffectInstance(Effects.ABSORPTION, 610, 1), 1.0f)
		.effect(new EffectInstance(Effects.STRENGTH, 1210, 2), 1.0f)
		.effect(new EffectInstance(Effects.SPEED, 1210, 2), 1.0f)
		.effect(new EffectInstance(Effects.RESISTANCE, 9620, -1), 1.0f)
		.effect(new EffectInstance(Effects.FIRE_RESISTANCE, 9620, -1), 1.0f)
		.effect(new EffectInstance(Effects.WATER_BREATHING, 9620, -1), 1.0f)
		.effect(new EffectInstance(Effects.NIGHT_VISION, 9620, -1), 1.0f)
		.setAlwaysEdible().build())).setRegistryName("color_potato"));
		
	
		//******************************************//
		//Tools
		//(int damage, attackSpeed), DON'T FORGET RECIPES (data->recipes-> example.json)
		//registry name must be lowercased?
		
		//Potato
		event.getRegistry().register(new SwordItem(ModItemTier.POTATO, 2, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.POTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.POTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.POTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.POTATO, 0.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_hoe"));
		//Sweet Potato
		event.getRegistry().register(new SwordItem(ModItemTier.SWEETPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.SWEETPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.SWEETPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.SWEETPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.SWEETPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_hoe"));
		//Red Potato
		event.getRegistry().register(new SwordItem(ModItemTier.REDPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.REDPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.REDPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.REDPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.REDPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_hoe"));
		//Pink Potato
		event.getRegistry().register(new SwordItem(ModItemTier.PINKPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.PINKPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.PINKPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.PINKPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.PINKPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_hoe"));
		//Truffle
		event.getRegistry().register(new SwordItem(ModItemTier.TRUFFLE, 2, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.TRUFFLE, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TRUFFLE, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.TRUFFLE, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.TRUFFLE, 0.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_hoe"));
		//Dark Potato
		event.getRegistry().register(new SwordItem(ModItemTier.DARKPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.DARKPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.DARKPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.DARKPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.DARKPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_hoe"));
		//Toxic Potato
		event.getRegistry().register(new SwordItem(ModItemTier.TOXICPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.TOXICPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TOXICPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.TOXICPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.TOXICPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_hoe"));
		//Violet Potato
		event.getRegistry().register(new SwordItem(ModItemTier.VIOLETPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.VIOLETPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.VIOLETPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.VIOLETPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.VIOLETPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_hoe"));
		//La Bonnotte Potato
		event.getRegistry().register(new SwordItem(ModItemTier.LABONNETTE, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.LABONNETTE, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.LABONNETTE, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.LABONNETTE, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.LABONNETTE, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_hoe"));
		//Color Potato
		event.getRegistry().register(new SwordItem(ModItemTier.COLORPOTATO, 3, 2.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.COLORPOTATO, 1, 1.2f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.COLORPOTATO, 1, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.COLORPOTATO, 1, 0.8f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.COLORPOTATO, 1.0f, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_hoe"));
		
		//******************************************//
		//Armor
		
		//Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.POTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.POTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.POTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.POTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("potato_boots"));
		//Sweet Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SWEETPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SWEETPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SWEETPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SWEETPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("sweet_potato_boots"));
		//Red Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.REDPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.REDPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.REDPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.REDPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_boots"));
		//Pink Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.PINKPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.PINKPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.PINKPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.PINKPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_boots"));
		//Truffle
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TRUFFLE, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TRUFFLE, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TRUFFLE, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TRUFFLE, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("truffle_boots"));
		//Dark Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.DARKPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.DARKPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.DARKPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.DARKPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("dark_potato_boots"));
		//La Bonnette
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.LABONNETTE, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.LABONNETTE, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.LABONNETTE, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.LABONNETTE, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_boots"));
		//Toxic Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOXICPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOXICPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOXICPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOXICPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("toxic_potato_boots"));
		//Violet Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VIOLETPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VIOLETPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VIOLETPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VIOLETPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("violet_potato_boots"));	
		//Color Potato
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.COLORPOTATO, EquipmentSlotType.HEAD, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.COLORPOTATO, EquipmentSlotType.CHEST, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.COLORPOTATO, EquipmentSlotType.LEGS, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.COLORPOTATO, EquipmentSlotType.FEET, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("color_potato_boots"));	
		
		
		
	}
	public enum ModItemTier implements IItemTier{
		
		//(a, b, c, d, e) a = harvestlevel, b = maxuses, c = efficiency, d = damage, e = enchantability
		POTATO(0, 90, 3.0f, 0.0f, 14, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),		//add comma for more tools and semicolon for last 
		SWEETPOTATO(1, 200, 5.0f, 1.0f, 10, ()-> {
			//return Ingredient.fromItems(ItemInit.sweet_potato);//repair with custom item
			return Ingredient.fromItems(Items.POTATO);	
		}),
		REDPOTATO(2, 600, 7.0f, 3.0f, 15, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		PINKPOTATO(2, 50, 36.0f, 8.0f, 8, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		TRUFFLE(1, 111, 5.5f, 1.0f, 26, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		DARKPOTATO(4, 3514, 18.0f, 28.0f, 28, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		TOXICPOTATO(3, 1216, 9.0f, 4.0f, 19, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		VIOLETPOTATO(3, 2432, 10.0f, 6.0f, 14, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		LABONNETTE(4, 4101, 20.0f, 30.0f, 13, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		}),
		COLORPOTATO(6, 12003, 36.0f, 184.0f, 28, ()-> {
			return Ingredient.fromItems(Items.POTATO);	
		});
		
		
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn){
			this.harvestLevel = harvestLevelIn;
			this.maxUses = maxUsesIn;
			this.efficiency = efficiencyIn;
			this.attackDamage = attackDamageIn;
			this.enchantability = enchantabilityIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}
	public enum ModArmorMaterial implements IArmorMaterial{
		//change stats to match original					int[] {boots,leggings,chestplate,helmet}?, enchantability, toughness
	POTATO(PotatoesMod.MOD_ID + ":potatoes", 10, new int[] {1, 2, 3, 2}, 14, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);
	}),
	SWEETPOTATO(PotatoesMod.MOD_ID + ":sweetpotato", 14, new int[] {2, 3, 4, 2}, 10, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);
	}),
	REDPOTATO(PotatoesMod.MOD_ID + ":redpotato", 20, new int[] {3, 5, 6, 3}, 16, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	PINKPOTATO(PotatoesMod.MOD_ID + ":pinkpotato", 4, new int[] {9, 9, 9, 9}, 7, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	TRUFFLE(PotatoesMod.MOD_ID + ":truffle", 12, new int[] {1, 3, 3, 2}, 28, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	DARKPOTATO(PotatoesMod.MOD_ID + ":darkpotato", 65, new int[] {5, 8, 8, 5}, 27, SoundEvents.ENTITY_GENERIC_EAT, 4.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	LABONNETTE(PotatoesMod.MOD_ID + ":labonnette", 65, new int[] {5, 8, 8, 6}, 13, SoundEvents.ENTITY_GENERIC_EAT, 4.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	TOXICPOTATO(PotatoesMod.MOD_ID + ":toxicpotato", 30, new int[] {3, 6, 7, 3}, 20, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	VIOLETPOTATO(PotatoesMod.MOD_ID + ":violetpotato", 40, new int[] {3, 7, 8, 3}, 15, SoundEvents.ENTITY_GENERIC_EAT, 0.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	}),
	COLORPOTATO(PotatoesMod.MOD_ID + ":colorpotato", 120, new int[] {7, 8, 9, 7}, 27, SoundEvents.ENTITY_GENERIC_EAT, 8.0f, () ->{
		return Ingredient.fromItems(Items.POTATO);	
	});
		
		
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private float toughness;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn){
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantability = enchantabilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
		
		
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
	}
	
}
