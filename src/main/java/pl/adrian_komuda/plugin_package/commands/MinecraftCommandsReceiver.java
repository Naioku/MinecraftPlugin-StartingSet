package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pl.adrian_komuda.plugin_package.commands.console.AllConsoleCommands;
import pl.adrian_komuda.plugin_package.commands.players.AllPlayersCommands;
import pl.adrian_komuda.plugin_package.commands.players_and_consol.AllPlayersAndConsoleCommands;

public class MinecraftCommandsReceiver implements CommandExecutor {

    Plugin plugin;

    public MinecraftCommandsReceiver(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command commandFromConsole, String label, String[] args) {

        for (AllPlayersAndConsoleCommands command : AllPlayersAndConsoleCommands.values()) {
            if (command.getFullName().equals(commandFromConsole.getName())) {
                command.perform(commandSender, commandFromConsole, args);
            }
        }

        if(!(commandSender instanceof Player)) {
            for (AllConsoleCommands command : AllConsoleCommands.values()) {
                if (command.getFullName().equals(commandFromConsole.getName())) {
                    command.perform(commandSender, commandFromConsole, args);
                }
            }
        }

        if (commandSender instanceof Player player) {
            for (AllPlayersCommands command : AllPlayersCommands.values()) {
                if (command.getFullName().equals(commandFromConsole.getName())) {
                    command.perform(player, commandFromConsole, args);
                }
            }
        }

        return false;
    }
}
