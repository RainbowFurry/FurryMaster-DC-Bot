package core;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import utils.STATIC;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author DarkSide_Wolf
 * File was created in 17:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */public class CommandParser {

    public static void sendMessage(MessageReceivedEvent event, Color color, String message){
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setColor(color);
        embedBuilder.setFooter(event.getAuthor().getName() + " " + event.getMember().getRoles().get(0).getName(), event.getAuthor().getAvatarUrl());
        embedBuilder.setDescription(message);
        event.getTextChannel().sendMessage(embedBuilder.build()).queue();
    }

    public CommandContainer parse(String raw, MessageReceivedEvent event) {
        event.getMessage().delete().queue();
        String beheaded = raw.replaceFirst(STATIC.PREFIX, "");
        String[] splitBeheaded = beheaded.split(" ");
        String invoke = splitBeheaded[0];
        ArrayList<String> split = new ArrayList<>(Arrays.asList(splitBeheaded));
        String[] args = new String[split.size() - 1];
        split.subList(1, split.size()).toArray(args);
        return new CommandContainer(raw, beheaded, splitBeheaded, invoke, args, event);
    }


    static class CommandContainer {

        final String raw;
        final String beheaded;
        final String[] splitBeheaded;
        final String invoke;
        final String[] args;
        final MessageReceivedEvent event;

        CommandContainer(String rw, String beheaded, String[] splitBeheaded, String invoke, String[] args, MessageReceivedEvent event) {
            this.raw = rw;
            this.beheaded = beheaded;
            this.splitBeheaded = splitBeheaded;
            this.invoke = invoke;
            this.args = args;
            this.event = event;
        }

    }

}
