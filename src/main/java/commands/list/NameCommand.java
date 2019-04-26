package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.CommandLogger;

public class NameCommand extends Command {

    public NameCommand(){
        this.name = "name";
        this.category = new Category("Miscellaneous");
        this.help = "This command just states your username";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event){
        event.reply("Your username is " + event.getAuthor().getName());
        CommandLogger.logger(event, name);
    }
}
