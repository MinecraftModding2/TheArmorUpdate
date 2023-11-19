
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thearmorsupdate.init;

import net.thearmorsupdate.item.UraniumItem;
import net.thearmorsupdate.item.UraniumDimensionItem;
import net.thearmorsupdate.item.Uranium1armorItem;
import net.thearmorsupdate.item.RubyItemItem;
import net.thearmorsupdate.item.RubyItem;
import net.thearmorsupdate.item.RubyDimensionItem;
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
	public static final RegistryObject<Item> RUBY_DIMENSION = REGISTRY.register("ruby_dimension", () -> new RubyDimensionItem());
	public static final RegistryObject<Item> URANIUM_DIMENSION = REGISTRY.register("uranium_dimension", () -> new UraniumDimensionItem());
	public static final RegistryObject<Item> URANIUM_1ARMOR_HELMET = REGISTRY.register("uranium_1armor_helmet", () -> new Uranium1armorItem.Helmet());
	public static final RegistryObject<Item> URANIUM_1ARMOR_CHESTPLATE = REGISTRY.register("uranium_1armor_chestplate", () -> new Uranium1armorItem.Chestplate());
	public static final RegistryObject<Item> URANIUM_1ARMOR_LEGGINGS = REGISTRY.register("uranium_1armor_leggings", () -> new Uranium1armorItem.Leggings());
	public static final RegistryObject<Item> URANIUM_1ARMOR_BOOTS = REGISTRY.register("uranium_1armor_boots", () -> new Uranium1armorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
