package org.copetan.discordbots.copebot.events.messageevents;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BannedWordMessageEvent extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		Message message = event.getMessage();
		if (message.getContentRaw().equalsIgnoreCase("hello")) {
			if (!message.getAuthor().equals(event.getJDA().getSelfUser())) {
				event.getChannel().sendMessage("hello").queue();
			}
		}
	}
}
