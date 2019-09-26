package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.CommandLogger;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.VoiceChannel;

public class VoiceRecordCommand extends Command {

	public VoiceRecordCommand() {
		this.name = "voicerecord";
		this.aliases = new String[]{"vr"};
		this.help = "This command can be used to record audio from a voice channel";
		this.category = new Category("Admin");
		this.userPermissions = new Permission[]{Permission.VOICE_MUTE_OTHERS,
				Permission.VOICE_MOVE_OTHERS,
				Permission.VOICE_DEAF_OTHERS};
		this.guildOnly = true;
	}

	@Override
	protected void execute(CommandEvent event){
		CommandLogger.logger(event,name);

		// TODO: add methods and stuff to start recording audio from the channel and saving it to an mp3
		if (!event.getGuild().getAudioManager().isConnected()){
			event.reply("I am not in a voice channel!");
			return;
		}
		// event.getGuild().g
	}
}
