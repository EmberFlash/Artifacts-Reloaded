package artifactsreloaded.main.util;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import artifactsreloaded.api.main.item.ARItems;


public class ItemGroupAR extends ItemGroup {
				
				private ItemGroupAR(int index, String label) {
								super(index, label);
				}
				
				@Override
				public ItemStack createIcon() {
								return new ItemStack(ARItems.logo);
								
				}
				
				public static class ItemGroupArtifacts {
								public static final ItemGroupAR instance = new ItemGroupAR(ItemGroup.GROUPS.length, "Artifacts");
				}
}
