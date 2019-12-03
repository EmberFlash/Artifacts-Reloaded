package artifactsreloaded;


import net.minecraftforge.fml.common.Mod;

import artifactsreloaded.main.init.ModInit;
import static artifactsreloaded.api.ArtifactsReloadedAPI.Artifact_ID;


@Mod(value = Artifact_ID)
public final class artifactsreloaded {

public static artifactsreloaded instance;
				
				public artifactsreloaded() {
								instance = this;
								
								ModInit.init();
				}
				

}
