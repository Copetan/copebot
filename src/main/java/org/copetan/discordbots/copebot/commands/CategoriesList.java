package org.copetan.discordbots.copebot.commands;

import com.jagrosh.jdautilities.command.Command.Category;

public class CategoriesList {

	private static final Category testCategory          = new Category("Test");
	private static final Category toolsCategory         = new Category("Tools");
	private static final Category audioCategory         = new Category("Audio");
	private static final Category botCategory           = new Category("Bot");
	private static final Category miscellaneousCategory = new Category("Miscellaneous");

	public static Category getTestCategory() {
		return testCategory;
	}

	public static Category getToolsCategory() {
		return toolsCategory;
	}

	public static Category getAudioCategory() {
		return audioCategory;
	}

	public static Category getBotCategory() {
		return botCategory;
	}

	public static Category getMiscellaneousCategory() {
		return miscellaneousCategory;
	}
}