package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class namecommand extends Command {

    public namecommand(){
        this.name = "name";
        this.category = new Category("Miscellaneous");
        this.help = "This command just states your username";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event){
        event.reply("Your username is " + event.getAuthor().getName());
    }
}
