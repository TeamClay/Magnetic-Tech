package com.teamclay.MagnticTech;

import com.teamclay.MagnticTech.Block.BlockBoron;
import com.teamclay.MagnticTech.Block.BlockMagnetite_N;
import com.teamclay.MagnticTech.Block.BlockMagnetite_S;
import com.teamclay.MagnticTech.Block.BlockNeodymium;
import com.teamclay.MagnticTech.Block.BlockSeptumMagnet;
import com.teamclay.MagnticTech.Item.ItemBoronDust;
import com.teamclay.MagnticTech.Item.ItemMagnet_N;
import com.teamclay.MagnticTech.Item.ItemMagnet_S;
import com.teamclay.MagnticTech.Item.ItemNeodymium;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetIronIngot;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetPickaxe;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetSword;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="MagneticTech", name="Magnetic-Tech", version="1.01.05")
public class MagneticTech {
	public static Block Magnetite_N;
	public static Block Magnetite_S;
	public static Block Septum_Magnet;
	public static Block Boron_Ore;
	public static Block Neodymium_ore;
	public static Item Magnet_S;
	public static Item Magnet_N;
	public static Item Septum_Magnet_Iron_Ingot;
	public static Item Boron_dust;
	public static Item Neodymium_dust;
	public static ItemSword SeptumMagnet_Sword;
	public static ItemPickaxe SeptumMagnet_Pickaxe;
	public static CreativeTabs MT_BASE = null;
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		RegisterCreativeTabs();
		RegisterItem();
		RegisterBlock();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		RegisterRepice();
		GameRegistry.registerWorldGenerator(new Ore(), 5);
	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
	}
	public void RegisterBlock(){
		Magnetite_N = new BlockMagnetite_N();
		Magnetite_S = new BlockMagnetite_S();
		Septum_Magnet = new BlockSeptumMagnet();
		Boron_Ore = new BlockBoron();
		Neodymium_ore = new BlockNeodymium();
		GameRegistry.registerBlock(Magnetite_N, "magnetiten");
		GameRegistry.registerBlock(Magnetite_S, "magnetites");
		GameRegistry.registerBlock(Septum_Magnet, "septummagnet");
		GameRegistry.registerBlock(Boron_Ore, "boron_ore");
		GameRegistry.registerBlock(Neodymium_ore, "neodymium_ore");
	}
	public void RegisterItem(){
		Magnet_S = new ItemMagnet_S();
		Magnet_N = new ItemMagnet_N();
		Boron_dust = new ItemBoronDust();
		Neodymium_dust = new ItemNeodymium();
		GameRegistry.registerItem(Magnet_S, "magnets");
		GameRegistry.registerItem(Magnet_N, "magnetn");
		GameRegistry.registerItem(Boron_dust, "boron_dust");
		GameRegistry.registerItem(Neodymium_dust, "neodymium_dust");
		SeptumMagnet_Sword = new ItemSeptumMagnetSword();
		GameRegistry.registerItem(SeptumMagnet_Sword, "septum_magnet_sword");
		SeptumMagnet_Pickaxe = new ItemSeptumMagnetPickaxe();
		GameRegistry.registerItem(SeptumMagnet_Pickaxe, "septum_magnet_pickaxe");
	}
	public void RegisterRepice(){
		GameRegistry.addSmelting(Magnetite_N, new ItemStack(Magnet_N), 1F);
		GameRegistry.addSmelting(Magnetite_S, new ItemStack(Magnet_S), 1F);
		GameRegistry.addSmelting(Boron_Ore, new ItemStack(Boron_dust,2), 5F);
		GameRegistry.addSmelting(Neodymium_ore, new ItemStack(Neodymium_dust,2), 3F);
		GameRegistry.addSmelting(Septum_Magnet, new ItemStack(Septum_Magnet_Iron_Ingot), 5F);
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Sword), new Object[]{" # "," # "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Pickaxe), new Object[]{"###"," * "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
	}
	public void RegisterCreativeTabs(){
		Septum_Magnet_Iron_Ingot = new ItemSeptumMagnetIronIngot();
		GameRegistry.registerItem(Septum_Magnet_Iron_Ingot, "septummagnetironingot");
		MT_BASE = new CreativeTabs("MT-BASE"){

			@Override
			public Item getTabIconItem() {
				return Septum_Magnet_Iron_Ingot;
			}};
		
	}
}
