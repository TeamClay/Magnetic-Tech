package com.teamclay.MagnticTech.Machine;

import java.util.Random;

import com.teamclay.MagnticTech.MagneticTech;
//import com.teamclay.MagnticTech.TileEntity.TileEntityMagneticFurnace;


import com.teamclay.MagnticTech.TileEntity.TileEntityMagneticFurnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class MagneticFurnace extends BlockContainer{
	public static IIcon icon1;
	public static IIcon icon2;
	public static IIcon icon3;
	public static IIcon icon4;
	public static IIcon icon5;
	private final static boolean b = true;
	private final Random field_149933_a = new Random();
	private static boolean field_149934_M;
	public MagneticFurnace(){
		super(Material.rock);
		this.setBlockName("magnetic_furnace");
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setHardness(1.0F);
		this.setResistance(15F);
		this.setHarvestLevel("wrench", 1);
	}
	@Override
    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int number,int face){
		IIcon icon;
		switch(number){
		case 2 : icon = icon2;
		break;
		case 0 : icon = icon3;
		break;
		case 1 : icon = icon1;
		break;
		case 3 : icon = icon3;
		break;
		case 4 : icon = icon4;
		break;
		case 6 : icon = icon5;
		break;
		default : icon = icon5;
		break;
		}
		return icon;
	}
	@Override
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister render){
		 this.icon1 = render.registerIcon("magnetictech:magnetic_furnace_face");
		 this.icon2 = render.registerIcon("magnetictech:magnetic_furnace_side");
		 this.icon3 = render.registerIcon("magnetictech:magnetic_furnace_side");
		 this.icon4 = render.registerIcon("magnetictech:magnetic_furnace_side");
		 this.icon5 = render.registerIcon("magnetictech:magnetic_furnace_side");
	
	}
//	@Override
//	public void onBlockClicked(World world,int x,int y,int z,EntityPlayer player){
//		if(player.isSneaking() == true){
//			player.addChatMessage(new ChatComponentText("1"));
//			if(player.getItemInUse().getItem() == MagneticTech.Wrench){
//				player.addChatMessage(new ChatComponentText("2"));
//				world.setBlock(x, y, z, Blocks.air);
//				player.inventory.addItemStackToInventory(new ItemStack(MagneticTech.Machine_MagneticFurnace));
//			}
//		}
//	}
//	public static void ChangeSide(){
//		if(icon1.getIconName().equals("magnetictech:magnetic_furnace_face")){
//			icon2 = icon1;
//			icon1 = icon5;
//		}else if(icon2.getIconName().equals("magnetictech:magnetic_furnace_face")){
//			icon3 = icon2;
//			icon2 = icon3;
//		}else if(icon3.getIconName().equals("magnetictech:magnetic_furnace_face")){
//			icon4 = icon3;
//			icon3 = icon2;
//		}else if(icon4.getIconName().equals("magnetictech:magnetic_furnace_face")){
//			icon5 = icon4;
//			icon4 = icon3;
//		}else if(icon5.getIconName().equals("magnetictech:magnetic_furnace_face")){
//			icon1 = icon5;
//			icon5 = icon4;
//		}
//	}
//	@Override
//	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
//		return new MagneticTileEntity();
//	}
//	@Override
//	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_){
//		if(p_149727_1_.isRemote){
//			return true;
//		}
////		Minecraft.getMinecraft().displayGuiScreen(new MagneticFurnaceGui(p_149727_5_.inventory,((MagneticTileEntity) (p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_)))));
//		return true;
//	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityMagneticFurnace();
	}
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3,
            int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
            float par8, float par9) {
		// TODO Auto-generated method stub
		par5EntityPlayer.openGui(MagneticTech.instance, 10, par1World, par2, par3, par4);
		return true;
	}
}