import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import commands.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class main {

    public static void main(String[] args) throws Exception {

        // Gets
        List<String> stuff = Files.readAllLines(Paths.get("config.txt"));

        String id = stuff.get(0);
        String token = stuff.get(1);
        String prefix = stuff.get(2);

        CommandsList client = new CommandsList();
        EventWaiter waiter = new EventWaiter();

        client.setOwnerId(id);
        client.setGame(Game.playing("with existence"));
        client.setPrefix(prefix);
        client.commandList(waiter);

        new JDABuilder(AccountType.BOT)
                .setToken(token)
                .addEventListener(waiter)
                .addEventListener(client.build())
                .build();

    }
}
