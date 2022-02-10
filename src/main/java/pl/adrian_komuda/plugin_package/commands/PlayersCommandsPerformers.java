package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public interface PlayersCommandsPerformers {
    void perform(Player player, String command, List<String> args);
}
