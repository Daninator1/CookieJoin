package me.daninator1.cookiejoin;

import org.bukkit.plugin.java.JavaPlugin;

public class CookieJoin extends JavaPlugin {
	
	public CookieJoinListener cookiejoinListener = new CookieJoinListener();

	@Override
	public void onDisable() {
		
		System.out.println("CookieJoin successfully disabled!");
		
	}

	@Override
	public void onEnable() {
		
		manageStuff();
		System.out.println("CookieJoin successfully enabled!");
		
	}
	
	public void manageStuff() {
		
		getServer().getPluginManager().registerEvents(cookiejoinListener, this);
		
	}

}
