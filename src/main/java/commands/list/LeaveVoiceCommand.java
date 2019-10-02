package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.CommandLogger;

public class LeaveVoiceCommand extends Command {
	public LeaveVoiceCommand() {
		this.name = "leavevoice";
		this.aliases = new String[]{"leave","disconnect"};
		this.help = "Make me leave the Voice Channel I'm currently connected to";
		this.category = new CategoriesList.Audio();
		this.guildOnly = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		CommandLogger.logger(event,name);

		if (!event.getSelfMember().getVoiceState().inVoiceChannel()) {
			event.reply("I am not in a voice channel!");
		} else {
			event.reply("Disconnecting from voice channel");
			event.getGuild().getAudioManager().closeAudioConnection();
		}
	}
}