package commands.groups.admin;

import commands.Command;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

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
            Member member = event.getMessage().getMentionedMembers().get(0);
            String message = (String) Main.getMySql().getObject(event.getGuild(), Checker.checkServerLanguage(event.getGuild()), "messageName", "UserInfoMessageTemplate", "messageContent");
           String nickName = "";
            if(member.getNickname() == null)
                nickName = "-";
            else
                nickName = member.getNickname();

            message = message.replace("{userName}", member.getEffectiveName())
                    .replace("{nickName}", nickName)
                    .replace("{status}", member.getOnlineStatus().toString())
                    .replace("{joindAt}", member.getTimeJoined().toString())
                    .replace("{roles}", member.getRoles().toString())
                    .replace("{likes}", "")
                    .replace("{warns}","")
                    .replace("{level}", "");

            EmbedBuilder eb = new EmbedBuilder();
            eb.setThumbnail(event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getUser().getAvatarUrl());
            eb.setColor(Color.green);
            eb.setFooter(event.getAuthor().getName() + " " + event.getMember().getRoles().get(0).getName(), event.getAuthor().getAvatarUrl());
            eb.setDescription(message);
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
