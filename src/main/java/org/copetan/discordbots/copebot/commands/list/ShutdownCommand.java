package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;
import net.dv8tion.jda.api.JDA;

public class ShutdownCommand extends Command {

	public ShutdownCommand() {
		this.name = "shutdown";
		this.aliases = new String[]{"sd","goaway"};
		this.help = "This command shuts down the bot. Only the owner of this bot can use this command!";
		this.category = CategoriesList.getBotCategory();
		this.guildOnly = false;
		this.ownerCommand = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		event.reply("The shutdown signal has been sent! Now shutting down...");
		Logger.logger(event,name);
		event.getJDA().shutdown();

		// Delays exit until JDA is shut down
		while (!event.getJDA().getStatus().equals(JDA.Status.SHUTDOWN));
		for(int i = 0 ; i<100 ; i++);
		System.exit(0);
	}
}
