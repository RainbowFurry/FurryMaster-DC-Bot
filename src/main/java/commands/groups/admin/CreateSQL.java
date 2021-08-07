package commands.groups.admin;

import commands.Command;
import core.Main;
import database.sql.CreateDefaults;
import database.sql.Master;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;
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

        if (args.length == 3 || args[1].equals("Master")) {

            if (args[0].equals("create")) {
                if (args[1].equals("Server")) {

                    createServer(args[2].toLowerCase(), event.getGuild());

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

            } else if (args[0].equals("delete")) {

                if (args[1].equals("Server")) {

                    deleteServer(args[2].toLowerCase(), event.getGuild());

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

        } else if (args.length == 4) {
            if (args[1].equals("Global")) {
                if (Checker.isBotCreator(event.getMember().getUser())) {

                    if(args[0].equals("create")){
                        createServer(args[2].toLowerCase(), event.getJDA().getGuildById(args[3]));
                    }else if(args[0].equals("delete")){
                        deleteServer(args[2].toLowerCase(), event.getJDA().getGuildById(args[3]));
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

    private void deleteServer(String checker, Guild guild){
        switch (checker) {

            case "all":
                Main.getMySql().deleteDatabase(guild);
                break;

            case "channel":
                Main.getMySql().deleteTable(guild, "Channel");
                break;

            case "emoji":
                Main.getMySql().deleteTable(guild, "Emoji");
                break;

            case "language":
                Main.getMySql().deleteTable(guild, "Language_DE");
                Main.getMySql().deleteTable(guild, "Language_EN");
                break;

            case "roles":
                Main.getMySql().deleteTable(guild, "Roles");
                break;

            case "serveroptions":
                Main.getMySql().deleteTable(guild, "ServerOptions");
                break;

            case "serverinfo":
                Main.getMySql().deleteTable(guild, "ServerInfo");
                break;

            case "embedcolor":
                Main.getMySql().deleteTable(guild, "EmbedColor");
                break;

        }
    }

    private void createServer(String checker, Guild guild){
        switch (checker) {

            case "all":
                Main.manageMySQL(guild);
                break;

            case "channel":
                Main.getMySql().createTable(guild, "Channels", "ChannelID varchar(64), ChannelName TEXT, PRIMARY KEY(ChannelID)");
                new CreateDefaults().createChannelNames(guild);
                break;

            case "emoji":
                Main.getMySql().createTable(guild, "Emoji", "ReactionID varchar(64), Reaction TEXT, PRIMARY KEY(ReactionID)");
                new CreateDefaults().createEmoji(guild);
                break;

            case "language":
                Main.getMySql().createTable(guild, "Language_DE", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
                Main.getMySql().createTable(guild, "Language_EN", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
                new CreateDefaults().createEnglishLanguage(guild);
                new CreateDefaults().createGermanLanguage(guild);
                break;

            case "roles":
                Main.getMySql().createTable(guild, "Roles", "RoleUse varchar(64), Roles TEXT, PRIMARY KEY(RoleUse)");
                new CreateDefaults().createRoles(guild);
                break;

            case "serveroptions":
                Main.getMySql().createTable(guild, "ServerOptions", "OptionName varchar(64), OptionState TEXT, PRIMARY KEY(OptionName)");
                new CreateDefaults().createServerOptions(guild);
                break;

            case "serverinfo":
                Main.getMySql().createTable(guild, "ServerInfo", "infoID varchar(64), infoContent TEXT, PRIMARY KEY(infoID)");
                new CreateDefaults().createServerInfo(guild);
                break;

            case "embedcolor":
                Main.getMySql().createTable(guild, "EmbedColor", "EmbedMessage varchar(64), EmbedColor TEXT, PRIMARY KEY(EmbedMessage)");
                new CreateDefaults().createEmbedColor(guild);
                break;

        }
    }

}
