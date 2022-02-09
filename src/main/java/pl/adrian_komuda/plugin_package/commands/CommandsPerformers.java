package pl.adrian_komuda.plugin_package.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface CommandsPerformers {
    void perform(CommandSender commandSender, Command commandFromConsole, String[] args);
}
