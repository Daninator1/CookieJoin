package me.daninator1.cookiejoin;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;

public class CookieJoinPlayerListener extends PlayerListener {
	
	public static CookieJoin plugin;
	
	public CookieJoinPlayerListener(CookieJoin CookieJoin) {
		plugin = CookieJoin;
	}
	
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		event.getPlayer().getInventory().addItem(new ItemStack(357, 1));
		
		event.getPlayer().sendMessage(ChatColor.AQUA + "[CookieJoin] Here's a cookie for you!");
		
		event.getPlayer().chat("*I just received a cookie!*");
	}

}
