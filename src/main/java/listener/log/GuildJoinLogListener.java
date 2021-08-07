package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Objects;

/**
 * @author DarkSide_Wolf
 * File was created in 21:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class GuildJoinLogListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        //Module Check
        if (Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "JoinLog", "ChannelName"), false).get(0) != null) {

                MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Join", "messageContent"));
                String message = messageBuilder.build();

                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.green);
                eb.setDescription(message);

                Objects.requireNonNull(event.getGuild().getDefaultChannel()).sendMessage(eb.build()).queue();
            }

        }
    }

}
