package listener.chatreaction.role;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 00:11 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Gender extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        switch (reaction){

            case ":male_sign:":
                addRole(event, "Male");
                break;

            case ":female_sign:":
                addRole(event, "Female");
                break;

            case "q":
                addRole(event, "Other");
                break;

                //Advanced

            case "w":
                addRole(event, "Genderqueer");
                break;

            case "a":
                addRole(event, "Non Binary");
                break;

            case "s":
                addRole(event, "Transgender");
                break;

            case "d":
                addRole(event, "Intersex");
                break;

            case "x":
                addRole(event, "Genderfluid");
                break;

            case "c":
                addRole(event, "Agender");
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
