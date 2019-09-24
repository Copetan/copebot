package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.CommandLogger;

public class ShutdownCommand extends Command {

	public ShutdownCommand() {
		this.name = "shutdown";
		this.help = "This command shuts down the bot. Only the owner of this bot can use this command!";
		this.category = new Category("Owner");
		this.guildOnly = false;
		this.ownerCommand = true;
	}

	@Override
	protected void execute(CommandEvent event) {
		event.reply("The shutdown signal has been sent! Now shutting down...");
		CommandLogger.logger(event,name);
		event.getJDA().shutdown();
	}
}
