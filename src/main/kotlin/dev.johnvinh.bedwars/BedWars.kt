package dev.johnvinh.bedwars

import org.bukkit.plugin.java.JavaPlugin

class BedWars : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("BedWars has been enabled!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("BedWars has been disabled!")
    }
}