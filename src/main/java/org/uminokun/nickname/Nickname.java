package org.uminokun.nickname;

import org.bukkit.plugin.java.JavaPlugin;
import org.uminokun.nickname.commands.nickname;

public final class Nickname extends JavaPlugin {

    @Override
    public void onEnable()
    {
        getCommand("nickname").setExecutor(new nickname());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
