package org.vestingdart.anvil;

import org.bukkit.inventory.AnvilInventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("anvil").setExecutor(new Anvil());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
