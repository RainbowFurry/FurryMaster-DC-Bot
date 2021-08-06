package commands.JasonJT;

import commands.Command;
import core.Main;
import database.sql.CreateDefaults;
import database.sql.Master;
import manager.Checker;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Locale;

/**
 * @author DarkSide_Wolf
 * File was created in 21:27 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CreateSQL implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

            if(args.length == 3 || args[1].equals("Master")) {

                if(args[0].equals("create")) {
                    if (args[1].equals("Server")) {

                        switch (args[2].toLowerCase()){

                            case "all":
                                Main.manageMySQL(event.getGuild());
                                break;

                            case "channel":
                                Main.getMySql().createTable(event.getGuild(), "Channels", "ChannelID varchar(64), ChannelName TEXT, PRIMARY KEY(ChannelID)");
                                new CreateDefaults().createChannelNames(event.getGuild());
                                break;

                            case "emoji":
                                Main.getMySql().createTable(event.getGuild(), "Emoji", "ReactionID varchar(64), Reaction TEXT, PRIMARY KEY(ReactionID)");
                                new CreateDefaults().createEmoji(event.getGuild());
                                break;

                            case "language":
                                Main.getMySql().createTable(event.getGuild(), "Language_DE", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
                                Main.getMySql().createTable(event.getGuild(), "Language_EN", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
                                new CreateDefaults().createEnglishLanguage(event.getGuild());
                                new CreateDefaults().createGermanLanguage(event.getGuild());
                                break;

                            case "roles":
                                Main.getMySql().createTable(event.getGuild(), "Roles", "RoleUse varchar(64), Roles TEXT, PRIMARY KEY(RoleUse)");
                                new CreateDefaults().createRoles(event.getGuild());
                                break;

                            case "serveroptions":
                                Main.getMySql().createTable(event.getGuild(), "ServerOptions", "OptionName varchar(64), OptionState TEXT, PRIMARY KEY(OptionName)");
                                new CreateDefaults().createServerOptions(event.getGuild());
                                break;

                            case "serverinfo":
                                Main.getMySql().createTable(event.getGuild(), "ServerInfo", "infoID varchar(64), infoContent TEXT, PRIMARY KEY(infoID)");
                                new CreateDefaults().createServerInfo(event.getGuild());
                                break;

                            case "embedcolor":
                                Main.getMySql().createTable(event.getGuild(), "EmbedColor", "EmbedMessage varchar(64), EmbedColor TEXT, PRIMARY KEY(EmbedMessage)");
                                new CreateDefaults().createEmbedColor(event.getGuild());
                                break;

                        }

                        System.out.println("FurryMaster: Die Server Datenbank " + args[2] + " wurde erstellt.");
                        event.getTextChannel().sendMessage("Die Server Datenbank " + args[2] + " wurde erstellt.").queue();

                    } else if (args[1].equals("Master")) {
                        if (Checker.isBotCreator(event.getMember().getUser())) {
                            Master master = new Master();
                            master.createMasterDB();
                            System.out.println("FurryMaster: Die Master Datenbank wurde erstellt.");
                            event.getTextChannel().sendMessage("Die Master Datenbank wurde erstellt.").queue();
                        }
                    }

                }else if(args[0].equals("delete")){

                    if (args[1].equals("Server")) {

                        switch (args[2].toLowerCase()){

                            case "all":
                                Main.getMySql().deleteDatabase(event.getGuild());
                                break;

                            case "channel":
                                Main.getMySql().deleteTable(event.getGuild(), "Channel");
                                break;

                            case "emoji":
                                Main.getMySql().deleteTable(event.getGuild(), "Emoji");
                                break;

                            case "language":
                                Main.getMySql().deleteTable(event.getGuild(), "Language_DE");
                                Main.getMySql().deleteTable(event.getGuild(), "Language_EN");
                                break;

                            case "roles":
                                Main.getMySql().deleteTable(event.getGuild(), "Roles");
                                break;

                            case "serveroptions":
                                Main.getMySql().deleteTable(event.getGuild(), "ServerOptions");
                                break;

                            case "serverinfo":
                                Main.getMySql().deleteTable(event.getGuild(), "ServerInfo");
                                break;

                            case "embedcolor":
                                Main.getMySql().deleteTable(event.getGuild(), "EmbedColor");
                                break;

                        }

                        System.out.println("FurryMaster: Die Server Datenbank " + args[2] + " wurde gelöscht.");
                        event.getTextChannel().sendMessage("Die Server Datenbank " + args[2] + " wurde gelöscht.").queue();

                    } else if (args[1].equals("Master")) {
                        if (Checker.isBotCreator(event.getMember().getUser())) {
                            Main.getMySql().deleteTable(null, "Language_DE");
                            Main.getMySql().deleteTable(null, "Language_EN");
                            System.out.println("FurryMaster: Die Master Datenbank wurde gelöscht.");
                            event.getTextChannel().sendMessage("Die Master Datenbank wurde gelöscht.").queue();
                        }
                    }

                }

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
