
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.thearmorsupdate.init;

import net.thearmorsupdate.ThearmorsupdateMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThearmorsupdateModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThearmorsupdateMod.MODID);
	public static final RegistryObject<CreativeModeTab> ARMOR_UPDATE = REGISTRY.register("armor_update",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.thearmorsupdate.armor_update")).icon(() -> new ItemStack(ThearmorsupdateModItems.NON_OBTAIN_ARMOR_UPD_LOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ThearmorsupdateModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(ThearmorsupdateModItems.RUBY_HELMET.get());
				tabData.accept(ThearmorsupdateModItems.RUBY_CHESTPLATE.get());
				tabData.accept(ThearmorsupdateModItems.RUBY_LEGGINGS.get());
				tabData.accept(ThearmorsupdateModItems.RUBY_BOOTS.get());
				tabData.accept(ThearmorsupdateModItems.RUBY_ITEM.get());
				tabData.accept(ThearmorsupdateModItems.URANIUM.get());
				tabData.accept(ThearmorsupdateModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(ThearmorsupdateModItems.URANIUM_1ARMOR_HELMET.get());
				tabData.accept(ThearmorsupdateModItems.URANIUM_1ARMOR_CHESTPLATE.get());
				tabData.accept(ThearmorsupdateModItems.URANIUM_1ARMOR_LEGGINGS.get());
				tabData.accept(ThearmorsupdateModItems.URANIUM_1ARMOR_BOOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ThearmorsupdateModItems.RUBY_DIMENSION.get());
			tabData.accept(ThearmorsupdateModItems.URANIUM_DIMENSION.get());
		}
	}
}
