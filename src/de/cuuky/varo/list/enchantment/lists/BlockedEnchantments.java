package de.cuuky.varo.list.enchantment.lists;

import org.bukkit.enchantments.Enchantment;

import de.cuuky.varo.list.enchantment.EnchantmentList;

public class BlockedEnchantments extends EnchantmentList {

	@SuppressWarnings("deprecation")
	public BlockedEnchantments() {
		super("BlockedEnchantments");
	}
	
	@Override
	public void loadDefaultValues() {
		this.enchantments.add(Enchantment.DAMAGE_ARTHROPODS.getName() + ":1");
	}

	@SuppressWarnings("deprecation")
	public boolean isBlocked(Enchantment ench, int amplifier) {
		if (enchantments.contains(ench.getName() + ":" + amplifier))
			return true;

		return false;
	}
}