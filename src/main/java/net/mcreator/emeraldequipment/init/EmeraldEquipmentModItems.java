
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.emeraldequipment.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.emeraldequipment.item.EmeraldSwordItem;
import net.mcreator.emeraldequipment.EmeraldEquipmentMod;

public class EmeraldEquipmentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldEquipmentMod.MODID);
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
}
