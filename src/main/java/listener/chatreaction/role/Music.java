package listener.chatreaction.role;

import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 23:47 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Music extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Country", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Country", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Electronic", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Electronic", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Funk", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Funk", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_HipHop", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_HipHop", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Jazz", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Jazz", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Pop", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Pop", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Punk", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Punk", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Rock", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Rock", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Reggae", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Reggae", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Metal", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Metal", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Tradition", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Tradition", "messageContent"));
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
