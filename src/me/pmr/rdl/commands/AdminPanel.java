package me.pmr.rdl.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import me.pmr.rdl.Main;

public class AdminPanel implements CommandExecutor,Listener {
	
	private Main plugin = Main.getPlugin(Main.class);
	private int effectsNum = 0;
	
	public AdminPanel(Main plugin) {
		// Register command
		plugin.getCommand("ap").setExecutor(this);
		// Register Events
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "ERROR: " + ChatColor.GRAY + "This command is not yet available to non-player executers");
			return true;
		}
		if(sender.hasPermission("pm.ap")) {
			Player p = (Player) sender;
			mainMenu(p);
		} else {}
		return true;
	}
	
	public void mainMenu(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.BOLD + "Select An Action!...");
		// Create ItemStack
		ItemStack managePlayers = new ItemStack(Material.ARMOR_STAND);
		ItemStack manageYourself = new ItemStack(Material.ARMOR_STAND);
		// Get ItemMeta's
		ItemMeta mpm = managePlayers.getItemMeta();
		ItemMeta mym = manageYourself.getItemMeta();
		// Set ItemMeta's
		mpm.setDisplayName(ChatColor.RED + ""+ChatColor.BOLD + "Manage Players");
		mym.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Manage yourself");
		// Add Meta's to Stacks
		managePlayers.setItemMeta(mpm);
		manageYourself.setItemMeta(mym);
		// Add Items to Inventory
		inv.setItem(7,managePlayers);
		inv.setItem(1,manageYourself);
		// Open Inv
		p.openInventory(inv);
	}
	
	public void mYourSelf(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.BOLD + "Select An Action!....");
		// Item Stacks
		ItemStack Gamemodes = new ItemStack(Material.COMMAND);
		ItemStack Potions = new ItemStack(Material.POTION,1,(short)7);
		ItemStack Close = new ItemStack(Material.BARRIER);
		// Item Metas
		ItemMeta gm = Gamemodes.getItemMeta();
		ItemMeta pm = Potions.getItemMeta();
		ItemMeta cm = Close.getItemMeta();
		// Set Item Meta
		gm.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Gamemodes");
		pm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		pm.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Potions");
		cm.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Go Back");
		// Add Meta's to items
		Gamemodes.setItemMeta(gm);
		Potions.setItemMeta(pm);
		Close.setItemMeta(cm);
		// Add Items to Inv
		inv.setItem(8, Close);
		inv.addItem(Potions);
		inv.addItem(Gamemodes);
		//
		p.openInventory(inv);
		
	}
	
	public void gamemodesMenu(Player p) {
		Inventory inv = Bukkit.createInventory(null, 36, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Select your gamemode!...");
		// Item Stacks
		ItemStack survival = new ItemStack(Material.INK_SACK, 1, (short)14);
		ItemStack adventure = new ItemStack(Material.INK_SACK,1,(short)1);
		ItemStack creative = new ItemStack(Material.INK_SACK,1,(short)5);
		ItemStack spectator = new ItemStack(Material.INK_SACK,1,(short)8);
		ItemStack close = new ItemStack(Material.BARRIER);
		// Item Metas
		ItemMeta sm = survival.getItemMeta();
		ItemMeta am = adventure.getItemMeta();
		ItemMeta cm = creative.getItemMeta();
		ItemMeta spm = spectator.getItemMeta();
		ItemMeta bm = close.getItemMeta();
		// Set Item Metas
		sm.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Survival");
		am.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Adventure");
		cm.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Creative");
		spm.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Spectator");
		bm.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Go Back");
		// Add metas to stacks
		survival.setItemMeta(sm);
		adventure.setItemMeta(am);
		creative.setItemMeta(cm);
		spectator.setItemMeta(spm);
		close.setItemMeta(bm);
		// Add items to inv
		inv.setItem(31, close);
		inv.setItem(10, survival);
		inv.setItem(12, adventure);
		inv.setItem(14, creative);
		inv.setItem(16, spectator);
		inv.setItem(31, close);
		// Open inv
		p.openInventory(inv);
	}
	
	public void potionMenu(Player p) {
		Inventory inv = Bukkit.createInventory(null, 27, ChatColor.BOLD + "Select a potion!...");
		// ItemStacks
		ItemStack info = new ItemStack(Material.BOOK);
		ItemStack close = new ItemStack(Material.BARRIER);
		ItemStack reset = new ItemStack(Material.MILK_BUCKET);
		
		ItemStack potion_1 = new ItemStack(Material.POTION);
		ItemStack potion_2 = new ItemStack(Material.POTION);
		ItemStack potion_3 = new ItemStack(Material.POTION);
		ItemStack potion_4 = new ItemStack(Material.POTION);
		ItemStack potion_5 = new ItemStack(Material.POTION);
		ItemStack potion_6 = new ItemStack(Material.POTION);
		ItemStack potion_7 = new ItemStack(Material.POTION);
		ItemStack potion_8 = new ItemStack(Material.POTION);
		ItemStack potion_9 = new ItemStack(Material.POTION);
		ItemStack potion_10 = new ItemStack(Material.POTION);
		ItemStack potion_11 = new ItemStack(Material.POTION);
		ItemStack potion_12 = new ItemStack(Material.POTION);

		
		// ItemMetas
		
		ItemMeta info_m = info.getItemMeta();
		ItemMeta close_m = close.getItemMeta();
		ItemMeta reset_m = reset.getItemMeta();
		
		ItemMeta potion_1_m = potion_1.getItemMeta();
		ItemMeta potion_2_m = potion_2.getItemMeta();
		ItemMeta potion_3_m = potion_3.getItemMeta();
		ItemMeta potion_4_m = potion_4.getItemMeta();
		ItemMeta potion_5_m = potion_5.getItemMeta();
		ItemMeta potion_6_m = potion_6.getItemMeta();
		ItemMeta potion_7_m = potion_7.getItemMeta();
		ItemMeta potion_8_m = potion_8.getItemMeta();
		ItemMeta potion_9_m = potion_9.getItemMeta();
		ItemMeta potion_10_m = potion_10.getItemMeta();
		ItemMeta potion_11_m = potion_11.getItemMeta();
		ItemMeta potion_12_m = potion_12.getItemMeta();


		// Set ItemMetas
		
		// Info and Back
		info_m.setDisplayName(ChatColor.GREEN + "Info");
		info_m.setLore(Arrays.asList(ChatColor.WHITE + "All potions you choose will be given!",ChatColor.WHITE + "BUT. It will not have a time limit, IT will be limitless"));
		reset_m.setDisplayName(ChatColor.RED + "Reset Effects");
		reset_m.setLore(Arrays.asList(ChatColor.WHITE + "This will reset all your effects!"));
		close_m.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Go Back");
		// Potions
		potion_1_m.setDisplayName(ChatColor.LIGHT_PURPLE + "Regeneration (II)");
		potion_2_m.setDisplayName(ChatColor.GRAY + "Speed (II)");
		potion_3_m.setDisplayName(ChatColor.GOLD + "Fire Resistance (I)");
		potion_4_m.setDisplayName(ChatColor.LIGHT_PURPLE + "Instant Health (II)");
		potion_5_m.setDisplayName(ChatColor.DARK_BLUE + "Night Vision (I)");
		potion_6_m.setDisplayName(ChatColor.DARK_PURPLE + "Strength (II)");
		potion_7_m.setDisplayName(ChatColor.DARK_GRAY + "Invisibility (I)");
		potion_8_m.setDisplayName(ChatColor.AQUA + "Water Breathing (I)");
		potion_9_m.setDisplayName(ChatColor.DARK_GREEN + "Poison (II)");
		potion_10_m.setDisplayName(ChatColor.GRAY + "Weakness (I)");
		potion_11_m.setDisplayName(ChatColor.GRAY + "Slowness (II)");
		potion_12_m.setDisplayName(ChatColor.DARK_PURPLE + "Instant Damage (II)");
		// Hide Flag
		potion_1_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_2_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_3_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_4_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_5_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_6_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_7_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_8_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_9_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_10_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_11_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		potion_12_m.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		// Lores
		potion_1_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_2_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_3_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_4_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_5_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_6_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_7_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_8_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_9_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_10_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_11_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		potion_12_m.setLore(Arrays.asList(ChatColor.WHITE + "Duration: 99:99"));
		
		// Add ItemMetas
		info.setItemMeta(info_m);
		reset.setItemMeta(reset_m);
		close.setItemMeta(close_m);
		//Potions
		 potion_1.setItemMeta(potion_1_m);
		 potion_2.setItemMeta(potion_2_m);
		 potion_3.setItemMeta(potion_3_m);
		 potion_4.setItemMeta(potion_4_m);
		 potion_5.setItemMeta(potion_5_m);
		 potion_6.setItemMeta(potion_6_m);
		 potion_7.setItemMeta(potion_7_m);
		 potion_8.setItemMeta(potion_8_m);
		 potion_9.setItemMeta(potion_9_m);
		 potion_10.setItemMeta(potion_10_m);
		 potion_11.setItemMeta(potion_11_m);
		 potion_12.setItemMeta(potion_12_m);
		 //

		// Add Items
		inv.setItem(8, info);
		inv.setItem(17, reset);
		inv.setItem(26, close);
		//Potions
		inv.setItem(0, potion_1);
		inv.setItem(1, potion_2);
		inv.setItem(2, potion_3);
		inv.setItem(9, potion_4);
		inv.setItem(10, potion_5);
		inv.setItem(11, potion_6);
		inv.setItem(18, potion_7);
		inv.setItem(19, potion_8);
		inv.setItem(20, potion_9);
		// Last 3
		inv.setItem(3, potion_10);
		inv.setItem(12, potion_11);
		inv.setItem(21, potion_12);
		// Open Inv
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if(event.getSlot() == -999) {
			return;
		}
		if(event.getInventory().getItem(event.getSlot()) == null) {
			return;
		}
		if (event.getInventory().getName().equals(ChatColor.BOLD + "Select An Action!...")) { // Main Menu
			HumanEntity clicked = event.getWhoClicked();
			Player player = (Player) clicked;
			if ((clicked instanceof Player)) {
				ItemStack item = event.getCurrentItem();
				ItemMeta meta = item.getItemMeta();
				if(meta.getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD + "Manage yourself")) {
					mYourSelf(player);
				}
			}
		}
		if (event.getInventory().getName().equals(ChatColor.BOLD + "Select An Action!....")) { // Manage Your Self
			HumanEntity clicked = event.getWhoClicked();
			Player player = (Player) clicked;
			if ((clicked instanceof Player)) {
				ItemStack item = event.getCurrentItem();
				ItemMeta meta = item.getItemMeta();
				if(meta.getDisplayName().equals(ChatColor.RED +"" + ChatColor.BOLD + "Go Back")) {
					player.closeInventory();
					mainMenu(player);
				}
				if(meta.getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Gamemodes")) {
					player.closeInventory();
					gamemodesMenu(player);
				}
				if(meta.getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Potions")) {
					player.closeInventory();
					potionMenu(player);
				}
			}
			
		}
		if (event.getInventory().getName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Select your gamemode!...")) { // Gamemodes
			HumanEntity clicked = event.getWhoClicked();
			Player player = (Player) clicked;
			if ((clicked instanceof Player)) {
				ItemStack item = event.getCurrentItem();
				ItemMeta meta = item.getItemMeta();
				if(meta.getDisplayName().equals(ChatColor.RED +"" + ChatColor.BOLD + "Survival")) { // Survival
					player.setGameMode(GameMode.SURVIVAL);
					player.closeInventory();
					player.sendMessage(ChatColor.WHITE + "Your gamemode is now " + ChatColor.RED + player.getGameMode().toString());
				}
				if(meta.getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Adventure")) { // Adventure
					player.setGameMode(GameMode.ADVENTURE);
					player.closeInventory();
					player.sendMessage(ChatColor.WHITE + "Your gamemode is now " + ChatColor.GOLD + player.getGameMode().toString());
				}
				if(meta.getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Creative")) { // Creative
					player.setGameMode(GameMode.CREATIVE);
					player.closeInventory();
					player.sendMessage(ChatColor.WHITE + "Your gamemode is now " + ChatColor.GREEN + player.getGameMode().toString());
				}
				if(meta.getDisplayName().equals(ChatColor.GRAY + "" + ChatColor.BOLD + "Spectator")) { // Spectator
					player.setGameMode(GameMode.SPECTATOR);
					player.closeInventory();
					player.sendMessage(ChatColor.WHITE + "Your gamemode is now " + ChatColor.GRAY + player.getGameMode().toString());
				}
				if(meta.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Go Back")) {
					player.closeInventory();
					mYourSelf(player);
				}
				if(meta.getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Gamemodes")) {
					gamemodesMenu(player);
				}
			}
			
		}
		if(event.getInventory().getName().equals(ChatColor.BOLD + "Select a potion!...")) {
			HumanEntity clicked = event.getWhoClicked();
			Player player = (Player) clicked;
			if((clicked instanceof Player)) {
				ItemStack item = event.getCurrentItem();
				ItemMeta meta = item.getItemMeta();
				// Close Reset and Info
				if(meta.getDisplayName().equals(ChatColor.GREEN + "Info")) { // Info
					event.setCancelled(true);
				}
				if(meta.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Go Back")) { // Go Back
					event.setCancelled(true);
					player.closeInventory();
					mYourSelf(player);
					
				}
				
				if(meta.getDisplayName().equals(ChatColor.RED + "Reset Effects")) { // Remove Effects
					effectsNum=0;
					event.setCancelled(true);
					for(PotionEffect effect : player.getActivePotionEffects()) {
						
						player.removePotionEffect(effect.getType());
						effectsNum++;
					}
					if(effectsNum == 0) {player.sendMessage(ChatColor.RED + "0" + ChatColor.WHITE + " Effects were found!, I removed them successfully");player.closeInventory();return;}
					if(effectsNum == 1) {player.sendMessage(ChatColor.GREEN + "" + effectsNum + ChatColor.WHITE + " Effect were found!, I removed them successfully");player.closeInventory();return;}
					if(effectsNum >= 2) {player.sendMessage(ChatColor.GREEN + "" + effectsNum + ChatColor.WHITE + " Effects were found!, I removed them successfully");player.closeInventory();return;}
					
					
				}
			}
		}
		
		
	}

}
