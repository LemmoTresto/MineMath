package me.max.minemath;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by max on 27-2-2017.
 */
public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        // When server enables the plugin.
        getLogger().info("Enabling Command: Calculate");
        this.getCommand("calculate").setExecutor(new CommandCalculate());
        getLogger().info("Enabling Command: CalculateBlocks");
        this.getCommand("calculateblocks").setExecutor(new CommandCalculateBlocks());
        getLogger().info("Has succesfully enabled!");
    }

    @Override
    public void onDisable(){
        // When server disables the plugin.
        getLogger().info("Disabling Command: Calculate");
        getLogger().info("Disabling Command: CalculateBlock");
        getLogger().info("Has succesfully disabled!");
    }

}
