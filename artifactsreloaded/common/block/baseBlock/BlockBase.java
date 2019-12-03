package archived.artifactsreloaded.common.block.baseBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

import archived.artifactsreloaded.common.DragonArtifacts;


public class BlockBase extends Block {

    public static final CreativeTabs tab = DragonArtifacts.ArtifactBlocksTab;
    protected String name;

public BlockBase(Material material, String name, float hardness) {
          super(material);
          this.name = name;
          setUnlocalizedName(name);
          setRegistryName(name);
          setCreativeTab(tab);
          setHardness(hardness);


    }


public void registerItemModel(Item itemBlock) {
    	     DragonArtifacts.proxy.registerItemRenderer(itemBlock, 0, name);
				}

				public BlockBase setCreativeTab() {
    	super.setCreativeTab(tab);
    	return this;
				}
				public Item createItemBlock(){

	return new ItemBlock(this).setRegistryName(getRegistryName());

				}

}


