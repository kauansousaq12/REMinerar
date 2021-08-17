package me.reminerar.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvent implements Listener {

    String INV = "§8Mineração - RedeExtreme";


    @EventHandler
    public void onClickMinerar(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equalsIgnoreCase(INV)){
            e.setCancelled(true);
            if(e.getRawSlot() == 10){
                Bukkit.dispatchCommand(p, "warp minanormal");
                p.closeInventory();
            }
            if(e.getRawSlot() == 13){
                Bukkit.dispatchCommand(p, "warp minanether");
                p.closeInventory();
            }
            if(e.getRawSlot() == 16){
                Bukkit.dispatchCommand(p, "warp minaend");
                p.closeInventory();
            }
        }
    }


}
