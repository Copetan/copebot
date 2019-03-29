package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import commands.list.testcommand;

import java.util.LinkedList;


public class CommandsList {

    private final LinkedList<Command> commands = new LinkedList<>();

    public CommandClientBuilder CommandsList() {

        commands.add( testcommand() );

      return this;

    }

}