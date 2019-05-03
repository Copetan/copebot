package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.Calculator;
import methodsnstuff.CommandLogger;

public class PostfixCommand extends Command {

    public PostfixCommand(){
        this.name = "postfix";
        this.category = new Category("Tools");
        this.help = "This command gives the postfix version of an equation";
        this.arguments = "<infix equation to be converted>";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event) {
        Calculator calc = new Calculator();
        event.reply(calc.getPostfix(event.getArgs()));
        CommandLogger.logger(event, name);
    }

}
