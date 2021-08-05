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
        Main.getMySql().insertInto(guild , "Language_EN", "messageName", "JoinMessageImage", "messageName,messageContent", "'JoinMessageImage' , '!'");//Server/User/Custom-url
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

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Male", "ReactionID,Reaction", "'Gender_Male' , ':male_sign:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Female", "ReactionID,Reaction", "'Gender_Female' , ':female_sign:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Other", "ReactionID,Reaction", "'Gender_Other' , ':ll_genderneutral_sign:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_13-15", "ReactionID,Reaction", "'ReactionRole_Age_13-15' , ':baby_tone3:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_16-17", "ReactionID,Reaction", "'ReactionRole_Age_16-17' , ':adult_tone3:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_18+", "ReactionID,Reaction", "'ReactionRole_Age_18+' , ':older_adult_tone3:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Red", "ReactionID,Reaction", "'ReactionRole_Color_Red' , ':red_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Orange", "ReactionID,Reaction", "'ReactionRole_Color_Orange' , ':orange_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Yellow", "ReactionID,Reaction", "'ReactionRole_Color_Yellow' , ':yellow_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Green", "ReactionID,Reaction", "'ReactionRole_Color_Green' , ':green_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Blue", "ReactionID,Reaction", "'ReactionRole_Color_Blue' , ':blue_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Purple", "ReactionID,Reaction", "'ReactionRole_Color_Purple' , ':purple_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Pink", "ReactionID,Reaction", "'ReactionRole_Color_Pink' , ':hibiscus:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Cyan", "ReactionID,Reaction", "'ReactionRole_Color_Cyan' , ':blossom:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Brown", "ReactionID,Reaction", "'ReactionRole_Color_Brown' , ':brown_circle:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Light", "ReactionID,Reaction", "'ReactionRole_Color_Light' , ':white_circle:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Color_Dark", "ReactionID,Reaction", "'ReactionRole_Color_Dark' , ':black_circle:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Germany", "ReactionID,Reaction", "'ReactionRole_Country_Germany' , ':flag_de:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_America", "ReactionID,Reaction", "'ReactionRole_Country_America' , ':flag_us:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_England", "ReactionID,Reaction", "'ReactionRole_Country_England' , ':flag_gb:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Franc", "ReactionID,Reaction", "'ReactionRole_Country_Franc' , ':flag_fr:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Italy", "ReactionID,Reaction", "'ReactionRole_Country_Italy' , ':flag_it:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Russia", "ReactionID,Reaction", "'ReactionRole_Country_Russia' , ':flag_rs:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Swiz", "ReactionID,Reaction", "'ReactionRole_Country_Swiz' , ':flag_ch:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_He", "ReactionID,Reaction", "'ReactionRole_Pronouns_He' , ':man_pouting:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_She", "ReactionID,Reaction", "'ReactionRole_Pronouns_She' , ':woman_pouting:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_It", "ReactionID,Reaction", "'ReactionRole_Pronouns_It' , ':nail_care:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_Ask", "ReactionID,Reaction", "'ReactionRole_Pronouns_Ask' , ':question:'");
//
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Gay", "ReactionID,Reaction", "'ReactionRole_Sex_Gay' , ':rainbow_flag:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Bi", "ReactionID,Reaction", "'ReactionRole_Sex_Bi' , ':star_struck:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Lesb", "ReactionID,Reaction", "'ReactionRole_Sex_Lesb' , ':partying_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Pansex", "ReactionID,Reaction", "'ReactionRole_Sex_Pansex' , ':blush:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Asex", "ReactionID,Reaction", "'ReactionRole_Sex_Asex' , ':stuck_out_tongue_closed_eyes:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Asex", "ReactionID,Reaction", "'ReactionRole_Sex_Straight' , ':grinning:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Other", "ReactionID,Reaction", "'ReactionRole_Sex_Other' , ':slight_smile:'");

        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Capricorn", "ReactionID,Reaction", "'ReactionRole_StarSign_Capricorn' , ':Capricorn:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Aquarius", "ReactionID,Reaction", "'ReactionRole_StarSign_Aquarius' , ':Aquarius:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Pisces", "ReactionID,Reaction", "'ReactionRole_StarSign_Pisces' , ':Pisces:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Aries", "ReactionID,Reaction", "'ReactionRole_StarSign_Aries' , ':Aries:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Taurus", "ReactionID,Reaction", "'ReactionRole_StarSign_Taurus' , ':Taurus:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Gemini", "ReactionID,Reaction", "'ReactionRole_StarSign_Gemini' , ':Gemini:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Cancer", "ReactionID,Reaction", "'ReactionRole_StarSign_Cancer' , ':Cancer:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Leo", "ReactionID,Reaction", "'ReactionRole_StarSign_Leo' , ':Leo:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Virgo", "ReactionID,Reaction", "'ReactionRole_StarSign_Virgo' , ':Virgo:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Libra", "ReactionID,Reaction", "'ReactionRole_StarSign_Libra' , ':Libra:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Scorpio", "ReactionID,Reaction", "'ReactionRole_StarSign_Scorpio' , ':Scorpio:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_StarSign_Sagittarius", "ReactionID,Reaction", "'ReactionRole_StarSign_Sagittarius' , ':Sagittarius:'");

    }

}
