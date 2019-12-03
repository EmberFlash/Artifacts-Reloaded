package archived.artifactsreloaded.common.util.artifact.Factory;

import net.minecraft.item.Item;

import archived.artifactsreloaded.api.main.trap.IBehaviorITrap;
import archived.artifactsreloaded.api.main.trap.ITrapAPI;
import archived.artifactsreloaded.common.block.IBlock.ITrap;


public class FactoryTrapBehaviors implements ITrapAPI {


@Override
public void addArrowTrapBehavior(Item item, IBehaviorITrap behavior) {
	ITrap.dispenseBehaviorRegistry.putObject(item, behavior);
}
}

