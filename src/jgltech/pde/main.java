package jgltech.pde;

import org.bukkit.plugin.java.JavaPlugin;

import java.nio.charset.StandardCharsets;


public class main extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("[PDE is enabled]");
        System.out.println("Ready...");
        ready = true;

    }

    @Override
    public void onDisable() {
        getLogger().info("[PDE is disabled]");
    }


    }
