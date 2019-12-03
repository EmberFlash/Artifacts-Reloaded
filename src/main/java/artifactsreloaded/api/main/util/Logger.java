package artifactsreloaded.api.main.util;


import artifactsreloaded.api.ArtifactsReloadedAPI;
import artifactsreloaded.main.init.ArtifactsConfig.Main;

import org.apache.logging.log4j.Level;


@UtilityClass
public final class Logger {
				private static final org.apache.logging.log4j.Logger LOGGER;
				
				static {
								LOGGER = org.apache.logging.log4j.LogManager.getLogger(ArtifactsReloadedAPI.Artifact_ID.toUpperCase());
				}
				
				private Logger() {
				
				}
				
				public static void thelianDebug(String format, Object... data) {
								
								if(Main.ArtifactsDebug.get()) {
												
												LOGGER.log(Level.DEBUG, format, data);
								}
				}
				
				public static void debug(String format, Object... data) {
								
								LOGGER.log(Level.DEBUG, format, data);
				}
				
				public static void trace(String format, Object... data) {
								
								LOGGER.log(Level.TRACE, format, data);
				}
				
				public static void info(String format, Object... data) {
								
								LOGGER.log(Level.INFO, format, data);
				}
				
				public static void warn(String format, Object... data) {
								
								LOGGER.log(Level.WARN, format, data);
				}
				
				public static void error(String format, Object... data) {
								
								LOGGER.log(Level.ERROR, format, data);
				}
				
				public static void fatal(String format, Object... data) {
								
								LOGGER.log(Level.FATAL, format, data);
				}
}
