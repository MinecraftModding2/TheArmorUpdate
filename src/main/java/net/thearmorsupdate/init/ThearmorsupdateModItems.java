
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thearmorsupdate.init;

import net.thearmorsupdate.item.UraniumItem;
import net.thearmorsupdate.item.UraniumArmorItem;
import net.thearmorsupdate.item.RubyItemItem;
import net.thearmorsupdate.item.RubyItem;
import net.thearmorsupdate.item.NonObtainArmorUPDLogoItem;
import net.thearmorsupdate.ThearmorsupdateMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ThearmorsupdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThearmorsupdateMod.MODID);
	public static final RegistryObject<Item> NON_OBTAIN_ARMOR_UPD_LOGO = REGISTRY.register("non_obtain_armor_upd_logo", () -> new NonObtainArmorUPDLogoItem());
	public static final RegistryObject<Item> RUBY_ORE = block(ThearmorsupdateModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_HELMET = REGISTRY.register("ruby_helmet", () -> new RubyItem.Helmet());
	public static final RegistryObject<Item> RUBY_CHESTPLATE = REGISTRY.register("ruby_chestplate", () -> new RubyItem.Chestplate());
	public static final RegistryObject<Item> RUBY_LEGGINGS = REGISTRY.register("ruby_leggings", () -> new RubyItem.Leggings());
	public static final RegistryObject<Item> RUBY_BOOTS = REGISTRY.register("ruby_boots", () -> new RubyItem.Boots());
	public static final RegistryObject<Item> RUBY_ITEM = REGISTRY.register("ruby_item", () -> new RubyItemItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(ThearmorsupdateModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> URANIUM_ARMOR_HELMET = REGISTRY.register("uranium_armor_helmet", () -> new UraniumArmorItem.Helmet());
	public static final RegistryObject<Item> URANIUM_ARMOR_CHESTPLATE = REGISTRY.register("uranium_armor_chestplate", () -> new UraniumArmorItem.Chestplate());
	public static final RegistryObject<Item> URANIUM_ARMOR_LEGGINGS = REGISTRY.register("uranium_armor_leggings", () -> new UraniumArmorItem.Leggings());
	public static final RegistryObject<Item> URANIUM_ARMOR_BOOTS = REGISTRY.register("uranium_armor_boots", () -> new UraniumArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
