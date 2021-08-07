package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.guild.invite.GuildInviteCreateEvent;
import net.dv8tion.jda.api.events.guild.invite.GuildInviteDeleteEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 20:56 06.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class InviteLogListener extends ListenerAdapter {

    @Override
    public void onGuildInviteCreate(@Nonnull GuildInviteCreateEvent event) {
        if(check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Invite_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "InviteLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onGuildInviteDelete(@Nonnull GuildInviteDeleteEvent event) {
        if(check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Invite_Delete", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "InviteLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    private boolean check(Guild guild) {
        //Module Check
        if (Main.getMySql().getObject(guild, "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (guild.getTextChannelsByName((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "InviteLog", "ChannelName"), false).get(0) != null) {
                return true;
            }
        }
        return false;
    }

}
