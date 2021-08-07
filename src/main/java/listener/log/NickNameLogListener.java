package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.guild.member.update.GuildMemberUpdateNicknameEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 20:57 06.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class NickNameLogListener extends ListenerAdapter {

    @Override
    public void onGuildMemberUpdateNickname(@Nonnull GuildMemberUpdateNicknameEvent event) {

        //Module Check
        if(Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "NickNameLog", "ChannelName"), false).get(0) != null) {
                MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "LogMessageTemplate_NickNameUpdate", "messageContent"));
                String message = messageBuilder.build();
                event.getGuild().getTextChannelsByName("role", false).get(0).sendMessage(message).queue();
                System.out.println(message);
            }
        }

    }

}
