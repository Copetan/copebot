package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Calculator;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class PostfixCommand extends Command {

    public PostfixCommand(){
        this.name = "postfix";
        this.category = CategoriesList.getToolsCategory();
        this.help = "This command gives the postfix version of an equation";
        this.arguments = "<infix equation to be converted>";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event) {
        Calculator calc = new Calculator();
        event.reply(calc.getPostfix(event.getArgs()));
        Logger.logger(event, name);
    }

}
