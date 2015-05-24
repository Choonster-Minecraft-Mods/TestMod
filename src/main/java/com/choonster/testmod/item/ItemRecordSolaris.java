package com.choonster.testmod.item;

import com.choonster.testmod.TestMod;
import net.minecraft.item.ItemRecord;

public class ItemRecordSolaris extends ItemRecord {
	public ItemRecordSolaris(int id) {
		super(id, "testmod:solaris");
		setCreativeTab(TestMod.tab);
		setUnlocalizedName("record");
		setTextureName("record_13");
	}

	@Override
	public String getRecordTitle() {
		return "Path of Exile - Solaris";
	}
}
