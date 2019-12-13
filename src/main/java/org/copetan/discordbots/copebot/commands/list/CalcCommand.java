package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Calculator;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class CalcCommand extends Command {

    public CalcCommand() {
        this.name = "calculate";
        this.category = CategoriesList.getToolsCategory();
        this.help = "This command is a calculator!";
        this.arguments = "<arguments to be calculated>";
        this.guildOnly = false;

    }

    @Override
    protected void execute(CommandEvent event) {
        Calculator calc = new Calculator();
        event.reply(calc.calculateInfix(event.getArgs()));
        Logger.logger(event, name);
    }
}
