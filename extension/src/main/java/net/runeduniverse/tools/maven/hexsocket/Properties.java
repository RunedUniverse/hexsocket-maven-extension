package net.runeduniverse.tools.maven.hexsocket;

import net.runeduniverse.tools.maven.hexsocket.api.MavenProperties;
import net.runeduniverse.tools.maven.hexsocket.api.HexsocketProperties;

public interface Properties extends MavenProperties, HexsocketProperties {
	public static String VAL_PREFIX = "${";
	public static String VAL_POSTFIX = "}";

	public static String PLUGIN_KEY = GROUP_ID + ':' + ARTIFACT_ID;

	public interface PROJECT {
		public interface BUILD extends MavenProperties.PROJECT.BUILD {
		}
	}

	public interface METAINF extends MavenProperties.METAINF {
		public interface MAVEN extends MavenProperties.METAINF.MAVEN {
		}

		public interface PLEXUS extends MavenProperties.METAINF.PLEXUS {
		}

		public interface SISU extends MavenProperties.METAINF.SISU {
		}
	}
}
