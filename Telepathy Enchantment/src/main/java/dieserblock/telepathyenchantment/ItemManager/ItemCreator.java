package dieserblock.telepathyenchantment.ItemManager;

import com.google.common.collect.Lists;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class ItemCreator {
    public static ItemStack createItemWithLore(String name, int id, int subid, int anzahl, String lore) {
        ItemStack item = new ItemStack(Material.getMaterial(String.valueOf(id)), anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        List<String> loreL = Lists.newArrayList();
        loreL.add("");
        loreL.add(lore.replaceAll("&", "§"));
        loreL.add("");
        im.setLore(loreL);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createItem(Material m, int anzahl, int subid, String name) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createItemWithLore(Material m, int anzahl, int subid, String name, ArrayList<String> lore) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        im.setLore(lore);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createItemWithLore(Material m, int anzahl, int subid, String name, String lore) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        ArrayList<String> l = new ArrayList<>();
        l.add(lore);
        im.setLore(l);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createItemWithLore2(Material m, int anzahl, int subid, String name, String lore, String lore2) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        ArrayList<String> l = new ArrayList<>();
        l.add(lore);
        l.add(lore2);
        im.setLore(l);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createLeatherArmor(Material m, int anzahl, int subid, String name, Color color) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        LeatherArmorMeta lm = (LeatherArmorMeta) item.getItemMeta();
        lm.setColor(color);
        lm.setDisplayName(name);
        item.setItemMeta(lm);
        return item;
    }

    public static ItemStack createLeatherArmorWithLore(Material m, int anzahl, int subid, String name, Color color, String lore) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        LeatherArmorMeta lm = (LeatherArmorMeta) item.getItemMeta();
        ArrayList<String> l = new ArrayList<>();
        l.add(lore);
        lm.setLore(l);
        lm.setColor(color);
        lm.setDisplayName(name);
        item.setItemMeta(lm);
        return item;
    }

    public static ItemStack createLeatherArmorWithLore(Material m, int anzahl, int subid, String name, Color color, ArrayList<String> lore) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        LeatherArmorMeta lm = (LeatherArmorMeta) item.getItemMeta();
        lm.setLore(lore);
        lm.setColor(color);
        lm.setDisplayName(name);
        item.setItemMeta(lm);
        return item;
    }

    public static ItemStack createItemWithEnchantment(Material m, int anzahl, int subid, String name, Enchantment e, int level) {
        ItemStack item = new ItemStack(m, anzahl, (byte)subid);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        im.addEnchant(e, level, true);
        item.setItemMeta(im);
        return item;
    }

    public static ItemStack createPotion(int anzahl, int subid, String name, PotionType type, int level, boolean splash, boolean longer) {
        ItemStack item = new ItemStack(Material.POTION, anzahl, (byte)subid);
        Potion p = new Potion(type, level);
        p.setSplash(splash);
        p.setHasExtendedDuration(longer);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        item.setItemMeta(im);
        p.apply(item);
        return item;
    }

    public static ItemStack createSkullItem(String Owner, String DisplayName) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1 , (short)3);
        SkullMeta nm1 = (SkullMeta)head.getItemMeta();
        nm1.setOwner(Owner);
        nm1.setDisplayName(DisplayName);
        head.setItemMeta(nm1);
        return head;
    }

    public static ItemStack createSkullWithLore(String Owner, String DisplayName, String lore) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1 , (short)3);
        SkullMeta nm1 = (SkullMeta)head.getItemMeta();
        nm1.setOwner(Owner);
        nm1.setDisplayName(DisplayName);
        ArrayList<String> l = new ArrayList<>();
        l.add(lore);
        nm1.setLore(l);
        head.setItemMeta(nm1);
        return head;
    }

    public static ItemStack createSkullWithLore(String Owner, String DisplayName, ArrayList<String> lore) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1 , (short)3);
        SkullMeta nm1 = (SkullMeta)head.getItemMeta();
        nm1.setOwner(Owner);
        nm1.setDisplayName(DisplayName);
        nm1.setLore(lore);
        head.setItemMeta(nm1);
        return head;
    }
}