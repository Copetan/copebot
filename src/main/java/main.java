import events.GeneralEvents;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.JDA;

public class main {
    private static JDA jda;

    public static void main(String[] args) throws Exception {
        jda = new JDABuilder(AccountType.BOT).setToken("NTUzMjc0Nzc2MTg2MTI2MzU2.D2LtGA.bXsagSg1hzbZqZa8AjGzdhczigQ").buildBlocking();
        jda.addEventListener(new GeneralEvents());

    }
}
