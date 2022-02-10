package pl.adrian_komuda.plugin_package;

import org.bukkit.plugin.java.JavaPlugin;
import pl.adrian_komuda.plugin_package.commands.AllCommandsData;
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
        getCommand(AllCommandsData.commandPrefix).setExecutor(commander);
    }
}
