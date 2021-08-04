package commands.groups.admin;

import commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import utils.STATIC;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 00:59 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class UserInfo implements Command {

    private String nickname = "";
    private String ranks = "";
    private String time = "";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        //Check if a Target User is selected
        if(event.getMessage().getMentionedUsers().get(0) != null) {

            //Check if NickName exists
            if (event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getNickname() != null) {
                nickname = event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getNickname();
            } else {
                nickname = " - ";
            }

            //Get all Roles from User
            StringBuilder ranks = new StringBuilder();
            for (int i = 0; i < event.getMessage().getMentionedMembers().get(0).getRoles().size(); i++)
                ranks.append(event.getMessage().getMentionedMembers().get(0).getRoles().get(i).getName()).append("\n");

            //Show right Time and Date Format
            time = event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getTimeJoined().toString();
            time = time.substring(0, time.indexOf('.'));
            time = time.replace("T", " ");

            //Create output Embet to display all Information about the selected User
            EmbedBuilder eb = new EmbedBuilder();
            eb.setThumbnail(event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getUser().getAvatarUrl());
            eb.setColor(Color.green);
            eb.setFooter(event.getAuthor().getName() + " " + event.getMember().getRoles().get(0).getName(), event.getAuthor().getAvatarUrl());
            eb.setDescription(

                    STATIC.TITLE + "\n" +

                            "Name:\n" + event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getUser().getName() + "\n\n"

                            + "Nick Name:\n" +
                            nickname + "\n\n"

                            + "Status:\n" +
                            event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getOnlineStatus() + "\n\n"

                            + "Joined at:\n" +
                            time + "\n\n"

                            + "Ranks:\n" +
                            ranks.toString() + "\n"

                            + "---------------------------\n\n"

                            + "Level:\n"

                            + "Likes:\n"

                            + "Warns:\n"

            );
            event.getTextChannel().sendMessage(eb.build()).queue();

        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
