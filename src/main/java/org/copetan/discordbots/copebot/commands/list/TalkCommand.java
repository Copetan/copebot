package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.methodsnstuff.CommandLogger;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class TalkCommand extends Command {

	private final EventWaiter waiter;
	public TalkCommand(EventWaiter waiter) {
		this.waiter = waiter;
		this.name = "talk";
		this.aliases = new String[]{"speak","say"};
		this.help = "Talk to me! [Test command]";
		this.category = new CategoriesList.Test();
	}

	@Override
	protected void execute(CommandEvent event) {
		CommandLogger.logger(event,name);

		event.reply("THis is a test! Post a message!");

		waiter.waitForEvent(MessageReceivedEvent.class,
				e -> (e.getAuthor() == event. getAuthor())
						&& (e.getAuthor() == event.getAuthor())
						&& (e.getAuthor() == event.getAuthor()),
				e -> event.reply("You said: " + e.getMessage().getContentRaw()),
				1, TimeUnit.MINUTES, () -> event.reply("You took too long to respond!"));

	}
}
