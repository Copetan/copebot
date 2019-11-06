package org.copetan.discordbots.copebot.commands;

import com.jagrosh.jdautilities.command.Command;

public class CategoriesList {

	public static class Test extends Command.Category {
		public Test() {
			super("Test");
		}
	}

	public static class Tools extends Command.Category {
		public Tools() {
			super("Tools");
		}
	}

	public static class Audio extends Command.Category {
		public Audio() {
			super("Audio");
		}
	}

	public static class Bot extends Command.Category {
		public Bot() {
			super("Bot");
		}
	}

	public static class Miscellaneous extends Command.Category {
		public Miscellaneous() {
			super("Miscellaneous");
		}
	}

}