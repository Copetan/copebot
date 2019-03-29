import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import commands.list.testcommand;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import commands.*;

public class main {

    public static void main(String[] args) throws Exception {

        CommandClientBuilder client = new CommandClientBuilder();

        EventWaiter waiter = new EventWaiter();

        client.addCommand( new testcommand() );

        new JDABuilder(AccountType.BOT)
                .setToken("NTUzMjc0Nzc2MTg2MTI2MzU2.D2LtGA.bXsagSg1hzbZqZa8AjGzdhczigQ")
                .setGame(Game.playing("with existence"))
                .addEventListener(waiter)
                .addEventListener(client.build())
                .build();

    }
}
