package me.max.minemath;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by max on 2-3-2017.
 */
public class CommandCalculateBlocks implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args[0].equalsIgnoreCase("help")){
            return false;
        }
        if (args.length == 0){
            return false;
        }
        if (args.length != 3) {
            sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + "Error: you have given " + args.length + " argument(s) but you have to give 3 arguments");
        }
        
    return false;
    }
}


