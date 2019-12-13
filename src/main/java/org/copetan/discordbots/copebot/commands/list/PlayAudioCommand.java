package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class PlayAudioCommand extends Command {

	public PlayAudioCommand() {
		this.name = "playaudio";
		this.aliases = new String[]{"play"};
		this.help = "Make me play something in a voice channel!";
		this.category = CategoriesList.getAudioCategory();
		this.arguments = "<link to file/source of audio>";
		this.guildOnly = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		Logger.logger(event,name);

	}
}
