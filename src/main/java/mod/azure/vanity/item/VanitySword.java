package mod.azure.vanity.item;

import mod.azure.vanity.VanityMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class VanitySword extends SwordItem {

	public VanitySword(int attackDamageIn, float attackSpeed) {
		super(ItemTier.DIAMOND, attackDamageIn, attackSpeed,
				new Item.Properties().group(VanityMod.VanityItemGroup).maxStackSize(1));
	}
}