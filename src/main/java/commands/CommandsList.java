package commands;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.examples.command.ShutdownCommand;
import commands.list.*;



public class CommandsList extends CommandClientBuilder {


    public CommandClientBuilder commandList() {

        this.addCommand(new TestCommand());
        this.addCommand(new NameCommand());
        this.addCommand(new WikiCommand());
        this.addCommand(new GuildCommand());
        this.addCommand(new ShutdownCommand());
        this.addCommand(new CalcCommand());
        this.addCommand(new PostfixCommand());


        return this;
    }

}