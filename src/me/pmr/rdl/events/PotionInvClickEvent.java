package me.pmr.rdl.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.pmr.rdl.Main;
import me.pmr.rdl.commands.AdminPanel;

public class PotionInvClickEvent implements Listener {
	
	private Main plugin = Main.getPlugin(Main.class);
	private AdminPanel ap;
	
	public PotionInvClickEvent(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if(event.getSlot() == -999) {
			return;
		}
		if(event.getInventory().getItem(event.getSlot()) == null) {
			return;
		}
		if (event.getInventory().getName().equals(ChatColor.BOLD + "Select a potion!...")) { // Main Menu
			HumanEntity clicked = event.getWhoClicked();
			Player player = (Player) clicked;
			if ((clicked instanceof Player)) {
				ItemStack item = event.getCurrentItem();
				ItemMeta meta = item.getItemMeta();
				// II Lvl Potions
				if(meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Regeneration (II)")) { // Regeneration
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,199980,1));
					player.sendMessage(ChatColor.GOLD + "Regeneration (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.GRAY + "Speed (II)")) { // Speed
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,199980,1));
					player.sendMessage(ChatColor.GRAY + "Speed (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Instant Health (II)")) { // Instant Health
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL,1,1));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "Instant Health (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.DARK_PURPLE + "Strength (II)")) { // Strength
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,199980,1));
					player.sendMessage(ChatColor.DARK_PURPLE + "Strength (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.DARK_GREEN + "Poison (II)")) { // Poison
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,199980,1));
					player.sendMessage(ChatColor.DARK_GREEN + "Poison (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.GRAY + "Slowness (II)")) { // Slowness
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,199980,1));
					player.sendMessage(ChatColor.GRAY + "Slowness (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				
				if(meta.getDisplayName().equals(ChatColor.DARK_PURPLE + "Instant Damage (II)")) { // Instant Damage
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HARM,1,1));
					player.sendMessage(ChatColor.DARK_PURPLE + "Instant Damage (II) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					event.setCancelled(true);
				}
				// I lvl Potions
				if(meta.getDisplayName().equals(ChatColor.GOLD + "Fire Resistance (I)")) { // Fire Resistance
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,199980,0));
					player.sendMessage(ChatColor.GOLD + "Fire Resistance (I) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
				}
				if(meta.getDisplayName().equals(ChatColor.DARK_BLUE + "Night Vision (I)")) { // Night Vision
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,199980,0));
					player.sendMessage(ChatColor.DARK_BLUE + "Night Vision (I) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
				}
				
				if(meta.getDisplayName().equals(ChatColor.DARK_GRAY + "Invisibility (I)")) { // Invisibility
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,199980,0));
					player.sendMessage(ChatColor.DARK_GRAY + "Invisibility (I) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
				} 
				
				if(meta.getDisplayName().equals(ChatColor.AQUA + "Water Breathing (I)")) { // Water Breathing
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,199980,0));
					player.sendMessage(ChatColor.AQUA + "Water Breathing (I) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					
				}
				
				if(meta.getDisplayName().equals(ChatColor.GRAY + "Weakness (I)")) { // Weakness
					event.setCancelled(true);
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,199980,0));
					player.sendMessage(ChatColor.GRAY + "Weakness (I) " + ChatColor.WHITE + "was given to you!");
					player.closeInventory();
					
				}
				//
				
			}
		}
	}
	
}
