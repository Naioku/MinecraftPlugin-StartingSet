package pl.adrian_komuda.plugin_package.commands.players_and_consol;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import pl.adrian_komuda.plugin_package.commands.AllCommandsData;
import pl.adrian_komuda.plugin_package.commands.CommandsPerformers;
import pl.adrian_komuda.plugin_package.commands.console.particular_commands.Command1;
import pl.adrian_komuda.plugin_package.commands.players_and_consol.particular_commands.Command3;

import java.util.List;

public enum AllPlayersAndConsoleCommands {
    COMMAND3("command3", new Command3());

    private final String commandMinecraftName;
    private final CommandsPerformers commandPerformer;

    AllPlayersAndConsoleCommands(String commandMinecraftName, CommandsPerformers commandPerformer) {
        this.commandMinecraftName = commandMinecraftName;
        this.commandPerformer = commandPerformer;
    }

    public String getName() {
        return commandMinecraftName;
    }

    public void perform(CommandSender commandSender, String command, List<String> args) {
        commandPerformer.perform(commandSender, command, args);
    }
}
