package com.mineforge.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerJoinMessage extends JavaPlugin implements Listener {
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerJoin(final PlayerJoinEvent event) {
		final Player p = event.getPlayer();
		event.setJoinMessage(ChatColor.GOLD + p.getName() + ChatColor.BLUE + " joined " +  ChatColor.GREEN + "Mine" + ChatColor.RED + "Forge!");
	}
    //Yes, I know, I'm mean to some people. Buahaha.
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerPreConnect(final PlayerLoginEvent event) {
		if(event.getPlayer().getName().equals("huntgus24")) {
			event.disallow(Result.KICK_OTHER, "Mojang has disabled connection with your account.");
		}
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerLeave(final PlayerQuitEvent event) {
		final Player p = event.getPlayer();
		event.setQuitMessage(ChatColor.GOLD + p.getName() + ChatColor.RED + " disconnected.");
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerKicked(final PlayerKickEvent event) {
		final Player p = event.getPlayer();
		event.setLeaveMessage(ChatColor.GOLD + p.getName() + ChatColor.RED + " was kicked for " + event.getReason());
	}
    // These are Murder Message Events, I didn't think we needed them at this point, so I dropped them for now.
    //
	//@EventHandler(priority = EventPriority.HIGH)
	//public void onPlayerDied(final PlayerDeathEvent event) {
	//	final Player p = event.getEntity();
	//	if(event.getEntity().getKiller() == null) {
	//		event.setDeathMessage(ChatColor.DARK_GREEN + p.getName() + ChatColor.GRAY + " was murdered.");
	//	}
	//	else {
	//		event.setDeathMessage(ChatColor.DARK_GREEN + p.getName() + ChatColor.GRAY + " was murdered by " + ChatColor.DARK_RED + p.getKiller().getName());
	//	}
	//}
	//
}