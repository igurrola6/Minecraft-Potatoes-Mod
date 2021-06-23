package com.ogpikachu.potatoesmod.world.gen;

import com.ogpikachu.potatoesmod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class PotatoOreGen {	
	public static void generateOre(){

		//Red Potato Ore
		for(Biome biome : ForgeRegistries.BIOMES){
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
			.func_227446_a_(new CountRangeConfig(10, 0, 0, 60));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
			.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.red_potato_ore.getDefaultState(), 8))
			.func_227228_a_(customConfig));
		}
		
		//Pink Potato Ore
		for(Biome biome : ForgeRegistries.BIOMES){
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
			.func_227446_a_(new CountRangeConfig(6, 0, 0, 40));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
			.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.pink_potato_ore.getDefaultState(), 6))
			.func_227228_a_(customConfig));
		}
		
		//Rotten Potato Ore
		for(Biome biome : ForgeRegistries.BIOMES){
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
			.func_227446_a_(new CountRangeConfig(5, 0, 0, 24));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
			.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.rotten_potato_ore.getDefaultState(), 6))
			.func_227228_a_(customConfig));
		}
		
		//La Bonnette Ore
		for(Biome biome : ForgeRegistries.BIOMES){
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
			.func_227446_a_(new CountRangeConfig(3, 0, 0, 13));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
			.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.la_bonnette_ore.getDefaultState(), 4))
			.func_227228_a_(customConfig));
		}
		
		//Enriched Dirt
		for(Biome biome : ForgeRegistries.BIOMES){
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
			.func_227446_a_(new CountRangeConfig(3, 0, 0, 15));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
			.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.enriched_dirt.getDefaultState(), 6))
			.func_227228_a_(customConfig));
		}
				
		
		
		
		
	}
}


