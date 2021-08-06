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

        /* Enviroment */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Accept", "ReactionID,Reaction", "'Accept' , '!'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Deny", "ReactionID,Reaction", "'Deny' , '!'");

        /* Gender */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Male", "ReactionID,Reaction", "'Gender_Male' , ':mens:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Female", "ReactionID,Reaction", "'Gender_Female' , ':womens:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "Gender_Other", "ReactionID,Reaction", "'Gender_Other' , ':joy:'");

        /* Age */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_13-15", "ReactionID,Reaction", "'ReactionRole_Age_13-15' , ':baby_tone3:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_16-17", "ReactionID,Reaction", "'ReactionRole_Age_16-17' , ':adult_tone3:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Age_18+", "ReactionID,Reaction", "'ReactionRole_Age_18+' , ':older_adult_tone3:'");

        /* Animal */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Wolf", "ReactionID,Reaction", "'ReactionRole_Animal_Wolf' , ':wolf:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Dog", "ReactionID,Reaction", "'ReactionRole_Animal_Dog' , ':dog:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Cat", "ReactionID,Reaction", "'ReactionRole_Animal_Cat' , ':cat:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Rabbit", "ReactionID,Reaction", "'ReactionRole_Animal_Rabbit' , ':rabbit:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Fox", "ReactionID,Reaction", "'ReactionRole_Animal_Fox' , ':fox:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Bear", "ReactionID,Reaction", "'ReactionRole_Animal_Bear' , ':bear:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Tiger", "ReactionID,Reaction", "'ReactionRole_Animal_Tiger' , ':tiger:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Lion", "ReactionID,Reaction", "'ReactionRole_Animal_Lion' , ':lion_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Kangaroo", "ReactionID,Reaction", "'ReactionRole_Animal_Kangaroo' , ':kangaroo:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Giraffe", "ReactionID,Reaction", "'ReactionRole_Animal_Giraffe' , ':giraffe:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Monkey", "ReactionID,Reaction", "'ReactionRole_Animal_Monkey' , ':monkey_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Koala", "ReactionID,Reaction", "'ReactionRole_Animal_Koala' , ':koala:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Animal_Horse", "ReactionID,Reaction", "'ReactionRole_Animal_Horse' , ':horse:'");

        /* Color */
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

        /* Country */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Germany", "ReactionID,Reaction", "'ReactionRole_Country_Germany' , ':flag_de:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_America", "ReactionID,Reaction", "'ReactionRole_Country_America' , ':flag_us:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_England", "ReactionID,Reaction", "'ReactionRole_Country_England' , ':flag_gb:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Franc", "ReactionID,Reaction", "'ReactionRole_Country_Franc' , ':flag_fr:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Italy", "ReactionID,Reaction", "'ReactionRole_Country_Italy' , ':flag_it:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Russia", "ReactionID,Reaction", "'ReactionRole_Country_Russia' , ':flag_rs:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Country_Swiz", "ReactionID,Reaction", "'ReactionRole_Country_Swiz' , ':flag_ch:'");

        /* Pronouns */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_He", "ReactionID,Reaction", "'ReactionRole_Pronouns_He' , ':man_pouting:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_She", "ReactionID,Reaction", "'ReactionRole_Pronouns_She' , ':woman_pouting:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_It", "ReactionID,Reaction", "'ReactionRole_Pronouns_It' , ':nail_care:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Pronouns_Ask", "ReactionID,Reaction", "'ReactionRole_Pronouns_Ask' , ':question:'");

        /* Sex */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Gay", "ReactionID,Reaction", "'ReactionRole_Sex_Gay' , ':rainbow_flag:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Bi", "ReactionID,Reaction", "'ReactionRole_Sex_Bi' , ':star_struck:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Lesb", "ReactionID,Reaction", "'ReactionRole_Sex_Lesb' , ':partying_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Pansex", "ReactionID,Reaction", "'ReactionRole_Sex_Pansex' , ':blush:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Asex", "ReactionID,Reaction", "'ReactionRole_Sex_Asex' , ':stuck_out_tongue_closed_eyes:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Straight", "ReactionID,Reaction", "'ReactionRole_Sex_Straight' , ':grinning:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sex_Other", "ReactionID,Reaction", "'ReactionRole_Sex_Other' , ':slight_smile:'");

        /* StarSign */
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

        /* Job */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_IT", "ReactionID,Reaction", "'ReactionRole_Jobs_IT' , ':technologist:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Army", "ReactionID,Reaction", "'ReactionRole_Jobs_Army' , ':police_officer:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Medic", "ReactionID,Reaction", "'ReactionRole_Jobs_Medic' , ':health_worker:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Educator", "ReactionID,Reaction", "'ReactionRole_Jobs_Educator' , ':teacher:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Caregiver", "ReactionID,Reaction", "'ReactionRole_Jobs_Caregiver' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Social", "ReactionID,Reaction", "'ReactionRole_Jobs_Social' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Banker", "ReactionID,Reaction", "'ReactionRole_Jobs_Banker' , ':office_worker:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Ingenuer", "ReactionID,Reaction", "'ReactionRole_Jobs_Ingenuer' , ':construction_worker:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Mechanic", "ReactionID,Reaction", "'ReactionRole_Jobs_Mechanic' , ':red_car:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Jobs_Seller", "ReactionID,Reaction", "'ReactionRole_Jobs_Seller' , ':moneybag:'");

        /* Hobby */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Hobby_Draw", "ReactionID,Reaction", "'ReactionRole_Hobby_Draw' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Hobby_MeetUp", "ReactionID,Reaction", "'ReactionRole_Hobby_MeetUp' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Hobby_Gaming", "ReactionID,Reaction", "'ReactionRole_Hobby_Gaming' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Hobby_WatchTV", "ReactionID,Reaction", "'ReactionRole_Hobby_WatchTV' , '-'");

        /* Sport */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Swim", "ReactionID,Reaction", "'ReactionRole_Sport_Swim' , ':person_swimming:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Dance", "ReactionID,Reaction", "'ReactionRole_Sport_Dance' , ':dancer:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Climb", "ReactionID,Reaction", "'ReactionRole_Sport_Climb' , ':person_climbing:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Football", "ReactionID,Reaction", "'ReactionRole_Sport_Football' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Baseball", "ReactionID,Reaction", "'ReactionRole_Sport_Baseball' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Basketball", "ReactionID,Reaction", "'ReactionRole_Sport_Basketball' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Hockey", "ReactionID,Reaction", "'ReactionRole_Sport_Hockey' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Gun", "ReactionID,Reaction", "'ReactionRole_Sport_Gun' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Sport_Fight", "ReactionID,Reaction", "'ReactionRole_Sport_Fight' , '-'");

        /* GameCategory */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Action", "ReactionID,Reaction", "'ReactionRole_GameCategory_Action' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Action-Adventure", "ReactionID,Reaction", "'ReactionRole_GameCategory_Action-Adventure' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Adventure", "ReactionID,Reaction", "'ReactionRole_GameCategory_Adventure' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_RolePlay", "ReactionID,Reaction", "'ReactionRole_GameCategory_RolePlay' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Simulation", "ReactionID,Reaction", "'ReactionRole_GameCategory_Simulation' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Strategy", "ReactionID,Reaction", "'ReactionRole_GameCategory_Strategy' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Sport", "ReactionID,Reaction", "'ReactionRole_GameCategory_Sport' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Puzzle", "ReactionID,Reaction", "'ReactionRole_GameCategory_Puzzle' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_GameCategory_Idle", "ReactionID,Reaction", "'ReactionRole_GameCategory_Idle' , '-'");

        /* Game */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Game_Minecraft", "ReactionID,Reaction", "'ReactionRole_Game_Minecraft' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Game_Battlefield", "ReactionID,Reaction", "'ReactionRole_Game_Battlefield' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Game_CallOfDuty", "ReactionID,Reaction", "'ReactionRole_Game_CallOfDuty' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Game_CounterStrike", "ReactionID,Reaction", "'ReactionRole_Game_CounterStrike' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Game_DeadByDaylight", "ReactionID,Reaction", "'ReactionRole_Game_DeadByDaylight' , '-'");

        /* Movie */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Action", "ReactionID,Reaction", "'ReactionRole_Movie_Action' , ':gun:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Comedy", "ReactionID,Reaction", "'ReactionRole_Movie_Comedy' , ':rofl:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Drama", "ReactionID,Reaction", "'ReactionRole_Movie_Drama' , ':weary:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Horror", "ReactionID,Reaction", "'ReactionRole_Movie_Horror' , ':dizzy_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Fantasy", "ReactionID,Reaction", "'ReactionRole_Movie_Fantasy' , ':mage:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Mystery", "ReactionID,Reaction", "'ReactionRole_Movie_Mystery' , ':dragon_face:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Romance", "ReactionID,Reaction", "'ReactionRole_Movie_Romance' , ':heart_eyes:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Thriller", "ReactionID,Reaction", "'ReactionRole_Movie_Thriller' , ':grimacing:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Western", "ReactionID,Reaction", "'ReactionRole_Movie_Western' , ':cowboy:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Movie_Series", "ReactionID,Reaction", "'ReactionRole_Movie_Series' , ':clapper:'");

        /* Music */
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Country", "ReactionID,Reaction", "'ReactionRole_Music_Country' , ':cowboy:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Electronic", "ReactionID,Reaction", "'ReactionRole_Music_Electronic' , ':electric_plug:'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Funk", "ReactionID,Reaction", "'ReactionRole_Music_Funk' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_HipHop", "ReactionID,Reaction", "'ReactionRole_Music_HipHop' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Jazz", "ReactionID,Reaction", "'ReactionRole_Music_Jazz' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Pop", "ReactionID,Reaction", "'ReactionRole_Music_Pop' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Punk", "ReactionID,Reaction", "'ReactionRole_Music_Punk' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Rock", "ReactionID,Reaction", "'ReactionRole_Music_Rock' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Reggae", "ReactionID,Reaction", "'ReactionRole_Music_Reggae' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Metal", "ReactionID,Reaction", "'ReactionRole_Music_Metal' , '-'");
        Main.getMySql().insertInto(guild , "Emoji", "ReactionID", "ReactionRole_Music_Tradition", "ReactionID,Reaction", "'ReactionRole_Music_Tradition' , '-'");

    }

}
