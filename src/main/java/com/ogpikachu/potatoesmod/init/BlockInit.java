package com.ogpikachu.potatoesmod.init;

import com.ogpikachu.potatoesmod.PotatoesMod;
import com.ogpikachu.potatoesmod.PotatoesMod.PotatoesItemGroup;
import com.ogpikachu.potatoesmod.objects.blocks.LaBonnetteOre;
import com.ogpikachu.potatoesmod.objects.blocks.PinkPotatoOre;
import com.ogpikachu.potatoesmod.objects.blocks.RedPotatoOre;
import com.ogpikachu.potatoesmod.objects.blocks.RottenPotatoOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = PotatoesMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(PotatoesMod.MOD_ID)
public class BlockInit {
	
	public static final Block red_potato_ore = null;
	public static final Block pink_potato_ore = null;
	public static final Block rotten_potato_ore = null;
	public static final Block la_bonnette_ore = null;
	public static final Block enriched_dirt = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event){
		//register properties of block
		//DON'T FORGET THE .json file under models->block, models->item, and to add it under lang and blockstates
		//DON'T FORGET THE TEXTURES (textures->blocks)
		event.getRegistry().register(new RedPotatoOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 4.0f).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("red_potato_ore"));
		event.getRegistry().register(new PinkPotatoOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("pink_potato_ore"));
		event.getRegistry().register(new RottenPotatoOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 2.0f).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("rotten_potato_ore"));
		event.getRegistry().register(new LaBonnetteOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 1.0f).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("la_bonnette_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(6.5f, 2.0f).harvestLevel(2).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)).setRegistryName("enriched_dirt"));
		
	}
	

	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event){
		//register name/stacksize of block
		event.getRegistry().register(new BlockItem(red_potato_ore, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("red_potato_ore"));
		event.getRegistry().register(new BlockItem(pink_potato_ore, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("pink_potato_ore"));
		event.getRegistry().register(new BlockItem(rotten_potato_ore, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("rotten_potato_ore"));
		event.getRegistry().register(new BlockItem(la_bonnette_ore, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("la_bonnette_ore"));
		event.getRegistry().register(new BlockItem(enriched_dirt, new Item.Properties().group(PotatoesItemGroup.instance)).setRegistryName("enriched_dirt"));
	
	
	}
}
