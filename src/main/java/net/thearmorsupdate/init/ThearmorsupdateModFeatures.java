
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thearmorsupdate.init;

import net.thearmorsupdate.world.features.ores.UraniumOreFeature;
import net.thearmorsupdate.world.features.ores.RubyOreFeature;
import net.thearmorsupdate.ThearmorsupdateMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ThearmorsupdateModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ThearmorsupdateMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::new);
}
