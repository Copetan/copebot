package org.copetan.discordbots.copebot.events;

import net.dv8tion.jda.api.JDA;
import org.copetan.discordbots.copebot.events.messageevents.BannedWordMessageEvent;

public class EventsList {

	public static void addMessageEvents(JDA jda) {
		jda.addEventListener(
				new BannedWordMessageEvent()
		);
	}

	public static void addGenericEvents(JDA jda) {
		jda.addEventListener();
	}

}
