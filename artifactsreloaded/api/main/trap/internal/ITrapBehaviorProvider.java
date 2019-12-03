package archived.artifactsreloaded.api.main.trap.internal;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;

import archived.artifactsreloaded.api.main.trap.IBehaviorITrap;


public final class ITrapBehaviorProvider implements IBehaviorITrap {

	public ItemStack dispense(IBlockSource iSource, ItemStack iStack) {

		return iStack;
	}

}
