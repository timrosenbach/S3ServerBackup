package me.rosenbach.s3backup.commands;

import me.rosenbach.s3backup.tasks.BackupTask;
import me.rosenbach.s3backup.enums.Permission;
import me.rosenbach.s3backup.MinecraftS3Backup;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class BackupCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!sender.hasPermission(Permission.BACKUP.value())) {
            MinecraftS3Backup.getInstance().sendMessage(sender, "No permission to run command " + label);
        }

        if (args.length == 0) {
            return false;
        }

        if ("now".equals(args[0])) {
            Bukkit.getScheduler().runTaskAsynchronously(MinecraftS3Backup.getInstance(), new BackupTask(MinecraftS3Backup.getInstance(), sender));
        }

        return false;
    }
}