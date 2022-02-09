package pl.adrian_komuda.plugin_package.commands.console;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import pl.adrian_komuda.plugin_package.commands.AllCommandsData;
import pl.adrian_komuda.plugin_package.commands.CommandsPerformers;
import pl.adrian_komuda.plugin_package.commands.console.particular_commands.Command1;

public enum AllConsoleCommands {
    COMMAND1("command1", new Command1());

    private final String commandMinecraftName;
    private final CommandsPerformers commandPerformer;

    AllConsoleCommands(String commandMinecraftName, CommandsPerformers commandPerformer) {
        this.commandMinecraftName = commandMinecraftName;
        this.commandPerformer = commandPerformer;
    }

    public String getFullName() {
        return AllCommandsData.commandPrefix + commandMinecraftName;
    }

    public void perform(CommandSender commandSender, Command commandFromConsole, String[] args) {
        commandPerformer.perform(commandSender, commandFromConsole, args);
    }
}
