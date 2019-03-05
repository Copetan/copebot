import events.NewEvents;
import events.PrivateEvents;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.JDA;

public class main {
    private static JDA jda;

    public static void main(String[] args) throws Exception {
        jda = new JDABuilder(AccountType.BOT).setToken("NTUxOTEwOTM3MDc5MTg1NDEy.D136pQ.HDy6sNxM0XVOVbucdDdw2x4pjr4").buildBlocking();
        jda.addEventListener(new NewEvents());
        jda.addEventListener(new PrivateEvents());

    }
}
