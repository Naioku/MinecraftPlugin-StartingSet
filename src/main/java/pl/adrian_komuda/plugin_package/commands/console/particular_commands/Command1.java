package pl.adrian_komuda.plugin_package.commands.console.particular_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import pl.adrian_komuda.plugin_package.commands.CommandsPerformers;

import java.util.List;

public class Command1 implements CommandsPerformers {
    @Override
    public void perform(CommandSender commandSender, String command, List<String> args) {

        // Here place Your logic You want to have in this particular command.
        commandSender.sendMessage("Performing " + this.getClass().getSimpleName() + " to Console");
    }
}
