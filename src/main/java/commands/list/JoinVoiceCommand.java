package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.CommandLogger;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.exceptions.InsufficientPermissionException;

public class JoinVoiceCommand extends Command {

	public JoinVoiceCommand() {
		this.name = "joinvoice";
		this.aliases = new String[]{"join","connect","voice"};
		this.help = "Make me join a voice channel you are already in, or if you're an admin, a channel with the provided Channel ID";
		this.arguments = "[Optional: channel id]";
		this.guildOnly = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		CommandLogger.logger(event,name);

		String test = event.getArgs();
		if (!event.getSelfMember().hasPermission(Permission.VOICE_CONNECT)) {
			event.reply("I don't have Voice Connect Permissions!");
			return;
		}

		if (test.isEmpty() && !event.getMember().getVoiceState().inVoiceChannel()) {
			if (event.getMember().hasPermission(Permission.ADMINISTRATOR)) {
				event.reply("You did not provide a channel ID, nor are you in a voice channel. Please provide an ID or join a voice channel and try again");
			} else {
				event.reply("You are not in a voice channel! Please join the voice channel you want to invite me to!");
			}
		} else if (event.getMember().getVoiceState().inVoiceChannel()) {
			VoiceChannel channel = event.getMember().getVoiceState().getChannel();
			event.reply("Joining voice channel " + channel.toString());
			event.getGuild().getAudioManager().openAudioConnection(channel);
		} else if (event.getMember().hasPermission(Permission.ADMINISTRATOR)) {
			try {
				VoiceChannel channel = event.getGuild().getVoiceChannelById(test.trim());
				event.reply("Joining voice channel " + channel.toString());
				event.getGuild().getAudioManager().openAudioConnection(channel);
			} catch (IllegalArgumentException e) {
				event.reply("Invalid channel ID!");
			} catch (InsufficientPermissionException e) {
				event.reply("I don't have permission to join this channel!");
			} catch (Exception e) {
				event.reply("Something went wrong!");
			}
		} else {
			event.reply("You have to be an admin to invite me to a voice channel by id!");
		}
	}
}
