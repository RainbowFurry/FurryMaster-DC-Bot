package listener.chatreaction.role;

import core.Main;
import manager.Checker;
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

        if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Male", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "Gender_Male", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Female", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "Gender_Female", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Other", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "Gender_Other", "messageContent"));
        }else {
            event.getReaction().removeReaction().queue();
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
