package edu.unca.jruggier.FirstPlugin.FirstPlugin;

/*
    This file is part of FirstPlugin
*/

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

@SuppressWarnings("unused")
public class FirstPluginEventListener implements Listener {

	private FirstPlugin plugin;

	public FirstPluginEventListener(FirstPlugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) {
		Bukkit.getServer().broadcastMessage("Player " + event.getPlayer().getName() + " placed " + event.getBlock().getType() + " at " + event.getBlock().getLocation());
	}
}