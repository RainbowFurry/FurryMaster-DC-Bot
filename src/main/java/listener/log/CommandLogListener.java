package listener.log;

import builder.MessageBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author DarkSide_Wolf
 * File was created in 15:03 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CommandLogListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        //Module Check
        if(Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_Log", "OptionState").equals("true")) {
            //Channel Check
            if (event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "CommandLog", "ChannelName"), false).get(0) != null) {

                String prefix = (String) Main.getMySql().getObject(event.getGuild(), "ServerInfo", "infoID", "CommandPrefix", "infoContent");

                if (event.getMessage().getContentRaw().startsWith(prefix)) {
                    MessageBuilder messageBuilder = new MessageBuilder((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "CommandLog", "ChannelName"));

                    String message = messageBuilder.build();
                    event.getGuild().getTextChannelsByName((String) Main.getMySql().getObject(event.getGuild(), "Channels", "ChannelID", "CommandLog", "ChannelName"), false).get(0).sendMessage(message).queue();
                    System.out.println(message);

                }

            }
        }

    }

}
