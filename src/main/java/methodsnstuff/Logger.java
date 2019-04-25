package methodsnstuff;

import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.entities.ChannelType;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Logger {

    public static void logger(CommandEvent event, String name){

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
    }
}
