package artifactsreloaded.api.main.regisrty;


import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraftforge.registries.ForgeRegistries;

import artifactsreloaded.main.util.ItemGroupAR.*;


public abstract class BlockRegisterer {
				
				public static Block registerBlock(Block b, String name) {
								
								BlockItem ib = new BlockItem(b, new Item.Properties().group(ItemGroupArtifacts.instance));
								b.setRegistryName(name);
								ib.setRegistryName(name);
								ForgeRegistries.BLOCKS.register(b);
								ForgeRegistries.ITEMS.register(ib);
								return b;
				}
				
				public static Block registerBlockNoGroup(Block b, String name) {
								
								BlockItem ib = new BlockItem(b, new Item.Properties().group(null));
								b.setRegistryName(name);
								ib.setRegistryName(name);
								ForgeRegistries.BLOCKS.register(b);
								ForgeRegistries.ITEMS.register(ib);
								return b;
				}
}
