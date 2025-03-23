package org.vestingdart.anvil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

public class Workbench implements CommandExecutor {
    private Object aNull;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            return true;
        }
        Player player = (Player) commandSender;

        if (player.hasPermission("galaxicraft.multi.workbench")) {
            player.getInventory();
            player.openInventory(Bukkit.createInventory(null, InventoryType.WORKBENCH));
        }

        return true;
    }
}
//test