package com.choonster.testmod.init;

import com.choonster.testmod.item.ItemRecordSolaris;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	public static ItemRecordSolaris recordSolaris;

	public static void registerItems() {
		recordSolaris = registerItem(new ItemRecordSolaris(9000));
	}

	private static <T extends Item> T registerItem(T item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		return item;
	}
}
