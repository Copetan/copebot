package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class TestCommand extends Command {

    public TestCommand(){

        this.name = "test";
        this.help = "This is a test";
        this.category = new Category("Test");
        this.arguments = "wowowowo";
        this.guildOnly = false;

    }

    @Override
    protected void execute(CommandEvent event){

        event.reply("It works!");

    }


}
