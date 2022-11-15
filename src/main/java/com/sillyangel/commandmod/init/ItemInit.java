package com.sillyangel.commandmod.init;

import com.google.common.base.Supplier;
import com.sillyangel.commandmod.Commandmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Commandmod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(Commandmod.COMMAND_TAB)));

	public static final RegistryObject<Item> LION_TOOL = register("lion scanner ")
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
