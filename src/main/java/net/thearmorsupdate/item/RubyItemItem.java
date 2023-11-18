
package net.thearmorsupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubyItemItem extends Item {
	public RubyItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
