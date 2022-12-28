package net.ssgssp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class BlkdespEvListener implements Listener {
    @EventHandler
    public void BlkdespEvent(BlockDispenseEvent bd){
        if(bd.getItem().getType().name().toLowerCase().endsWith("shulker_box")){
            Block blk1 = bd.getBlock();
            if(blk1.getType() == Material.DISPENSER){
                BlockState blkstat = blk1.getState();
                Location loca = blkstat.getLocation();
                int x1 = loca.getBlockX();
                int y1 = loca.getBlockY();
                int z1 = loca.getBlockZ();
                World worldp1 = blkstat.getWorld();
                //以下为获取发射器六面相邻方块的范围内是否有力场
                int xa = x1+1;//1
                int xb = x1-1;//2
                int zc = z1+1;//3
                int zd = z1-1;//4
                int ye = y1+1;//5
                int yf = y1-1;//6
                Block blka1 = worldp1.getBlockAt(xa+1,y1,z1);
                Block blkb1 = worldp1.getBlockAt(xa-1,y1,z1);
                Block blkc1 = worldp1.getBlockAt(xa,y1,z1+1);
                Block blkd1 = worldp1.getBlockAt(xa,y1,z1-1);
                Block blke1 = worldp1.getBlockAt(xa,y1+1,z1);
                Block blkf1 = worldp1.getBlockAt(xa,y1-1,z1);
                Block blka2 = worldp1.getBlockAt(xb+1,y1,z1);
                Block blkb2 = worldp1.getBlockAt(xb-1,y1,z1);
                Block blkc2 = worldp1.getBlockAt(xb,y1,z1+1);
                Block blkd2 = worldp1.getBlockAt(xb,y1,z1-1);
                Block blke2 = worldp1.getBlockAt(xb,y1+1,z1);
                Block blkf2 = worldp1.getBlockAt(xb,y1-1,z1);
                Block blka3 = worldp1.getBlockAt(x1+1,y1,zc);
                Block blkb3 = worldp1.getBlockAt(x1-1,y1,zc);
                Block blkc3 = worldp1.getBlockAt(x1,y1,zc+1);
                Block blkd3 = worldp1.getBlockAt(x1,y1,zc-1);
                Block blke3 = worldp1.getBlockAt(x1,y1+1,zc);
                Block blkf3 = worldp1.getBlockAt(x1,y1-1,zc);
                Block blka4 = worldp1.getBlockAt(x1+1,y1,zd);
                Block blkb4 = worldp1.getBlockAt(x1-1,y1,zd);
                Block blkc4 = worldp1.getBlockAt(x1,y1,zd+1);
                Block blkd4 = worldp1.getBlockAt(x1,y1,zd-1);
                Block blke4 = worldp1.getBlockAt(x1,y1+1,zd);
                Block blkf4 = worldp1.getBlockAt(x1,y1-1,zd);
                Block blka5 = worldp1.getBlockAt(x1+1,ye,z1);
                Block blkb5 = worldp1.getBlockAt(x1-1,ye,z1);
                Block blkc5 = worldp1.getBlockAt(x1,ye,z1+1);
                Block blkd5 = worldp1.getBlockAt(x1,ye,z1-1);
                Block blke5 = worldp1.getBlockAt(x1,ye+1,z1);
                Block blkf5 = worldp1.getBlockAt(x1,ye-1,z1);
                Block blka6 = worldp1.getBlockAt(x1+1,yf,z1);
                Block blkb6 = worldp1.getBlockAt(x1-1,yf,z1);
                Block blkc6 = worldp1.getBlockAt(x1,yf,z1+1);
                Block blkd6 = worldp1.getBlockAt(x1,yf,z1-1);
                Block blke6 = worldp1.getBlockAt(x1,yf+1,z1);
                Block blkf6 = worldp1.getBlockAt(x1,yf-1,z1);
                //以下判定力场
                boolean bool1 = blka1.getType().name().toLowerCase().endsWith("force_field") || blkb1.getType().name().toLowerCase().endsWith("force_field") || blkc1.getType().name().toLowerCase().endsWith("force_field") || blkd1.getType().name().toLowerCase().endsWith("force_field") || blke1.getType().name().toLowerCase().endsWith("force_field") || blkf1.getType().name().toLowerCase().endsWith("force_field");
                boolean bool2 = blka2.getType().name().toLowerCase().endsWith("force_field") || blkb2.getType().name().toLowerCase().endsWith("force_field") || blkc2.getType().name().toLowerCase().endsWith("force_field") || blkd2.getType().name().toLowerCase().endsWith("force_field") || blke2.getType().name().toLowerCase().endsWith("force_field") || blkf2.getType().name().toLowerCase().endsWith("force_field");
                boolean bool3 = blka3.getType().name().toLowerCase().endsWith("force_field") || blkb3.getType().name().toLowerCase().endsWith("force_field") || blkc3.getType().name().toLowerCase().endsWith("force_field") || blkd3.getType().name().toLowerCase().endsWith("force_field") || blke3.getType().name().toLowerCase().endsWith("force_field") || blkf3.getType().name().toLowerCase().endsWith("force_field");
                boolean bool4 = blka4.getType().name().toLowerCase().endsWith("force_field") || blkb4.getType().name().toLowerCase().endsWith("force_field") || blkc4.getType().name().toLowerCase().endsWith("force_field") || blkd4.getType().name().toLowerCase().endsWith("force_field") || blke4.getType().name().toLowerCase().endsWith("force_field") || blkf4.getType().name().toLowerCase().endsWith("force_field");
                boolean bool5 = blka5.getType().name().toLowerCase().endsWith("force_field") || blkb5.getType().name().toLowerCase().endsWith("force_field") || blkc5.getType().name().toLowerCase().endsWith("force_field") || blkd5.getType().name().toLowerCase().endsWith("force_field") || blke5.getType().name().toLowerCase().endsWith("force_field") || blkf5.getType().name().toLowerCase().endsWith("force_field");
                boolean bool6 = blka6.getType().name().toLowerCase().endsWith("force_field") || blkb6.getType().name().toLowerCase().endsWith("force_field") || blkc6.getType().name().toLowerCase().endsWith("force_field") || blkd6.getType().name().toLowerCase().endsWith("force_field") || blke6.getType().name().toLowerCase().endsWith("force_field") || blkf6.getType().name().toLowerCase().endsWith("force_field");
                boolean boolfin = bool1 || bool2 || bool3 || bool4 || bool5 || bool6 ;
                if(boolfin){
                    bd.setCancelled(true);
                    CommandSender sender1 = Bukkit.getConsoleSender();
                    String q1 = String.valueOf(x1);
                    String q2 = String.valueOf(y1);
                    String q3 = String.valueOf(z1);
                    String q4 = String.valueOf(worldp1);
                    String message1 = "一个位于({x},{y},{z})，维度{world}的发射器试图发射潜影盒到力场附近，已阻止";
                    String mes1 = message1.replace("{x}",q1).replace("{y}",q2).replace("{z}",q3).replace("{world}",q4);
                    sender1.sendMessage(mes1);
                }
            }
        }
    }
}
