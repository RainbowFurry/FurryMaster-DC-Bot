package listener.chatreaction.role;

import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 23:56 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class GameCategory extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Action", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action-Adventure", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Action-Adventure", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Adventure", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Adventure", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_RolePlay", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_RolePlay", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Simulation", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Simulation", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Strategy", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Strategy", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Sport", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Sport", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Puzzle", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Puzzle", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Idle", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Idle", "messageContent"));
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
