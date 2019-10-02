package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.CommandLogger;

public class GuildCommand extends Command {

    public GuildCommand(){
        this.name = "server";
        this.category = new CategoriesList.Miscellaneous();
        this.help = "This Command states the server name (only works in servers)";
        this.guildOnly = true;
    }

    @Override
    protected void execute(CommandEvent event){
        event.reply(event.getGuild().getName());
        CommandLogger.logger(event, name);
    }
}
