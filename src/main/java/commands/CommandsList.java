package commands;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import commands.list.namecommand;
import commands.list.testcommand;


public class CommandsList extends CommandClientBuilder {


    public CommandClientBuilder commandList() {

        this.addCommand(new testcommand());

        this.addCommand(new namecommand());

        return this;
    }

}