package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;

public class SetBannedWordCommand extends Command {

	public SetBannedWordCommand() {
		this.name = "setbannedword";
		this.aliases = new String[]{"setbanned", "sbw"};
		this.category = CategoriesList.getToolsCategory();
		this.guildOnly = true;
		this.ownerCommand = true;
	}

	@Override
	protected void execute(CommandEvent event) {

	}
}
