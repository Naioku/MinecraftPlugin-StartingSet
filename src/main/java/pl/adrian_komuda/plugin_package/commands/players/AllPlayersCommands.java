package pl.adrian_komuda.plugin_package.commands.players;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.adrian_komuda.plugin_package.commands.AllCommandsData;
import pl.adrian_komuda.plugin_package.commands.CommandsPerformers;
import pl.adrian_komuda.plugin_package.commands.PlayersCommandsPerformers;
import pl.adrian_komuda.plugin_package.commands.console.particular_commands.Command1;
import pl.adrian_komuda.plugin_package.commands.players.particular_commands.Command2;

public enum AllPlayersCommands {
    COMMAND2("command2", new Command2());

    private final String commandMinecraftName;
    private final PlayersCommandsPerformers commandPerformer;

    AllPlayersCommands(String commandMinecraftName, PlayersCommandsPerformers commandPerformer) {
        this.commandMinecraftName = commandMinecraftName;
        this.commandPerformer = commandPerformer;
    }

    public String getFullName() {
        return AllCommandsData.commandPrefix + commandMinecraftName;
    }

    public void perform(Player player, Command commandFromConsole, String[] args) {
        commandPerformer.perform(player, commandFromConsole, args);
    }
}
