package me.reminerar;

import me.reminerar.event.ClickEvent;
import me.reminerar.minerarcommand.MinerarCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a[REMinerar] Plugin ativado");
        Bukkit.getConsoleSender().sendMessage("§aAuthor: KauanConfig");
        Bukkit.getConsoleSender().sendMessage("§aVersion: 1.0");
        Objects.requireNonNull(getCommand("minerar")).setExecutor(new MinerarCommand());
        Bukkit.getServer().getPluginManager().registerEvents(new ClickEvent(), this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[REMinerar] Plugin Desativado");
        Bukkit.getConsoleSender().sendMessage("§aAuthor: KauanConfig");
        Bukkit.getConsoleSender().sendMessage("§aVersion: 1.0");
        super.onDisable();
    }
}
