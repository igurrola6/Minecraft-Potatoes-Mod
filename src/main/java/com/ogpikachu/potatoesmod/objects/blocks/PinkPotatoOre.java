package com.ogpikachu.potatoesmod.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;


public class PinkPotatoOre extends Block{

	public PinkPotatoOre(Properties properties) {
		super(properties);
		
	}
	protected int func_220281_a(Random p_220281_1_) {
	         return MathHelper.nextInt(p_220281_1_, 2, 5);
	   }
	
	
	@Override
	   public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
	      return silktouch == 0 ? this.func_220281_a(RANDOM) : 0;
	   }


}
