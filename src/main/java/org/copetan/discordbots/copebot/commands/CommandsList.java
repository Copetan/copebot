package org.copetan.discordbots.copebot.commands;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import org.copetan.discordbots.copebot.commands.list.*;


public class CommandsList extends CommandClientBuilder {

    public void commandList(EventWaiter waiter) {

        // Test Commands
        this.addCommand(new TestCommand());
        this.addCommand(new TalkCommand(waiter));

        // Miscellaneous Commands
        this.addCommand(new UsernameCommand());
        this.addCommand(new GuildCommand());

        // Tool Commands
        this.addCommand(new WikiCommand());
        this.addCommand(new CalcCommand());
        this.addCommand(new PostfixCommand());
        this.addCommand(new HistoryCommand(waiter));

        // Bot Commands
        this.addCommand(new ShutdownCommand());
        this.addCommand(new ActivityCommand());

        // Audio Commands
        this.addCommand(new VoiceRecordCommand());
        this.addCommand(new JoinVoiceCommand());
        this.addCommand(new LeaveVoiceCommand());
        this.addCommand(new PlayAudioCommand());

    }

}