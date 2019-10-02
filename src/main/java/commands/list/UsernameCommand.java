package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.CommandLogger;

public class UsernameCommand extends Command {

    public UsernameCommand(){
        this.name = "username";
        this.aliases = new String[]{"name"};
        this.category = new CategoriesList.Miscellaneous();
        this.help = "This command just states your username";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event){
        event.reply("Your username is " + event.getAuthor().getName());
        CommandLogger.logger(event, name);
    }
}
