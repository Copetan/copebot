package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.methodsnstuff.CommandLogger;
import net.dv8tion.jda.api.entities.Message;

import java.util.List;

public class HistoryCommand extends Command {

    private EventWaiter waiter;
    public HistoryCommand(EventWaiter waiter){
        this.name = "gethist";
        this.category = new CategoriesList.Tools();
        this.help = "Gets the message history of the channel this command is executed in and exports it to a text file (Can only be executed by owner)";
        this.ownerCommand = true;
        this.guildOnly = false;
        this.waiter = waiter;
    }

    @Override
    protected void execute(CommandEvent event){

        List<Message> wow = event.getChannel().getHistory().getRetrievedHistory();
        int ha = wow.size();
        System.out.println(ha);
        CommandLogger.logger(event,name);

    }
}
