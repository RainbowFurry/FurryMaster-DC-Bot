package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.guild.GuildMessageDeleteEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 14:07 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class MessageLogListener extends ListenerAdapter {

    @Override
    public void onGuildMessageUpdate(@Nonnull GuildMessageUpdateEvent event) {

        //event.getMessage().getTimeEdited()

        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Message_Update", "messageContent"));
            String message = messageBuilder.build();
            event.getGuild().getTextChannelsByName("role", false).get(0).sendMessage(" Der Benutzer **" + event.getMember().getEffectiveName() + "** hat im Channel **" + event.getChannel().getName() + "** die Nachricht\n" +
                    "**Von**\n" +
                    "" +
                    "**Auf**\n" +
                    event.getMessage().getContentRaw() + "\n" +
                    "geändert.").queue();
        }

    }

    @Override
    public void onGuildMessageDelete(@Nonnull GuildMessageDeleteEvent event) {
        if (check(event.getGuild())) {
            MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Message_Delete", "messageContent"));
            String message = messageBuilder.build();
            //event.getGuild().getTextChannelsByName("role", false).get(0).sendMessage("Der Benutzer **" + event.getMember().getEffectiveName() + "** hat im Channel **" + event.getChannel().getName() + "** die Nachricht **MESSAGE** gelöscht.").queue();
        }
    }

    private boolean check(Guild guild) {
        //Module Check
        if (Main.getMySql().getObject(guild, "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (guild.getTextChannelsByName((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "MessageLog", "ChannelName"), false).get(0) != null) {
                return true;
            }
        }
        return false;
    }

}
