package com.mineforge.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable(){
		getLogger().info("[Mineforge Main] Enabled");
		getServer().getPluginManager().registerEvents(new PlayerJoinMessage(), this);
	}

	@Override
	public void onDisable(){
		getLogger().info("[Mineforge Main] Disabled");
	}
}
