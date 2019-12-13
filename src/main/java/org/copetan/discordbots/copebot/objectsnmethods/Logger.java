package org.copetan.discordbots.copebot.objectsnmethods;

import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Logger {

    public static void logger(CommandEvent event, String name) {

        String time = Timestamp.valueOf(LocalDateTime.now()).toString();

        if(event.isFromType(ChannelType.PRIVATE)){
            System.out.println(
                    "["
                            + time
                            + "] "
                            + event.getAuthor().getAsTag()
                            + " ("
                            + event.getAuthor().getId()
                            + ") asked for the \""
                            + name
                            + "\" command in a private channel ("
                            + event.getChannel().getId()
                            + ")"
            );
        }
        else {
            System.out.println(
                    "["
                            + time
                            + "] "
                            + event.getAuthor().getAsTag()
                            + " ("
                            + event.getAuthor().getId()
                            + ") asked for the \""
                            + name
                            + "\" command in "
                            + event.getGuild().getName()
                            + " ("
                            + event.getGuild().getId() + ")"
            );
        }
        try {
            Files.write(Paths.get("file"), name.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logger(Object object) {

        String time = Timestamp.valueOf(LocalDateTime.now()).toString();
        String[] nameRaw = object.getClass().getName().split("\\.");
        String name = nameRaw[nameRaw.length - 1];

        System.out.println(name);
    }
}
