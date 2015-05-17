package com.kidokenji.mineartonline.proxy;

import com.kidokenji.mineartonline.init.MAOBlocks;
import com.kidokenji.mineartonline.init.MAOItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		MAOBlocks.registerRenders();
		MAOItems.registerRenders();
	}
}
