package listener.module;

import builder.CustomEmbedBuilder;
import core.Main;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 01:32 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class SentLeaveMessageListener extends ListenerAdapter {

    @Override
    public void onGuildMemberLeave(GuildMemberLeaveEvent event){

        if (((String) Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_LeaveMessage", "OptionState")).equalsIgnoreCase("true")) {

            String channel = (String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "LeaveLog", "ChannelName");
            String content = (String) Main.getMySql().getObject(event.getGuild(), "Language_DE", "messageName", "LeaveMessageTemplate", "messageContent");
            MessageEmbed message;

            CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
            embedBuilder.setTitle("Leave");
            embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "LeaveMessage", "EmbedColor"));
            embedBuilder.setContent(content);
            message = embedBuilder.build();

            //Channel
            if(event.getGuild().getTextChannelsByName(channel, false).get(0) != null){
                event.getGuild().getTextChannelsByName(channel, false).get(0).sendMessage(message).queue();
            }else{
                if(event.getGuild().getDefaultChannel() != null)
                    event.getGuild().getDefaultChannel().sendMessage(message).queue();
            }

            //Private
            //if pm
            //if content != null
            //sent message

        }

    }

}
