package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.methodsnstuff.CommandLogger;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TestCommand extends Command {

    public TestCommand(){
        this.name = "test";
        this.help = "This is a test";
        this.category = new CategoriesList.Test();
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event){
        String time = Timestamp.valueOf(LocalDateTime.now()).toString();

        event.reply("It works!");
        event.reply(time);
        CommandLogger.logger(event, name);
    }


}
