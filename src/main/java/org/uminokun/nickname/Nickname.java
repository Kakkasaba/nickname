package org.uminokun.nickname;

import org.bukkit.plugin.java.JavaPlugin;
import org.uminokun.nickname.commands.editname;
import org.uminokun.nickname.commands.nickname;

import static java.util.Objects.requireNonNull;

public final class Nickname extends JavaPlugin {

    @Override
    public void onEnable()
    {
        requireNonNull(getCommand("editname")).setExecutor(new editname());
        requireNonNull(getCommand("nickname")).setExecutor(new nickname());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
