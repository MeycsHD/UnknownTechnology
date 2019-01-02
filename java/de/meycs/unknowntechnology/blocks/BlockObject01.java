package de.meycs.unknowntechnology.blocks;


import de.meycs.unknowntechnology.blocks.machines.BlockMachineBlock;
import de.meycs.unknowntechnology.utils.UnknownTechnologyCreativeTab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockObject01 extends BlockMachineBlock {
	
	public static final AxisAlignedBB OBJECT01_AABB = new AxisAlignedBB(0.125D, 0, 0.125D, 0.875D, 0.375D, 0.875D);

	
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return OBJECT01_AABB;
}

	
	

}
