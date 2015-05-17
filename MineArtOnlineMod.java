	
	{
		MAOBlocks.init();
		MAOBlocks.register();
		MAOItems.init();
		MAOItems.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
