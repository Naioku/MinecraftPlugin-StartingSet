package pl.adrian_komuda.plugin_package;

import org.bukkit.plugin.java.JavaPlugin;
import pl.adrian_komuda.plugin_package.commands.MinecraftCommandsReceiver;
import pl.adrian_komuda.plugin_package.commands.console.AllConsoleCommands;
import pl.adrian_komuda.plugin_package.commands.players.AllPlayersCommands;
import pl.adrian_komuda.plugin_package.commands.players_and_consol.AllPlayersAndConsoleCommands;

public class Main extends JavaPlugin {
    MinecraftCommandsReceiver commander = new MinecraftCommandsReceiver(this);

    @Override
    public void onEnable() {
        super.onEnable();
        setUpCommands();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void setUpCommands() {
        setUpConsoleCommands();
        setUpPlayersCommands();
        setUpPlayersAndConsoleCommands();
    }

    private void setUpConsoleCommands() {
        getCommand(AllConsoleCommands.COMMAND1.getFullName()).setExecutor(commander);
    }

    private void setUpPlayersCommands() {
        getCommand(AllPlayersCommands.COMMAND2.getFullName()).setExecutor(commander);
    }

    private void setUpPlayersAndConsoleCommands() {
        getCommand(AllPlayersAndConsoleCommands.COMMAND3.getFullName()).setExecutor(commander);
    }
}
