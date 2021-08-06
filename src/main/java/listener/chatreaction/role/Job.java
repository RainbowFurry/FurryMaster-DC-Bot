package listener.chatreaction.role;

import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 14:39 04.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Job extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){

        //check channel
        //check message

        String reaction = event.getReactionEmote().toString();
        reaction = reaction.split("\\(")[1];
        reaction = reaction.replace(")", "");

        if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_IT", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_IT", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Army", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Army", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Medic", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Medic", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Educator", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Educator", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Caregiver", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Caregiver", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Social", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Social", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Banker", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Banker", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Ingenuer", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Ingenuer", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Mechanic", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Mechanic", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Seller", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Seller", "messageContent"));
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
