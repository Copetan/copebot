package org.copetan.discordbots.copebot.events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class TestMessageEvent extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		Logger.logger(this);
		Message message = event.getMessage();
		if (message.getContentRaw().equalsIgnoreCase("test")) {
			event.getChannel().sendMessage("test!").queue();
		}
	}
}
