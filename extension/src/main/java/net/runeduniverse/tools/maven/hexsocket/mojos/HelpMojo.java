package net.runeduniverse.tools.maven.hexsocket.mojos;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * help mojo for the hexsocket-maven-extension
 * 
 * @author Pl4yingNight
 * @goal help
 */
public class HelpMojo extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		// TODO Auto-generated method stub
		getLog().info("Help hexsocket toolkit");
	}

}
