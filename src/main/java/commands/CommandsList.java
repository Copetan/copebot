package commands;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.list.*;


public class CommandsList extends CommandClientBuilder {

    public CommandClientBuilder commandList(EventWaiter waiter) {

        this.addCommand(new TestCommand());
        this.addCommand(new UsernameCommand());
        this.addCommand(new WikiCommand());
        this.addCommand(new GuildCommand());
        this.addCommand(new ShutdownCommand());
        this.addCommand(new CalcCommand());
        this.addCommand(new PostfixCommand());
        this.addCommand(new HistoryCommand(waiter));
        this.addCommand(new ActivityCommand());
        this.addCommand(new VoiceRecordCommand());
        this.addCommand(new JoinVoiceCommand());
        this.addCommand(new LeaveVoiceCommand());
        this.addCommand(new PlayAudioCommand());
        this.addCommand(new TalkCommand(waiter));

        return this;
    }

}