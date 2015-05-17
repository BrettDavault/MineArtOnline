package com.kidokenji.mineartonline;

import com.kidokenji.mineartonline.init.MAOItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MaoTab extends CreativeTabs{

	public MaoTab(String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return MAOItems.elucidator;
	}

}
