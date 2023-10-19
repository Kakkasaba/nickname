package org.uminokun.nickname.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class nickname implements CommandExecutor
{
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, String[] strings)
    {
        if (!(commandSender instanceof Player p))
        {
            commandSender.sendMessage(ChatColor.RED + "プレイヤーのみでしか実行できません");
            return true;
        }
        if (strings.length > 1)
        {
            commandSender.sendMessage(ChatColor.RED + "引数が不明です");
            return true;
        }

        if (strings[0].length() > 16)
        {
            commandSender.sendMessage(ChatColor.RED + "ニックネームは最大文字16文字です");
        }
        final String name = ChatColor.translateAlternateColorCodes('&', strings[0]);

        p.setPlayerListName(name);
        p.setDisplayName(name);
        commandSender.sendMessage(ChatColor.WHITE + "あなたのニックネームを " + ChatColor.RESET + name + ChatColor.WHITE + " に設定しました");

        return true;
    }
}
