package listener.chatreaction.role;

import core.Main;
import manager.Checker;
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
        
        if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Germany", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Germany", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_America", "Reaction")){
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_America", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_England", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_England", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Franc", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Franc", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Italy", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Italy", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Russia", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Russia", "messageContent"));
        }else if(reaction == Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Swiz", "Reaction")) {
            addRole(event, (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Swiz", "messageContent"));
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
