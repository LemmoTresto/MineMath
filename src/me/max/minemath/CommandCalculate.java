package me.max.minemath;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by max on 1-3-2017.
 */

public class CommandCalculate implements CommandExecutor {
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
        } else if (args[1].equals("*")) {
            double arg1 = Double.parseDouble(args[0]);
            double arg2 = Double.parseDouble(args[2]);
            sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + arg1 + " * " + arg2 + " = " + (arg1 * arg2));
            return true;
        } else if (args[1].equals("+")) {
            double arg1 = Double.parseDouble(args[0]);
            double arg2 = Double.parseDouble(args[2]);
            sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + arg1 + " + " + arg2 + " = " + (arg1 + arg2));
            return true;
        } else if (args[1].equals("-")) {
            double arg1 = Double.parseDouble(args[0]);
            double arg2 = Double.parseDouble(args[2]);
            sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + arg1 + " - " + arg2 + " = " + (arg1 - arg2));
            return true;
        } else if (args[1].equals("/")) {
            if (args[0].equals("0") || args[2].equalsIgnoreCase("0")) {
                sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + "You cannot use a zero in a division!");
            } else {
                double arg1 = Double.parseDouble(args[0]);
                double arg2 = Double.parseDouble(args[2]);
                sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + arg1 + " / " + arg2 + " = " + (arg1 / arg2));
                return true;
            }
        } else if (args[1].equals("%")) {
            if (args[0].equals("0") || args[2].equalsIgnoreCase("0")) {
                sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + "You cannot use a zero in a remainder!");
            } else {
                double arg1 = Double.parseDouble(args[0]);
                double arg2 = Double.parseDouble(args[2]);
                sender.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_AQUA + arg1 + " % " + arg2 + " = " + (arg1 % arg2));
                return true;

            }
        } else {
            return false;
        }
    return false;
    }
}
