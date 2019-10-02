package commands.list;

import benjaminkomen.jwiki.core.Wiki;
import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import commands.CategoriesList;
import methodsnstuff.JsonReader;
import org.json.JSONObject;

public class WikiCommand extends Command {

    public WikiCommand(){
        this.name = "jokebattles";
        this.help = "Use this command to make searched in Joke Battles Wiki!";
        this.category = new CategoriesList.Tools();
        this.arguments = "<query>";
    }

    @Override
    protected void execute(CommandEvent event){

        Wiki wiki = new Wiki("joke-battles.fandom.com");


    }

}
