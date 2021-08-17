package me.reminerar.minerarcommand;

import me.reminerar.event.Item;
import me.reminerar.event.XMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MinerarCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("minerar")){
            Inventory minerar = Bukkit.createInventory(p.getPlayer(), 3*9, "§8Mineração - RedeExtreme");
            ItemStack world1 = new Item(Material.GRASS).setDisplayName("§aMundo Normal").setLore(
                    "", "§7Mundo normal", "§7aonde você pode minerar e conseguir", "§7seus minerios aproveite!", "", "§aClique para entrar"
            ).build();
            ItemStack world2 = new Item(Material.NETHERRACK).setDisplayName("§cMundo Nether").setLore(
                    "", "§7Mundo Nether", "§7aonde você pode minerar e conseguir", "§7seus minerios aproveite!", "", "§aClique para entrar"
            ).build();
            ItemStack world3 = new Item(XMaterial.END_STONE.parseMaterial()).setDisplayName("§5Mundo End").setLore(
                    "", "§7Mundo End", "§7aonde você pode minerar e conseguir", "§7seus minerios aproveite!", "", "§aClique para entrar"
            ).build();

            p.openInventory(minerar);
            minerar.setItem(10, world1);
            minerar.setItem(13, world2);
            minerar.setItem(16, world3);
        }
        return false;
    }
}
