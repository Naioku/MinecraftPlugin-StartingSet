package pl.adrian_komuda.plugin_package;

import org.bukkit.plugin.java.JavaPlugin;
import pl.adrian_komuda.plugin_package.commands.Commands;

public class Main extends JavaPlugin {
    Commands commander;

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
        commander = new Commands(this);
        getCommand("command1").setExecutor(commander);
    }
}
