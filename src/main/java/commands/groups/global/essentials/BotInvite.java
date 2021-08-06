package commands.groups.global.essentials;

import builder.CustomEmbedBuilder;
import builder.PrivateMessageBuilder;
import commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 14:35 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class BotInvite implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor(Color.green);
        embedBuilder.setTitle("You want to Invite the Bot to your Server?");
        embedBuilder.setContent("https://discord.com/api/oauth2/authorize?client_id=871409125521772596&permissions=8&scope=bot");

        PrivateMessageBuilder privateMessageBuilder = new PrivateMessageBuilder();
        privateMessageBuilder.sentPrivateMessage(event.getMember(), embedBuilder.build());

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
