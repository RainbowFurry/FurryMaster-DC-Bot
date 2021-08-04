package needed;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 20:10 25.05.2020
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class VerifyListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){
        if(event.getChannel().getName().equals("regeln") || event.getChannel().getName().equals("rules")) {

            String reaction = event.getReactionEmote().toString();
            reaction = reaction.split("\\(")[1];
            reaction = reaction.replace(")", "");

            if(reaction.equals("714554521866469469")){
                event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Verifiziert", false).get(0)).queue();
            }

            //System.out.println(event.getReaction());
        }
    }

    @Override
    public void onMessageReactionRemove(@NotNull MessageReactionRemoveEvent event){
        if(event.getChannel().getName().equals("regeln") || event.getChannel().getName().equals("rules")) {

            String reaction = event.getReactionEmote().toString();
            reaction = reaction.split("\\(")[1];
            reaction = reaction.replace(")", "");

            if(reaction.equals("714554521866469469")){
                event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Verifiziert", false).get(0)).queue();
            }

            //System.out.println(event.getReaction());
        }
    }

}
