import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import commands.*;


public class main {

    public static void main(String[] args) throws Exception {

        CommandsList client = new CommandsList();

        EventWaiter waiter = new EventWaiter();

        client.setOwnerId("360613897994108939");

        client.setGame(Game.playing("with existence"));

        client.setPrefix("!!");

        client.commandList();

        new JDABuilder(AccountType.BOT)
                .setToken("NTUzMjc0Nzc2MTg2MTI2MzU2.D2LtGA.bXsagSg1hzbZqZa8AjGzdhczigQ")
                .addEventListener(waiter)
                .addEventListener(client.build())
                .build();

    }
}
