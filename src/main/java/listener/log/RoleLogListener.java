package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.role.RoleCreateEvent;
import net.dv8tion.jda.api.events.role.RoleDeleteEvent;
import net.dv8tion.jda.api.events.role.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 20:58 06.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class RoleLogListener extends ListenerAdapter {

    @Override
    public void onRoleCreate(@Nonnull RoleCreateEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_Create", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onRoleDelete(@Nonnull RoleDeleteEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_Delete", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onRoleUpdateName(@Nonnull RoleUpdateNameEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_UpdateName", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onRoleUpdatePermissions(@Nonnull RoleUpdatePermissionsEvent event) {
        if(check(event.getGuild())) {
            if (!event.getOldPermissions().isEmpty()) {
                event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage("Die Rechte der Rolle: **" + event.getRole().getName() + "** wurden von **" + event.getOldPermissions() + "** auf **" + event.getNewPermissions() + " geändert.").queue();
                System.out.println("Die Rechte der Rolle: " + event.getRole().getName() + " wurden von " + event.getOldPermissions() + " auf " + event.getNewPermissions() + " geändert.");
            } else {
                event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage("Der Rolle: **" + event.getRole().getName() + "** wurden folgende Rechte zugewießen **" + event.getNewPermissions() + "**.").queue();
                System.out.println("Der Rolle: " + event.getRole().getName() + " wurden folgende Rechte zugewießen " + event.getNewPermissions() + ".");
            }
        }
    }

    @Override
    public void onRoleUpdatePosition(@Nonnull RoleUpdatePositionEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_UpdatePosition", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onRoleUpdateMentionable(@Nonnull RoleUpdateMentionableEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_UpdateMention", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    @Override
    public void onRoleUpdateColor(@Nonnull RoleUpdateColorEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Role_UpdateColor", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0).sendMessage(message).queue();
            System.out.println(message);
        }
    }

    private boolean check(Guild guild){
        //Module Check
        if(Main.getMySql().getObject(guild, "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (guild.getTextChannelsByName((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "RoleLog", "ChannelName"), false).get(0) != null) {
                return true;
            }
        }
        return false;
    }

}
