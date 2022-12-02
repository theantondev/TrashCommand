package dev.astrogames.trashcommand.commands;

import dev.astrogames.trashcommand.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class trashCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] string) {
        Player p = (Player) sender;
        if (p.hasPermission("trashcommand.use")){
           if (sender instanceof Player){
               Inventory inventory = Bukkit.createInventory(p, 9*3, "§8• §bAstro§3Games §8| §cMülleimer");
               p.openInventory(inventory);
           }
        }else
            p.sendMessage(Main.noperms);
        return false;
    }
}
