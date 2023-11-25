package dieserblock.telepathyenchantment.ItemManager;

import dieserblock.telepathyenchantment.Utilities.CustomEnchants;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack TelepathyPickaxe;
    public static ItemStack TelepathyAxe;
    public static ItemStack TelepathyShovel;

    public static void init() {
        createTelepathiePickaxe();
    }

    // Telepathy Pickaxe
    private static void createTelepathiePickaxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cTelepathy - Pickaxe");
        meta.addEnchant(CustomEnchants.TELEPATHY, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add("§7Telepathy I");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TelepathyPickaxe = item;
    }

    // Telepathy Axe
    private static void createTelepathieAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cTelepathy - Axe");
        meta.addEnchant(CustomEnchants.TELEPATHY, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add("§7Telepathy I");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TelepathyAxe = item;
    }

    // Telepathy Shovel
    private static void createTelepathieShovel() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cTelepathy - Shovel");
        meta.addEnchant(CustomEnchants.TELEPATHY, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add("§7Telepathy I");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TelepathyShovel = item;
    }

}
