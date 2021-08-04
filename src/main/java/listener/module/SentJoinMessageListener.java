package listener.module;

import builder.CustomEmbedBuilder;
import core.Main;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 01:32 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class SentJoinMessageListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        if (((String) Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_JoinMessage", "OptionState")).equalsIgnoreCase("true")) {

            String channel = (String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "JoinLog", "ChannelName");
            String image = (String) Main.getMySql().getObject(event.getGuild(), "Language_DE", "messageName", "JoinMessageImage", "messageContent");
            String content = (String) Main.getMySql().getObject(event.getGuild(), "Language_DE", "messageName", "JoinMessageTemplate", "messageContent");
            MessageEmbed message;

            CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
            embedBuilder.setTitle("Welcome");
            embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "JoinMessage", "EmbedColor"));
            embedBuilder.setContent(content);

            //Welcome Thumbnail selection
            if(!image.equals("")){
                if(!image.equals("-")){
                    if(image.equals("User")){
                        embedBuilder.setThumbnail(event.getMember().getUser().getAvatarUrl());
                    }else if(image.equals("Server")){
                        embedBuilder.setThumbnail(event.getGuild().getIconUrl());
                    }else if(image.startsWith("http")){
                        embedBuilder.setThumbnail(image);
                    }
                }
            }

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
