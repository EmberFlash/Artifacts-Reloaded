package artifactsreloaded.main.init;


import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import artifactsreloaded.api.main.util.Logger;


public class ArtifactsConfig {

				public static void init() {
								
								Path configPath = FMLPaths.CONFIGDIR.get();
								Path artifactsPath = Paths.get(configPath.toAbsolutePath().toString(), "artifacts");
								
								try {
												Files.createDirectory(artifactsPath);
								} catch(FileSystemAlreadyExistsException e) {
								
								
								} catch(IOException e) {
												Logger.error("Failed to Create Config Directory");
								}
								
								ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Main.SPEC, "artifacts/main.toml");
				}
				
				
				
				public static class Main {
								
								public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
								public static final ForgeConfigSpec SPEC;
								
								public static final ForgeConfigSpec.ConfigValue<Boolean> ArtifactsDebug;
								
								static {
												
												BUILDER.comment("Main Config for Artifacts Reloaded");
												BUILDER.push("Main");
											ArtifactsDebug =	BUILDER.comment("This is used to Debug the mod" +
												"WARNING: DO NOT TURN ON UNLESS DIRECTED TO BY A MOD DEV!").define("ArtifactsDebug", false);
												BUILDER.pop();
												SPEC = BUILDER.build();
												
								}
				}
				
}


