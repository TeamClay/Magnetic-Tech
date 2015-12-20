package com.teamclay.MagnticTech;

import ibxm.Player;

import java.util.ArrayList;
import java.util.List;

import com.teamclay.MagnticTech.Block.BlockBoron;
import com.teamclay.MagnticTech.Block.BlockMagnetite_N;
import com.teamclay.MagnticTech.Block.BlockMagnetite_S;
import com.teamclay.MagnticTech.Block.BlockNeodymium;
import com.teamclay.MagnticTech.Block.BlockSeptumMagnet;
import com.teamclay.MagnticTech.Item.ItemBoronDust;
import com.teamclay.MagnticTech.Item.ItemMagnet_N;
import com.teamclay.MagnticTech.Item.ItemMagnet_S;
import com.teamclay.MagnticTech.Item.ItemNeodymium;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetAxe;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetHoe;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetIronIngot;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetPickaxe;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetShovel;
import com.teamclay.MagnticTech.Item.ItemSeptumMagnetSword;
import com.teamclay.MagnticTech.Item.ItemWrench;
import com.teamclay.MagnticTech.Machine.MagneticFurnace;
import com.teamclay.MagnticTech.gui.MagneticFurnaceGui;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
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
	public static Item Wrench;
	public static ItemSword SeptumMagnet_Sword;
	public static ItemPickaxe SeptumMagnet_Pickaxe;
	public static ItemSpade SeptumMagnet_Shovel;
	public static ItemAxe SeptumMagnet_Axe;
	public static ItemHoe SeptumMagnet_Hoe;
	public static CreativeTabs MT_BASE = null;
	public static Block Machine_MagneticFurnace;
	public static List<String> machines = new ArrayList<String>();
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
		FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
	}
	public void RegisterOreDic(){
		OreDictionary.registerOre("oreMagnetite", this.Magnet_N);
		OreDictionary.registerOre("oreMagnetite", this.Magnet_S);
		OreDictionary.registerOre("oreSeptumMagnet", this.Septum_Magnet);
		OreDictionary.registerOre("oreBoron", this.Boron_Ore);
	}
	public void RegisterBlock(){
		Magnetite_N = new BlockMagnetite_N();
		Magnetite_S = new BlockMagnetite_S();
		Septum_Magnet = new BlockSeptumMagnet();
		Boron_Ore = new BlockBoron();
		Neodymium_ore = new BlockNeodymium();
		Machine_MagneticFurnace = new MagneticFurnace();
		GameRegistry.registerBlock(Magnetite_N, "magnetiten");
		GameRegistry.registerBlock(Magnetite_S, "magnetites");
		GameRegistry.registerBlock(Septum_Magnet, "septummagnet");
		GameRegistry.registerBlock(Boron_Ore, "boron_ore");
		GameRegistry.registerBlock(Neodymium_ore, "neodymium_ore");
		GameRegistry.registerBlock(Machine_MagneticFurnace, "magnetic_furnace");
		machines.add(this.Machine_MagneticFurnace.getUnlocalizedName());
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
		this.Septum_Magnet_Iron_Ingot.setCreativeTab(this.MT_BASE);
		SeptumMagnet_Sword = new ItemSeptumMagnetSword();
		GameRegistry.registerItem(SeptumMagnet_Sword, "septum_magnet_sword");
		SeptumMagnet_Pickaxe = new ItemSeptumMagnetPickaxe();
		GameRegistry.registerItem(SeptumMagnet_Pickaxe, "septum_magnet_pickaxe");
		SeptumMagnet_Shovel = new ItemSeptumMagnetShovel();
		GameRegistry.registerItem(SeptumMagnet_Shovel, "septum_magnet_shovel");
		SeptumMagnet_Axe = new ItemSeptumMagnetAxe();
		GameRegistry.registerItem(SeptumMagnet_Axe, "septum_magnet_axe");
		SeptumMagnet_Hoe = new ItemSeptumMagnetHoe();
		GameRegistry.registerItem(SeptumMagnet_Hoe, "septum_magnet_hoe");
		Wrench = new ItemWrench();
		GameRegistry.registerItem(Wrench, "wrench");
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
		GameRegistry.addRecipe(new ItemStack(this.Wrench), new Object[]{"# #"," # "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Hoe), new Object[]{"## "," * "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Hoe), new Object[]{" ##"," * "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Axe), new Object[]{"## ","#* "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Axe), new Object[]{"## "," *#"," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.SeptumMagnet_Shovel), new Object[]{" # "," * "," * ",'#',this.Septum_Magnet_Iron_Ingot,'*',Items.stick	
		});
		GameRegistry.addRecipe(new ItemStack(this.Machine_MagneticFurnace), new Object[] {
		"#n#","# #","#s#",'#',this.Septum_Magnet_Iron_Ingot,'n',this.Magnet_N,'s',this.Magnet_S	
		});
		GameRegistry.addRecipe(new ItemStack(this.Machine_MagneticFurnace), new Object[] {
			"#s#","# #","#n#",'#',this.Septum_Magnet_Iron_Ingot,'n',this.Magnet_N,'s',this.Magnet_S	
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
	@SubscribeEvent
	public void onUse(PlayerInteractEvent event){
		if(event.action == Action.RIGHT_CLICK_BLOCK){
		if(machines.contains(event.world.getBlock(event.x, event.y, event.z).getUnlocalizedName()))
		if(event.entityPlayer.isSneaking() == true){
			if(event.entityPlayer.inventory.getCurrentItem() != null){
			if(event.entityPlayer.inventory.getCurrentItem().getUnlocalizedName().equals(this.Wrench.getUnlocalizedName())){
				Block block = event.world.getBlock(event.x, event.y, event.z);
				event.world.setBlock(event.x, event.y, event.z, Blocks.air);
				event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(block));
				event.entityPlayer.swingItem();
			}else{
					Block block = event.world.getBlock(event.x, event.y, event.z);
					
					event.entityPlayer.swingItem();
			}
			}
//		}else{
//			Block block = event.world.getBlock(event.x, event.y, event.z);
//			if(block.getUnlocalizedName().equals("magnetictech:magnetic_furnace")){
//			Minecraft.getMinecraft().displayGuiScreen(new MagneticFurnaceGui(event.entityPlayer.inventory,((TileEntityFurnace)event.world.getTileEntity(event.x,event.y , event.z))));
//			}
		}
	}
	}
	@SubscribeEvent
	public void playerName(RenderGameOverlayEvent.Text event) {
	    event.left.add(0, String.format("x:" + event.mouseX + ",y:" + event.mouseY));
	}
}
