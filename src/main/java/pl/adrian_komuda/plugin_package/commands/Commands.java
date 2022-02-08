package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Commands implements CommandExecutor {

    Plugin plugin;

    public Commands(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        boolean isPlayer = false;
        Player player = null;
        if (commandSender instanceof Player) {
            player = (Player) commandSender;
            isPlayer = true;
        }

        if (!isPlayer) {
            if (command.getName().equals("command1")) {
                System.out.println(ChatColor.AQUA + "command1 from console!");
            }
        } else {
            if (command.getName().equals("command1")) {
                player.sendMessage(ChatColor.AQUA + "command1 from player!");
            }
        }

        return false;
    }
}
