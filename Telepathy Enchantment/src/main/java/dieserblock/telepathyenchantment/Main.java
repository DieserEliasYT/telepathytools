package dieserblock.telepathyenchantment;

import dieserblock.telepathyenchantment.ItemManager.ItemManagerCommands;
import dieserblock.telepathyenchantment.Utilities.CustomEnchants;
import dieserblock.telepathyenchantment.Utilities.Metrics;
import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this, this);

        getCommand("telepathypickaxe").setExecutor(new ItemManagerCommands());
        getCommand("telepathyaxe").setExecutor(new ItemManagerCommands());
        getCommand("telepathyshovel").setExecutor(new ItemManagerCommands());

        int pluginId = 20372;
        Metrics metrics = new Metrics(this, pluginId);
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));


    }


    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (e.getPlayer().getInventory().getItemInMainHand() == null)
            return;
        if (!e.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
            return;
        if (!e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY))
            return;
        if (e.getPlayer().getGameMode() == GameMode.CREATIVE || e.getPlayer().getGameMode() == GameMode.SPECTATOR)
            return;
        if (e.getPlayer().getInventory().firstEmpty() == -1)
            return;
        if (e.getBlock().getState() instanceof Container)
            return;

        e.setDropItems(false);
        Player p = e.getPlayer();
        Block block = e.getBlock();

        Collection<ItemStack> drops = block.getDrops(p.getInventory().getItemInMainHand());
        if (drops.isEmpty())
            return;
        p.getInventory().addItem(drops.iterator().next());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
