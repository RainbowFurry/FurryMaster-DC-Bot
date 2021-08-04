package commands.groups.admin;

import commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageHistory;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author DarkSide_Wolf
 * File was created in 23:17 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ChatClear implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        int amount;

        //Get how many Messages need to be cleared
        if (args.length == 0)
            amount = this.getInt("99");
        else
            amount = this.getInt(args[0]);

        if (amount > 0 && amount < 100)
            try {
                event.getMessage().delete().queue();
                MessageHistory history = new MessageHistory(event.getTextChannel());
                List<Message> messages = history.retrievePast(amount + 1).complete();
                event.getTextChannel().deleteMessages(messages).queue();

                final Message message = event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).addField("Title", ":wastebasket: All Messages has been deleted", false).build()).complete();
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        message.delete().queue();
                    }
                }, 3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

    private int getInt(String amount) {
        try {
            return Integer.parseInt(amount);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
