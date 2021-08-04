package listener.chatreaction.role;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 23:32 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Country extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message
//event.getChannel().getHistory().getMessageById(event.getMessageId()).getContentRaw()

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        switch (reaction){

            case ":flag_us:":
                addRole(event, "");
                break;

            case ":flag_de:":
                addRole(event, "");
                break;

            case ":flag_gb:":
                addRole(event, "");
                break;

            case ":flag_fr:":
                addRole(event, "");
                break;

            case ":flag_it:":
                addRole(event, "");
                break;

            case ":flag_ea:":
                addRole(event, "");
                break;

            case ":flag_rs:":
                addRole(event, "");
                break;

            case ":flag_ch:":
                addRole(event, "");
                break;

            default:
                event.getReaction().removeReaction().queue();
                break;

            //...

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
