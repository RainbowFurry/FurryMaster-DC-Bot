package listener.chatreaction.role;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 23:40 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class StarSign extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        switch (reaction){

            case ":capricorn:":
                addRole(event, "Capricorn");
                break;

            case ":aquarius:":
                addRole(event, "Aquarius");
                break;

            case ":pisces:":
                addRole(event, "Pisces");
                break;

            case ":aries:":
                addRole(event, "Aries");
                break;

            case ":taurus:":
                addRole(event, "Taurus");
                break;

            case ":gemini:":
                addRole(event, "Gemini");
                break;

            case ":cancer:":
                addRole(event, "Cancer");
                break;

            case ":leo:":
                addRole(event, "Leo");
                break;

            case ":virgo:":
                addRole(event, "Virgo");
                break;

            case ":libra:":
                addRole(event, "Libra");
                break;

            case ":scorpio:":
                addRole(event, "Scorpio");
                break;

            case ":sagittarius:":
                addRole(event, "Sagittarius");
                break;

            default:
                event.getReaction().removeReaction().queue();
                break;

        }

    }

    @Override
    public void onMessageReactionRemove(@NotNull MessageReactionRemoveEvent event) {

    }

    private void addRole(MessageReactionAddEvent event, String role){
        if(event.getGuild().getRolesByName(role, false).get(0) != null)
            event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName(role, false).get(0)).queue();
        //else create
    }

}
