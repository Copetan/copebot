package events;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.Invite;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.events.message.*;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.requests.restaction.InviteAction;

public class GeneralEvents extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        boolean hasTalked = false;
        String[] args = event.getMessage().getContentRaw().split(" ");

        System.out.println("There are " + args.length + " words in the message");

        for(int i = 0; i < args.length; i++){

            if(args[i].equalsIgnoreCase("!copebot" ) && !event.getAuthor().isBot() ) {
                if ( args.length > 1 ) {
                    if ( args[i + 1].equalsIgnoreCase("username" ) ) {
                        System.out.println("Asked for username");
                        event.getChannel().sendMessage("Your username is " + event.getAuthor().getName() ).queue();
                        break;
                    }
                    else if ( args[i + 1].equalsIgnoreCase("server") && ChannelType.fromId(event.getChannelType().getId()).isGuild()) {
                        System.out.println("Asked for server name");
                        event.getChannel().sendMessage( "The name of this server is " + event.getGuild().getName() ).queue();
                        break;
                    }
                    else if ( args[i+1].equalsIgnoreCase( "invite" ) ) {
                        System.out.println("Asked for invite link");
                        break;
                    }
                }
                break;
            }
        }
        hasTalked = false;
    }
}