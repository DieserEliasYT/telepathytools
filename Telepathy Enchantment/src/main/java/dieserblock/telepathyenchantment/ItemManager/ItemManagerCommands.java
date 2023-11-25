package dieserblock.telepathyenchantment.ItemManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ItemManagerCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("telepathy.give")) {
                if (command.getName().equalsIgnoreCase("telepathypickaxe")) {
                    p.getInventory().addItem(ItemManager.TelepathyPickaxe);
                }
                if (command.getName().equalsIgnoreCase("telepathyaxe")) {
                    p.getInventory().addItem(ItemManager.TelepathyAxe);
                }
                if (command.getName().equalsIgnoreCase("telepathyshovel")) {
                    p.getInventory().addItem(ItemManager.TelepathyShovel);
                }
            } else {
                p.sendMessage("§cYou are not allowed to do that!");
            }
            return true;
        } else {
            sender.sendMessage("§cThis command cant be ran from console!");
            return true;
        }
    }
}
