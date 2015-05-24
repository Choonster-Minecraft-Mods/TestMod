package com.choonster.testmod;

import com.choonster.testmod.handlers.SoundHandler;
import com.choonster.testmod.init.ModItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod {
	public static final String MODID = "testmod";
	public static final String VERSION = "1.0";

	public static CreativeTabs tab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Block.dirt.getUnlocalizedName());

		tab = new CreativeTabs("testmod") {
			@Override
			public ItemStack getIconItemStack() {
				return super.getIconItemStack();
			}
		};

		ModItems.registerItems();

		if (FMLCommonHandler.instance().getSide().isClient()) {
			MinecraftForge.EVENT_BUS.register(new SoundHandler());
		}
	}
}
