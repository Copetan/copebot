import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import commands.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class main {

    public static void main(String[] args) throws Exception {

        // Gets information from the config file, see config.txt.example for more details
        List<String> config = Files.readAllLines(Paths.get("config.txt"));

        String id = config.get(0);
        String token = config.get(1);
        String prefix = config.get(2);
        String activity=config.get(3);

        CommandsList client = new CommandsList();
        EventWaiter waiter = new EventWaiter();

        client.setOwnerId(id);
        client.setActivity(Activity.playing(activity));
        client.setPrefix(prefix);

        // TODO: Figure this out, idr what it was for
        client.commandList(waiter);

        new JDABuilder(AccountType.BOT)
                .setToken(token)
                .addEventListeners(waiter)
                .addEventListeners(client.build())
                .build();
    }
}
