
package net.thearmorsupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UraniumItem extends Item {
	public UraniumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
