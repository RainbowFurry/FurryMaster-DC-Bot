package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.PrivateChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 21:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class GuildLeaveLogListener extends ListenerAdapter {

    @Override
    public void onGuildMemberLeave(GuildMemberLeaveEvent event) {

        //Module Check
        if (Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "LeaveLog", "ChannelName"), false).get(0) != null) {

                MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_Leave", "messageContent"));
                String message = messageBuilder.build();

                EmbedBuilder eb1 = new EmbedBuilder();
                eb1.setColor(Color.green);
                eb1.setDescription(message);

                PrivateChannel pc = event.getMember().getUser().openPrivateChannel().complete();
                pc.sendMessage(eb1.build()
                ).queue();

            }

        }
    }

}
