package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pl.adrian_komuda.plugin_package.commands.console.AllConsoleCommands;
import pl.adrian_komuda.plugin_package.commands.players.AllPlayersCommands;
import pl.adrian_komuda.plugin_package.commands.players_and_consol.AllPlayersAndConsoleCommands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinecraftCommandsReceiver implements CommandExecutor, TabCompleter {

    Plugin plugin;

    public MinecraftCommandsReceiver(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command commandPrefix, String label, String[] commandAndArgs) {

        if (commandPrefix.getName().equals(AllCommandsData.commandPrefix)) {
            if(commandAndArgs.length >= 1) {

                String commandReceived = commandAndArgs[0];
                List<String> argsReceived = Arrays.stream(commandAndArgs).toList().subList(1, commandAndArgs.length);

                for (AllPlayersAndConsoleCommands command : AllPlayersAndConsoleCommands.values()) {
                    if (command.getName().equals(commandReceived)) {
                        command.perform(commandSender, commandReceived, argsReceived);
                        return true;
                    }
                }

                if (!(commandSender instanceof Player)) {
                    for (AllConsoleCommands command : AllConsoleCommands.values()) {
                        if (command.getName().equals(commandReceived)) {
                            command.perform(commandSender, commandReceived, argsReceived);
                            return true;
                        }
                    }
                }

                if (commandSender instanceof Player player) {
                    for (AllPlayersCommands command : AllPlayersCommands.values()) {
                        if (command.getName().equals(commandReceived)) {
                            command.perform(player, commandReceived, argsReceived);
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command commandPrefix, String label, String[] commandAndArgs) {
        if (commandPrefix.getName().equals(AllCommandsData.commandPrefix)) {
            if (commandAndArgs.length == 1) {

                List<String> tabCompleteCollection = new ArrayList<>();

                for (AllPlayersAndConsoleCommands command : AllPlayersAndConsoleCommands.values()) {
                    tabCompleteCollection.add(command.getName());
                }

                if (!(commandSender instanceof Player)) {
                    for (AllConsoleCommands command : AllConsoleCommands.values()) {
                        tabCompleteCollection.add(command.getName());
                    }
                }

                if (commandSender instanceof Player) {
                    for (AllPlayersCommands command : AllPlayersCommands.values()) {
                        tabCompleteCollection.add(command.getName());
                    }
                }
                return tabCompleteCollection;
            }
        }

        return null;
    }
}
