package commands.groups.global.essentials;

import builder.CustomEmbedBuilder;
import builder.PrivateMessageBuilder;
import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 00:08 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class BotCreator implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor(Color.MAGENTA);
        embedBuilder.setAuthor("DarkSide_Wolf");
        embedBuilder.setTitle("Bot Creator Profile");
        //embedBuilder.setThumbnail(event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getUser().getAvatarUrl());
        embedBuilder.setContent("**Profile Info**\n" +
                "\n" +
                "**Name:** Jason Hoffmann\n" +
                "**NickName:** DarkSide_Wolf\n" +
                "**Age:** 22 (20.09.1998)\n" +
                "**Gender:** Male\n" +
                "**Sex:** Gay\n" +
                "\n" +
                "-------------------------------------\n" +
                "\n" +
                "**Discord Servers**\n" +
                "\n" +
                "Server 1\n" +
                "Server2\n" +
                "\n" +
                "------------------------------------\n" +
                "\n" +
                "**Websites**\n" +
                "\n" +
                "ZeroWorks\n" +
                "JasonJT\n" +
                "\n" +
                "------------------------------------\n" +
                "\n" +
                "**Socials**\n" +
                "\n" +
                "Discord" +
                "Steam" +
                "YT" +
                "etc.");

        PrivateMessageBuilder privateMessageBuilder = new PrivateMessageBuilder();
        privateMessageBuilder.sentPrivateEmbedMessage(event.getMember(), embedBuilder.build());
        //event.getTextChannel().sendMessage(embedBuilder.build()).queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
