package edu.unca.jruggier.FirstPlugin.FirstPlugin;

/*
    This file is part of FirstPlugin

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.logging.Logger;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class FirstPlugin extends JavaPlugin {

private final FirstPluginCommandExecutor commandExecutor = new FirstPluginCommandExecutor(this);
private final FirstPluginEventListener eventListener = new FirstPluginEventListener(this);	
	
	
Logger log; 
	
	@Override  
	public void onDisable() {
			log.info("First Plugin has been disabled.");
	}
	
	public void onEnable() {
		
			saveDefaultConfig(); 
			
			log = this.getLogger();
			
			log.info("First plugin has been enabled.");
			
			PluginManager pm = this.getServer().getPluginManager();

			getCommand("glass").setExecutor(commandExecutor);
			getCommand("chest").setExecutor(commandExecutor);
			getCommand("diamond").setExecutor(commandExecutor);
			// you can register multiple classes to handle events if you want
			// just call pm.registerEvents() on an instance of each class
			pm.registerEvents(eventListener, this);

			

	
	}

}