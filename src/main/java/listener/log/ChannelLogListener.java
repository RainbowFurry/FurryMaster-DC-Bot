package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.events.channel.category.CategoryDeleteEvent;
import net.dv8tion.jda.api.events.channel.category.update.CategoryUpdateNameEvent;
import net.dv8tion.jda.api.events.channel.category.update.CategoryUpdatePermissionsEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.text.update.TextChannelUpdateNameEvent;
import net.dv8tion.jda.api.events.channel.text.update.TextChannelUpdatePermissionsEvent;
import net.dv8tion.jda.api.events.channel.text.update.TextChannelUpdateTopicEvent;
import net.dv8tion.jda.api.events.channel.voice.VoiceChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.voice.VoiceChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.voice.update.VoiceChannelUpdateNameEvent;
import net.dv8tion.jda.api.events.channel.voice.update.VoiceChannelUpdateParentEvent;
import net.dv8tion.jda.api.events.channel.voice.update.VoiceChannelUpdatePermissionsEvent;
import net.dv8tion.jda.api.events.channel.voice.update.VoiceChannelUpdateUserLimitEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceMoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import variables.PlaceHolder;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 01:22 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ChannelLogListener extends ListenerAdapter {

    @Override
    public void onCategoryUpdatePermissions(@Nonnull CategoryUpdatePermissionsEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdatePermission", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelUpdatePermissions(@Nonnull VoiceChannelUpdatePermissionsEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdatePermission", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onTextChannelUpdatePermissions(@Nonnull TextChannelUpdatePermissionsEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdatePermission", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onTextChannelDelete(@Nonnull TextChannelDeleteEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Delete", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onTextChannelUpdateName(@Nonnull TextChannelUpdateNameEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdateName", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onTextChannelUpdateTopic(@Nonnull TextChannelUpdateTopicEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Invite_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onTextChannelCreate(@Nonnull TextChannelCreateEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelDelete(@Nonnull VoiceChannelDeleteEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Delete", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelUpdateName(@Nonnull VoiceChannelUpdateNameEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdateName", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelUpdateUserLimit(@Nonnull VoiceChannelUpdateUserLimitEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Invite_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelUpdateParent(@Nonnull VoiceChannelUpdateParentEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Invite_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onVoiceChannelCreate(@Nonnull VoiceChannelCreateEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage("").queue();
            System.out.println(message);
        }
    }

    @Override
    public void onCategoryDelete(@Nonnull CategoryDeleteEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Delete", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage("").queue();
            System.out.println(message);
        }
    }

    @Override
    public void onCategoryUpdateName(@Nonnull CategoryUpdateNameEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_UpdateName", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage("").queue();
            System.out.println(message);
        }
    }

    @Override
    public void onCategoryCreate(@Nonnull CategoryCreateEvent event) {
        if(check(event.getGuild())){
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Channel_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0).sendMessage("").queue();
            System.out.println(message);
        }
    }
    
    private boolean check(Guild guild){
        //Module Check
        if(Main.getMySql().getObject(guild, "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (guild.getTextChannelsByName((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "ChannelLog", "ChannelName"), false).get(0) != null) {
                return true;
            }
        }
                return false;
    }

}
