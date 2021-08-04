package commands.groups.global;

import builder.CustomEmbedBuilder;
import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 17:43 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Help implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor(Color.green);
        embedBuilder.setTitle("Help");
        embedBuilder.setContent("Du brauchst hilfe?\n\n ...");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
