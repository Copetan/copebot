package commands;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import commands.list.*;



public class CommandsList extends CommandClientBuilder {


    public CommandClientBuilder commandList() {

        this.addCommand(new TestCommand());
        this.addCommand(new NameCommand());
        this.addCommand(new WikiCommand());

        return this;
    }

}