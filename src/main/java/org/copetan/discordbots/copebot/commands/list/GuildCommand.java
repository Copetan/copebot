package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class GuildCommand extends Command {

    public GuildCommand(){
        this.name = "server";
        this.category = CategoriesList.getMiscellaneousCategory();
        this.help = "This Command states the server name (only works in servers)";
        this.guildOnly = true;
    }

    @Override
    protected void execute(CommandEvent event){
        event.reply(event.getGuild().getName());
        Logger.logger(event, name);
    }
}
