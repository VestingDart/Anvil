package org.vestingdart.anvil;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Anvil implements CommandExecutor {
    private Object aNull;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.hasPermission("galaxicraft.multi.anvil")) {
            player.getInventory(null,true);

        } else {
            player.sendMessage("§x§7§C§1§3§F§BG§x§8§4§2§5§F§Ba§x§8§C§3§8§F§Cl§x§9§4§4§A§F§Ca§x§9§C§5§C§F§Dx§x§A§4§6§F§F§Di§x§A§B§8§1§F§DC§x§B§3§9§3§F§Er§x§B§B§A§5§F§Ea§x§C§3§B§8§F§Ff§x§C§B§C§A§F§Ft §8•§4 Du hast dafür keine Rechte.");
        }
        return false;

    }
}

