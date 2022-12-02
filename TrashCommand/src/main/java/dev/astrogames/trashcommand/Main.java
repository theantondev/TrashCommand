package dev.astrogames.trashcommand;

import dev.astrogames.trashcommand.commands.trashCMD;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static String prefix = "§bAstro§3Games §8— §7";
    public static String noperms = "§bAstro§3Games §8— §cDazu hast du keine Rechte!";

    @Override
    public void onEnable() {
        // Plugin Start
        Bukkit.getConsoleSender().sendMessage("§[§bAstro§3Games] §aPlugin wurde erfolgreich gestartet.");

        getCommand("trash").setExecutor(new trashCMD());
    }

    @Override
    public void onDisable() {
        // Plugin Shutdown
        Bukkit.getConsoleSender().sendMessage("§[§bAstro§3Games] §cPlugin wurde erfolgreich gestoppt.");
    }
}
