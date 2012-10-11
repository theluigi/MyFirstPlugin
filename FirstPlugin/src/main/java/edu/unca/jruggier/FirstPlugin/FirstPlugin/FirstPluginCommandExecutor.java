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

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;


public class FirstPluginCommandExecutor implements CommandExecutor {

    private FirstPlugin plugin;

    public FirstPluginCommandExecutor(FirstPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin.getLogger().info("onCommand Reached in FirstPlugin");

               
        if (command.getName().equalsIgnoreCase("glass")){
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack glass = new ItemStack(57);
			inventory.addItem(glass);
			plugin.getLogger().info("You receive a block of glass.");
			return true;
        	
        }
        
        if (command.getName().equalsIgnoreCase("chest")){
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack chest = new ItemStack(95);
			inventory.addItem(chest);
			plugin.getLogger().info("You receive a chest.");
			return true;
        	
        }
        
        if (command.getName().equalsIgnoreCase("diamond")){
   			Player p = (Player)sender;
   			PlayerInventory inventory = p.getInventory();
   			ItemStack diamond = new ItemStack(264);
   			inventory.addItem(diamond);
   			plugin.getLogger().info("You recieve a block of Diamond.");
   			return true;
           	
           }
        
        return false;
    }
}
