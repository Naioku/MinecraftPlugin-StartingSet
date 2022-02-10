package pl.adrian_komuda.plugin_package.commands.players.particular_commands;

import org.bukkit.entity.Player;
import pl.adrian_komuda.plugin_package.commands.PlayersCommandsPerformers;

import java.util.List;

public class Command4 implements PlayersCommandsPerformers {
    @Override
    public void perform(Player player, String command, List<String> args) {
        if (args.size() == 1) {
            // Here place Your logic You want to have in this particular command.
            player.sendMessage("Performing " + this.getClass().getSimpleName() + " to Player with args: " + args.get(0));
        }
    }
}
