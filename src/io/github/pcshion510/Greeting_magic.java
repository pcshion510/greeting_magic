package io.github.pcshion510;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Greeting_magic extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}
	public void onDisable()
	{

	}
	@EventHandler
	public void onLogin(PlayerJoinEvent event)
	{
		event.setJoinMessage("=-= " + ChatColor.AQUA + event.getPlayer().getName() + " さん" + ChatColor.GOLD + " が ログインしました" + ChatColor.RESET + " =-=");
	}

}
