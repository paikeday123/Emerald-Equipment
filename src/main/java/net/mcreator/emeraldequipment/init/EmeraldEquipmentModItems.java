
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.emeraldequipment.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.emeraldequipment.item.EmeraldSwordItem;
import net.mcreator.emeraldequipment.item.EmeraldShovelItem;
import net.mcreator.emeraldequipment.item.EmeraldPickaxeItem;
import net.mcreator.emeraldequipment.item.EmeraldHoeItem;
import net.mcreator.emeraldequipment.item.EmeraldAxeItem;
import net.mcreator.emeraldequipment.item.EmeraldArmorItem;
import net.mcreator.emeraldequipment.EmeraldEquipmentMod;

public class EmeraldEquipmentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldEquipmentMod.MODID);
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new EmeraldPickaxeItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> EMERALD_AXE = REGISTRY.register("emerald_axe", () -> new EmeraldAxeItem());
	public static final RegistryObject<Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new EmeraldShovelItem());
	public static final RegistryObject<Item> EMERALD_HOE = REGISTRY.register("emerald_hoe", () -> new EmeraldHoeItem());
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", () -> new EmeraldArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", () -> new EmeraldArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", () -> new EmeraldArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", () -> new EmeraldArmorItem.Boots());
}
