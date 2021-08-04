package core;

import commands.JasonJT.CreateSQL;
import commands.JasonJT.SetActivity;
import commands.JasonJT.Test;
import commands.groups.admin.*;
import commands.groups.global.*;
import commands.groups.user.Commands;
import commands.groups.user.EmbedMessage;
import database.sql.AsyncMySqlManager;
import database.sql.CreateDefaults;
import listener.essentials.*;

import listener.module.JoinRoleListener;
import listener.module.SentJoinMessageListener;
import listener.module.SentLeaveMessageListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;

import utils.SECRETS;
import utils.STATIC;

import java.util.logging.Logger;

/**
 * @author DarkSide_Wolf
 * File was created in 17:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Main {

    public static JDA jda;
    private static Logger logger;
    private static JDABuilder builder;
    private static AsyncMySqlManager mySql;

    /* Start/Execute Bot */
    public static void main(String[] args) throws Throwable {

        logger = Logger.getGlobal();
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s %n");

        //Start MySql Connection
        startMySQL();

        //Set up defaults
        builder = new JDABuilder(AccountType.BOT);
        builder.setToken(SECRETS.TOKEN);
        builder.setAutoReconnect(true);

        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.of(Activity.ActivityType.DEFAULT, STATIC.GAME));

        jda = builder.build();

        //Register Commands and Listener
        listenerRegistration();//Register Listener
        commandRegistration();//Register Commands

    }

    /* Register all Commands */
    private static void commandRegistration() {

        /* JasonJT */
        CommandHandler.commandMap.put("test", new Test());//TEST
        CommandHandler.commandMap.put("sql", new CreateSQL());//Recreate the SQL for the Current Bot
        CommandHandler.commandMap.put("activity", new SetActivity());//Set the Bot Activity

        /* Global */
        CommandHandler.commandMap.put("help", new Help());//Help Command - Display a HelpGuid to the User
        CommandHandler.commandMap.put("invite", new UserInvite());//Invite Command - Create a new Invite and send it to the User
        CommandHandler.commandMap.put("botinvite", new BotInvite());//BotInvite Command - Invite the Bot to your own Discord
        CommandHandler.commandMap.put("botcreator", new BotCreator());//BotCreator Command - Shows Info about the Bot Creator
        CommandHandler.commandMap.put("ping", new Ping());//Ping Command - Ping the Bot or a Webserver
        //CommandHandler.commandMap.put("uptime", new UpTime());//Uptime Command - Get the Uptime of the Bot

        /* Admin */
        CommandHandler.commandMap.put("userinfo", new UserInfo());//UserInfo Command - Show all Details about a User
        CommandHandler.commandMap.put("clear", new ChatClear());//ChatClear Command - Clear the Channel Chat
        //CommandHandler.commandMap.put("kick", new Kick());//Kick Command - Kick a User with a Message from the Guild
        //CommandHandler.commandMap.put("ban", new Ban());//Ban Command - Ban a User with a Message from the Guild
        //CommandHandler.commandMap.put("mute", new Mute());//Mute Command - Mute a User with a Message on the Guild
        //CommandHandler.commandMap.put("rainbowrole", new RainbowRole());//RainbowRole Command - Show your Role in RGB
        //CommandHandler.commandMap.put("chatreaction", new ChatReaction());//Chat Reaction Setup
        CommandHandler.commandMap.put("selfrole", new ChatReaction());//selfrole Command - Create the self Role Messages

        /* User */
        //CommandHandler.commandMap.put("embed", new EmbedMessage());//Embed Command - Create custom Embed Message
        CommandHandler.commandMap.put("commands", new Commands());//Commands Command - List all Bot Commands (Permission based)

        /* Music */
        //CommandHandler.commandMap.put("pause", new Pause());
        //CommandHandler.commandMap.put("play", new Play());
        //CommandHandler.commandMap.put("resume", new Resume());
        //CommandHandler.commandMap.put("stop", new Stop());
        //CommandHandler.commandMap.put("volume", new Volume());

        System.out.println("FurryMaster: All Commands has been registrated");

    }

    /* Register all Listener */
    private static void listenerRegistration() {

        /* Essentials */
        jda.addEventListener(new CommandListener(new CommandHandler()));//Handle Commands
        jda.addEventListener(new ReadyListener());//Bot started output Message
        jda.addEventListener(new BotGuildJoinListener());//Create Database on Bot join Guild
        //jda.addEventListener(new UpTimeListener());//Track the UpTime of the Bot

        /* Module */
        jda.addEventListener(new SentJoinMessageListener());//Sent User Join Message
        jda.addEventListener(new SentLeaveMessageListener());//Sent User Leave Message
        //jda.addEventListener(new SupportListener());//Track if a User needs Support and message Staffs
        //jda.addEventListener(new ChatFilterListener());//Filter the Chat
        //jda.addEventListener(new SpammListener());//Block Users from spamming the Chat
        //jda.addEventListener(new LevelSystemListener());//Handle User Level System
        //jda.addEventListener(new ChatReaction());//Handle ChatReaction Setup
        jda.addEventListener(new JoinRoleListener());//Handle Join Role

        /* Log */
        //jda.addEventListener(new GuildJoinLogListener());//Log User Join
        //jda.addEventListener(new GuildLeaveLogListener());//Log User Leave
        //jda.addEventListener(new ChannelLogListener());//Log Channel Create/Delete/Edit
        //jda.addEventListener(new MessageLogListener());//Log Message Update/Delete
        //jda.addEventListener(new CommandLogListener());//Log Command executed

        /* Stats */
        //jda.addEventListener(new OnlineMembersStatsListener());//
        //jda.addEventListener(new MembersStatsListener());//
        //jda.addEventListener(new BotsStatsListener());//
        //jda.addEventListener(new TotalMembersStatsListener());//
        //jda.addEventListener(new TextChannelsStatsListener());//
        //jda.addEventListener(new VoiceChannelsStatsListener());//
        //jda.addEventListener(new TotalChannelsStatsListener());//
        //jda.addEventListener(new TotalRolesStatsListener());//

        /* ChatReaction - Role */
        //jda.addEventListener(new Age());//
        //jda.addEventListener(new Animal());//
        //jda.addEventListener(new Color());//
        //jda.addEventListener(new Country());//
        //jda.addEventListener(new GameCategory());//
        //jda.addEventListener(new Games());//
        //jda.addEventListener(new Gender());//
        //jda.addEventListener(new Movie());//
        //jda.addEventListener(new Music());//
        //jda.addEventListener(new Pronouns());//
        //jda.addEventListener(new Sexuality());//
        //jda.addEventListener(new StarSign());//
        //jda.addEventListener(new Job());//
        //jda.addEventListener(new Sport());//
        //jda.addEventListener(new Hobby());//
        //jda.addEventListener(new Verification());//

        /* ChatReaction - Options */

        /* ChatReaction - Setup */

        System.out.println("FurryMaster: All Listener has been registrated");

    }


    /* SQL */
    private static void startMySQL() throws Throwable {
        setMySql(new AsyncMySqlManager("darkwolfcraft.net",
                3306,
                "discord",
                "Lands_at_the_sea"));
        System.out.println("FurryMaster: MySql Connection has been created Successfully!");
    }

    public static void setMySql(AsyncMySqlManager mySql) {
        Main.mySql = mySql;
    }

    public static AsyncMySqlManager getMySql() {
        return mySql;
    }

    public static void manageMySQL(Guild guild) {

        mySql.createDatabase("FurryMaster_" + guild.getId());
        mySql.changeDatabase("FurryMaster_" + guild.getId());

        //User Options on Join
        mySql.createTable(guild, "Channels", "ChannelID varchar(64), ChannelName TEXT, PRIMARY KEY(ChannelID)");
        mySql.createTable(guild, "ServerOptions", "OptionName varchar(64), OptionState TEXT, PRIMARY KEY(OptionName)");
        mySql.createTable(guild, "ServerInfo", "infoID varchar(64), infoContent TEXT, PRIMARY KEY(infoID)");
        mySql.createTable(guild, "Language_DE", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
        mySql.createTable(guild, "Language_EN", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
        mySql.createTable(guild, "Roles", "RoleUse varchar(64), Roles TEXT, PRIMARY KEY(RoleUse)");
        mySql.createTable(guild, "EmbedColor", "EmbedMessage varchar(64), EmbedColor TEXT, PRIMARY KEY(EmbedMessage)");
        mySql.createTable(guild, "Emoji", "ReactionID varchar(64), Reaction TEXT, PRIMARY KEY(ReactionID)");

        //Create user db on join | name, id, language, pm, level, ep, ...
        //Warning/ban list - Warning1, Text, Warns getting
        //Playlist Music
        //level - LevelID, LevelName, LevelEP

        //Create Default Values for Database
        new CreateDefaults().createDefaults(guild);

    }

    public static JDABuilder getBuilder(){
        return builder;
    }

    public static Logger getLogger(){
        return logger;
    }

}
