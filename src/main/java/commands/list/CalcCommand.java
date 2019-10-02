package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.Calculator;
import methodsnstuff.CommandLogger;

public class CalcCommand extends Command {

    public CalcCommand() {
        this.name = "calculate";
        this.category = new CategoriesList.Tools();
        this.help = "This command is a calculator!";
        this.arguments = "<arguments to be calculated>";
        this.guildOnly = false;

    }

    @Override
    protected void execute(CommandEvent event) {
        Calculator calc = new Calculator();
        event.reply(calc.calculateInfix(event.getArgs()));
        CommandLogger.logger(event, name);
    }
}
