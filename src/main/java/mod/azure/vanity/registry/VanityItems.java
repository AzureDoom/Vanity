package mod.azure.vanity.registry;

import mod.azure.vanity.VanityMod;
import mod.azure.vanity.item.VanitySword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VanityItems {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VanityMod.MODID);

	public static final RegistryObject<Item> ASURAMARU = ITEMS.register("asuramaru", () -> new VanitySword(1, -2.2F));

	public static final RegistryObject<Item> BLACKDIVIDER = ITEMS.register("black_divider",
			() -> new VanitySword(4, -2.8F));

	public static final RegistryObject<Item> DARKSWORD = ITEMS.register("darksword", () -> new VanitySword(4, -2.6F));

	public static final RegistryObject<Item> EXECUTIONER = ITEMS.register("executioner",
			() -> new VanitySword(4, -3.0F));

	public static final RegistryObject<Item> HEAVYHAMMER = ITEMS.register("heavyhammer",
			() -> new VanitySword(7, -3.2F));

	// public static final RegistryObject<Item> NIGHTFALL =
	// ITEMS.register("nightfall", () -> new VanitySword(6, -3.2F));

	public static final RegistryObject<Item> SANGE = ITEMS.register("sange", () -> new VanitySword(2, -2.4F));

	public static final RegistryObject<Item> UCHIGATANA = ITEMS.register("uchigatana", () -> new VanitySword(2, -2.2F));

	public static final RegistryObject<Item> YHORMMACHETE = ITEMS.register("yhormmachete",
			() -> new VanitySword(5, -3.2F));

	public static final RegistryObject<Item> YORU = ITEMS.register("yoru", () -> new VanitySword(3, -2.6F));

}