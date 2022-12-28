package net.ssgssp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BanForceplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件已加载");
        Bukkit.getPluginManager().registerEvents(new EvListener(),this);
        Bukkit.getPluginManager().registerEvents(new BlkdespEvListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件已卸载");
    }
}
