
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thearmorsupdate.init;

import net.thearmorsupdate.block.UraniumOreBlock;
import net.thearmorsupdate.block.UraniumDimensionPortalBlock;
import net.thearmorsupdate.block.RubyOreBlock;
import net.thearmorsupdate.block.RubyDimensionPortalBlock;
import net.thearmorsupdate.ThearmorsupdateMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ThearmorsupdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThearmorsupdateMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> RUBY_DIMENSION_PORTAL = REGISTRY.register("ruby_dimension_portal", () -> new RubyDimensionPortalBlock());
	public static final RegistryObject<Block> URANIUM_DIMENSION_PORTAL = REGISTRY.register("uranium_dimension_portal", () -> new UraniumDimensionPortalBlock());
}
