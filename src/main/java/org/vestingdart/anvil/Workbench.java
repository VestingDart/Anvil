package org.vestingdart.anvil;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Workbench implements CommandExecutor {
    private Object aNull;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.hasPermission("galaxicraft.multi.workbench")) {
            player.getInventory();
            player.openWorkbench()
        }

        return false;
    }
}
