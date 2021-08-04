package database.sql;

import core.Main;
import net.dv8tion.jda.api.entities.Guild;

/**
 * @author DarkSide_Wolf
 * File was created in 12:54 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CreateDefaults {

    public void createDefaults(Guild guild){
        Main.getMySql().changeDatabase("FurryMaster_" + guild.getId());
        createEnglishLanguage(guild);
        createGermanLanguage(guild);
        createChannelNames(guild);
        createServerInfo(guild);
        createWarningList();
        createServerOptions(guild);
        createRoles(guild);
        createEmbedColor(guild);
        createEmoji(guild);
    }

    public void createGermanLanguage(Guild guild){
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "JoinMessageTemplate", "messageName,messageContent", "'JoinMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "JoinMessageImage", "messageName,messageContent", "'JoinMessageImage' , '!'");//Server/User/Custom-url
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "JoinMessageTemplatePM", "messageName,messageContent", "'JoinMessageTemplatePM' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "LeaveMessageTemplate", "messageName,messageContent", "'LeaveMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "LeaveMessageTemplatePM", "messageName,messageContent", "'LeaveMessageTemplatePM' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "WarnMessageTemplate", "messageName,messageContent", "'WarnMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "KickMessageTemplate", "messageName,messageContent", "'KickMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "BanMessageTemplate", "messageName,messageContent", "'BanMessageTemplate' , '!'");
    }

    public void createEnglishLanguage(Guild guild){
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "JoinMessageTemplate", "messageName,messageContent", "'JoinMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_DE", "messageName", "JoinMessageImage", "messageName,messageContent", "'JoinMessageImage' , '!'");//Server/User/Custom-url
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "JoinMessageTemplatePM", "messageName,messageContent", "'JoinMessageTemplatePM' , '!'");
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "LeaveMessageTemplate", "messageName,messageContent", "'LeaveMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "LeaveMessageTemplatePM", "messageName,messageContent", "'LeaveMessageTemplatePM' , '!'");
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "WarnMessageTemplate", "messageName,messageContent", "'WarnMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "KickMessageTemplate", "messageName,messageContent", "'KickMessageTemplate' , '!'");
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "BanMessageTemplate", "messageName,messageContent", "'BanMessageTemplate' , '!'");
    }

    public void createServerInfo(Guild guild){

        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "ServerName", "infoID,infoContent", "'ServerName' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "CommandPrefix", "infoID,infoContent", "'CommandPrefix' , '!'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "Description", "infoID,infoContent", "'Description' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "Image", "infoID,infoContent", "'Image' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "Owner", "infoID,infoContent", "'Owner' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "Tags", "infoID,infoContent", "'Tags' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "Votes", "infoID,infoContent", "'Votes' , '-'");
        Main.getMySql().insertInto(guild , "ServerInfo", "infoID", "License", "infoID,infoContent", "'License' , '-'");

    }

    //
    public void createWarningList(){
        /*
        *     RuleAbuse,
    Spam,
    Offense,
    * */
    }

    public void createChannelNames(Guild guild){

        /* Enviroment */
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "SupportChannel", "ChannelID,ChannelName", "'SupportChannel' , 'suppport'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "UserBotControlChannel", "ChannelID,ChannelName", "'UserBotControlChannel' , 'user-bot-control'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "AdminBotControlChannel", "ChannelID,ChannelName", "'AdminBotControlChannel' , 'admin-bot-control'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "VerifyChannel", "ChannelID,ChannelName", "'VerifyChannel' , 'verify'");

        /* Log */
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "Log", "ChannelID,ChannelName", "'Log' , 'log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "UserInfo", "ChannelID,ChannelName", "'UserInfo' , 'user-info'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "ChannelLog", "ChannelID,ChannelName", "'ChannelLog' , 'channel-log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "JoinLog", "ChannelID,ChannelName", "'JoinLog' , 'join-log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "LeaveLog", "ChannelID,ChannelName", "'LeaveLog' , 'leave-log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "InviteLog", "ChannelID,ChannelName", "'InviteLog' , 'invite-log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "RoleLog", "ChannelID,ChannelName", "'RoleLog' , 'role-log'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "RoleLog", "ChannelID,ChannelName", "'MessageLog' , 'message-log'");

        /* Stats */
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "OnlineMembersStats", "ChannelID,ChannelName", "'OnlineMembersStats' , 'Online Members: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "MemberStats", "ChannelID,ChannelName", "'MemberStats' , 'Members: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "BotsStats", "ChannelID,ChannelName", "'BotsStats' , 'Bots: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "TotalMemberStats", "ChannelID,ChannelName", "'TotalMemberStats' , 'Total Members: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "TextChannelStats", "ChannelID,ChannelName", "'TextChannelStats' , 'Text Channels: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "VoiceChannelStats", "ChannelID,ChannelName", "'VoiceChannelStats' , 'Voice Channels: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "TotalChannelStats", "ChannelID,ChannelName", "'TotalChannelStats' , 'Total Channels: {amount}'");
        Main.getMySql().insertInto(guild , "Channels", "ChannelID", "TotalRolesStats", "ChannelID,ChannelName", "'TotalRolesStats' , 'Total Roles: {amount}'");

    }

    public void createRoles(Guild guild){
        Main.getMySql().insertInto(guild , "Roles", "RoleUse", "BotAccess", "RoleUse,Roles", "'BotAccess' , '@everyone'");
        Main.getMySql().insertInto(guild , "Roles", "RoleUse", "JoinRoles", "RoleUse,Roles", "'JoinRoles' , '-'");
        Main.getMySql().insertInto(guild , "Roles", "RoleUse", "VerifiedRole", "RoleUse,Roles", "'VerifiedRole' , 'Verified'");
    }

    public void createEmbedColor(Guild guild){
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Gender", "EmbedMessage,EmbedColor", "'SelfRole_Gender' , '#be0afa'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Sex", "EmbedMessage,EmbedColor", "'SelfRole_Sex' , '#f50cc2'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Age", "EmbedMessage,EmbedColor", "'SelfRole_Age' , '#3b0af0'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Animal", "EmbedMessage,EmbedColor", "'SelfRole_Animal' , '-'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Color", "EmbedMessage,EmbedColor", "'SelfRole_Color' , '#8c0af0'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Country", "EmbedMessage,EmbedColor", "'SelfRole_Country' , '#02f533'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_GameCategory", "EmbedMessage,EmbedColor", "'SelfRole_GameCategory' , '-'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Games", "EmbedMessage,EmbedColor", "'SelfRole_Games' , '-'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Hobby", "EmbedMessage,EmbedColor", "'SelfRole_Hobby' , '#09d2e8'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Job", "EmbedMessage,EmbedColor", "'SelfRole_Job' , '#09d2e8'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Movie", "EmbedMessage,EmbedColor", "'SelfRole_Movie' , '-'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Music", "EmbedMessage,EmbedColor", "'SelfRole_Music' , '-'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Pronouns", "EmbedMessage,EmbedColor", "'SelfRole_Pronouns' , '#f5890f'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Sport", "EmbedMessage,EmbedColor", "'SelfRole_Sport' , '#09d2e8'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_StarSign", "EmbedMessage,EmbedColor", "'SelfRole_StarSign' , '#d2e80c'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "SelfRole_Verification", "EmbedMessage,EmbedColor", "'SelfRole_Verification' , '-'");

        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "JoinMessage", "EmbedMessage,EmbedColor", "'JoinMessage' , '#1aff00'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "LeaveMessage", "EmbedMessage,EmbedColor", "'LeaveMessage' , '#ff0000'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "Warning", "EmbedMessage,EmbedColor", "'Warning' , '#f7e700'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "Kick", "EmbedMessage,EmbedColor", "'Kick' , '#f7e700'");
        Main.getMySql().insertInto(guild , "EmbedColor", "EmbedMessage", "Ban", "EmbedMessage,EmbedColor", "'Ban' , '#ff0000'");
    }

    //
    public void createUserOptions(){
        //Language
        //PM Status
        //Is muted
        //Joined before
        //warns -> own DB entry
        //...
    }

    public void createServerOptions(Guild guild){
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_JoinMessage", "OptionName,OptionState", "'Module_JoinMessage' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_LeaveMessage", "OptionName,OptionState", "'Module_LeaveMessage' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_Level", "OptionName,OptionState", "'Module_Level' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_JoinRank", "OptionName,OptionState", "'Module_JoinRank' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_Warn", "OptionName,OptionState", "'Module_Warn' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "Module_ChatProtect", "OptionName,OptionState", "'Module_ChatProtect' , 'true'");//chat filter, Spamm protection


        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "ServerLanguage", "OptionName,OptionState", "'ServerLanguage' , 'EN'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "PrivateMessage", "OptionName,OptionState", "'PrivateMessage' , 'true'");
        Main.getMySql().insertInto(guild , "ServerOptions", "OptionName", "DeleteCommandMessage", "OptionName,OptionState", "'DeleteCommandMessage' , 'true'");
    }

    //
    public void createPlayList(){
        //Playlist - Lied Name, URL
    }

    public void createEmoji(Guild guild){
        Main.getMySql().insertInto(guild , "Emojo", "ReactionID", "Accept", "ReactionID,Reaction", "'Accept' , '!'");
        Main.getMySql().insertInto(guild , "Emojo", "ReactionID", "Deny", "ReactionID,Reaction", "'Deny' , '!'");

        Main.getMySql().insertInto(guild , "Emojo", "ReactionID", "Gender_Male", "ReactionID,Reaction", "'Gender_Male' , '!'");
        Main.getMySql().insertInto(guild , "Emojo", "ReactionID", "Gender_Male", "ReactionID,Reaction", "'Gender_Female' , '!'");
        Main.getMySql().insertInto(guild , "Emojo", "ReactionID", "Gender_Male", "ReactionID,Reaction", "'Gender_Other' , '!'");

    }

}
