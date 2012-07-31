package me.daninator1.cookiejoin;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CookieJoin extends JavaPlugin{
	
	private final CookieJoinPlayerListener playerListener = new CookieJoinPlayerListener(this);

	@Override
	public void onDisable() {
		
		System.out.println("CookieJoin successfully disabled!");
		
	}

	@Override
	public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvent(Event.Type.PLAYER_JOIN, this.playerListener, Priority.Normal, this);
		
		System.out.println("CookieJoin successfully enabled!");
		
	}

}
