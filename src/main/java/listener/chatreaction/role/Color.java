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
public class Color extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        switch (reaction){

            case ":red_circle:":
                addRole(event, "Red");
                break;

            case ":orange_circle:":
                addRole(event, "Orange");
                break;

            case ":yellow_circle:":
                addRole(event, "Yellow");
                break;

            case ":green_circle:":
                addRole(event, "Green");
                break;

            case ":blue_circle:":
                addRole(event, "Blue");
                break;

            case ":purple_circle:":
                addRole(event, "Purple");
                break;

            case "7":
                addRole(event, "Pink");
                break;

            case "8":
                addRole(event, "Cyan");
                break;

            case ":brown_circle:":
                addRole(event, "Brown");
                break;

                //Type

            case "n":
                addRole(event, "Light");
                break;

            case "m":
                addRole(event, "Dark");
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
