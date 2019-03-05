package events;

import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.events.message.priv.*;

public class PrivateEvents extends ListenerAdapter {

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        System.out.println("There are " + args.length + " words in this string");

        for(int i=0; i < args.length; i++){
            if (args[i].equalsIgnoreCase("test")){
                event.getChannel().sendMessage("wow").queue();
            }
        }

    }

}
