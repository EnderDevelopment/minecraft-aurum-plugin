package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Aurum plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Aurum plugin disabled!");
    }
}