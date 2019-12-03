package artifactsreloaded.api.main.regisrty;


import net.minecraft.item.Item;

import net.minecraftforge.registries.ForgeRegistries;

import artifactsreloaded.main.util.ItemGroupAR.*;


public abstract class ItemRegisterer {
				
				public static Item registerItem(Item i, String name) {
								
								i = new Item(new Item.Properties().group(ItemGroupArtifacts.instance));
								i.setRegistryName(name);
								ForgeRegistries.ITEMS.register(i);
								return i;
				}
				
				public static Item registerItemNoGroup(Item i, String name) {
								
								i = new Item(new Item.Properties().group(null));
								i.setRegistryName(name);
								ForgeRegistries.ITEMS.register(i);
								return i;
				}
}
