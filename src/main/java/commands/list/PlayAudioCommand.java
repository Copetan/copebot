package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.CommandLogger;

public class PlayAudioCommand extends Command {

	public PlayAudioCommand() {
		this.name = "playaudio";
		this.aliases = new String[]{"play"};
		this.help = "Make me play something in a voice channel!";
		this.category = new CategoriesList.Audio();
		this.arguments = "<link to file/source of audio>";
		this.guildOnly = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		CommandLogger.logger(event,name);

	}
}
