package net.ssgssp;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class EvListener implements Listener {
  @EventHandler
  public void BlkPlaceevent(BlockPlaceEvent pe) {
    if (pe.getItemInHand().getType().name().toLowerCase().endsWith("shulker_box")) {
      BlockState blstate = pe.getBlockReplacedState();
      Location block1 = blstate.getLocation();
      int x = block1.getBlockX();
      int y = block1.getBlockY();
      int z = block1.getBlockZ();
      World world = blstate.getWorld();
      Block blocka = world.getBlockAt(x+1,y,z);
      Block blockb = world.getBlockAt(x-1,y,z);
      Block blockc = world.getBlockAt(x,y,z+1);
      Block blockd = world.getBlockAt(x,y,z-1);
      Block blocke = world.getBlockAt(x,y+1,z);
      Block blockf = world.getBlockAt(x,y-1,z);
      boolean trorfu = blocka.getType().name().toLowerCase().endsWith("force_field") || blockb.getType().name().toLowerCase().endsWith("force_field") || blockc.getType().name().toLowerCase().endsWith("force_field") || blockd.getType().name().toLowerCase().endsWith("force_field") || blocke.getType().name().toLowerCase().endsWith("force_field") || blockf.getType().name().toLowerCase().endsWith("force_field");
      if(trorfu){
        pe.setCancelled(true);
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(pe.getPlayer()+"尝试在力场旁放置潜影盒，已阻止");
      }
    }
  }
}