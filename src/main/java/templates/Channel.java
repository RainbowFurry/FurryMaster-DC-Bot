package templates;

import core.Main;
import net.dv8tion.jda.api.entities.Guild;

/**
 * @author DarkSide_Wolf
 * File was created in 21:43 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Channel {

    public void createDefaultChannels(Guild guild){

        /* Info */
        guild.createCategory("Info").queue();
        guild.createTextChannel("welcome").queue();
        guild.createTextChannel("news").queue();
        guild.createTextChannel("rules").queue();

        /* Talk */
        guild.createCategory("Talk").queue();
        guild.createTextChannel("Austausch").queue();
        guild.createVoiceChannel("Talk - 1").queue();
        guild.createVoiceChannel("Talk - 2").queue();
        guild.createVoiceChannel("Talk - 3").queue();

        /* Support */
        guild.createCategory("Support").queue();
        guild.createTextChannel("support").queue();
        guild.createTextChannel("Support - 1").queue();
        guild.createTextChannel("Support - 2").queue();
        guild.createTextChannel("Support - 3").queue();

    }

    public void createLogChannels(Guild guild){
        if(guild.getTextChannelsByName((String) Main.getMySql().getObject(guild , "Channels", "ChannelID", "Log", "ChannelName"), false).get(0) == null) {
            guild.createCategory("Log's").queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "Log", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "UserInfo", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "ChannelLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "JoinLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "LeaveLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "InviteLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "RoleLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "MessageLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "InviteLog", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "NickNameLog", "ChannelName")).queue();
        }
    }

    public void createStatisticsChannels(Guild guild){
        if(guild.getTextChannelsByName((String) Main.getMySql().getObject(guild , "Channels", "ChannelID", "OnlineMembersStats", "ChannelName"), false).get(0) == null) {
            guild.createCategory("Statistic's").queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "OnlineMembersStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "MemberStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "BotsStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "TotalMemberStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "TextChannelStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "VoiceChannelStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "TotalChannelStats", "ChannelName")).queue();
            guild.createTextChannel((String) Main.getMySql().getObject(guild, "Channels", "ChannelID", "TotalRolesStats", "ChannelName")).queue();
        }
    }

    public void createNSFWChannels(Guild guild){
        guild.createCategory("NSFW").queue();
        guild.createTextChannel("NSFW").queue();

        guild.createTextChannel("solo-male").queue();
        guild.createTextChannel("solo-female").queue();
        guild.createTextChannel("guy-on-guy").queue();
        guild.createTextChannel("girl-on-girl").queue();

        guild.createTextChannel("anime").queue();
        guild.createTextChannel("hantai").queue();

        guild.createTextChannel("Furry").queue();
        guild.createTextChannel("Neko").queue();
    }

}
