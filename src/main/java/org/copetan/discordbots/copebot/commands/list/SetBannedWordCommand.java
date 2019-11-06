package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class SetBannedWordCommand extends Command {

	public SetBannedWordCommand() {
		this.name = "setbannedword";
		this.aliases = new String[]{"setbanned", "sbw"};
		this.guildOnly = true;
		this.ownerCommand = true;
	}

	@Override
	protected void execute(CommandEvent event) {

	}
}
