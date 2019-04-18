package commands.list;

import benjaminkomen.jwiki.core.Wiki;
import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import okhttp3.HttpUrl;

import java.util.ArrayList;

public class WikiCommand extends Command {

    public WikiCommand(){
        this.name = "jokebattles";
        this.category = new Category("Tools");
        this.help = "Use this command to make searched in Joke Battles Wiki!";
        this.arguments = "<query>";
    }

    @Override
    protected void execute(CommandEvent event){

        Wiki wiki = new Wiki("joke-battles.fandom.com");

        if (wiki.exists("Copetan")){
            event.reply("It exists!");
        }
    }

}
