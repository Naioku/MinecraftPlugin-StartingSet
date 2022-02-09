package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface PlayersCommandsPerformers {
    void perform(Player player, Command commandFromConsole, String[] args);
}
