package archived.artifactsreloaded.api.main.trap;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;

import archived.artifactsreloaded.api.main.trap.internal.ITrapBehaviorProvider;


public interface IBehaviorITrap {

	IBehaviorITrap iTrapBehaviorProvider = new ITrapBehaviorProvider();



	ItemStack dispense(IBlockSource iSource, ItemStack iStack);

}
