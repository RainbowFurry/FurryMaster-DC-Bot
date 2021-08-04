package listener.chatreaction.role;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 23:42 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Age extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        switch (reaction){

            case ":baby_tone3:":
                addRole(event, "13-15");
                break;

            case ":adult_tone3:":
                addRole(event, "16-17");
                break;

            case ":older_adult_tone3:":
                addRole(event, "18+");
                break;

            default:
                event.getReaction().removeReaction().queue();
                break;
/*
            case "4":
                addRole(event, "18-25");
                break;

            case "5":
                addRole(event, "25-45");
                break;

            case ":older_adult_tone3:":
                addRole(event, "Older");
                break;
*/
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
