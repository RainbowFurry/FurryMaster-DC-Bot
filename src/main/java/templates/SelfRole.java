package templates;

import builder.CustomEmbedBuilder;
import com.vdurmont.emoji.EmojiParser;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.internal.requests.Route;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 13:25 04.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class SelfRole {

    /* Gender */
    public void createGenderReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Gender", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Gender_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Male", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Gender_Male", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Female", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Gender_Female", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Other", "Reaction") + " **Other**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Male", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Female", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "Gender_Other", "Reaction"))).queue();
        });

    }

    /* Age */
    public void createAgeReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Age", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_13-15", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_13-15", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_16-17", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_16-17", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_18+", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_18+", "messageContent") + "**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_13-15", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_16-17", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Age_18+", "Reaction"))).queue();
        });

    }

    /* Animal */
    public void createAnimalReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Animal", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Wolf", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Wolf", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Cat", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Cat", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Dog", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Dog", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Fox", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Fox", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Rabbit", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Rabbit", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Bear", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Bear", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Tiger", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Tiger", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Lion", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Lion", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Kangaroo", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Kangaroo", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Giraffe", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Giraffe", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Monkey", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Monkey", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Koala", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Koala", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Horse", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Animal_Horse", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Wolf", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Cat", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Dog", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Fox", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Rabbit", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Bear", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Tiger", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Lion", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Kangoroo", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Giraffe", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Monkey", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Koala", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Animal_Horse", "Reaction"))).queue();
        });

    }

    /* Color */
    public void createColorReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Color", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Red", "Reaction") + ": **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Red", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Orange", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Yellow", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Yellow", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Orange", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Green", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Green", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Blue", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Blue", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Purple", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Purple", "messageContent") + "**\n" +
                //ReactionRole_Color_Pink
                //ReactionRole_Color_Cyan
                //ReactionRole_Color_Brown
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Light", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Light", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Dark", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Dark", "messageContent") + "**\n");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Red", "Reaction"))).queue();//red
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Orange", "Reaction"))).queue();//orange
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Yellow", "Reaction"))).queue();//yellow
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Green", "Reaction"))).queue();//green
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Blue", "Reaction"))).queue();//blue
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Purple", "Reaction"))).queue();//purble
            //pink
            //cyan
            //message.addReaction("🟤").queue();//brown

            message.addReaction((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Light", "Reaction")).queue();//light
            message.addReaction((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Color_Dark", "Reaction")).queue();//dark
        });

    }

    /* Country */
    public void createCountryReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Country", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Germany", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Germany", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_America", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_America", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_England", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_England", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Franc", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Franc", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Italy", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Italy", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Russia", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Russia", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Swiz", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Swiz", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Germany", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_America", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_England", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Franc", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Italy", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Russia", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Country_Swiz", "Reaction"))).queue();
        });

    }

    /* GameCategory */
    public void createGameCategoryReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_GameCategory", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Action", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action-Adventure", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Action-Adventure", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Adventure", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Adventure", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_RolePlay", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_RolePlay", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Simulation", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Simulation", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Strategy", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Strategy", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Sport", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Sport", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Puzzle", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Puzzle", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Pidle", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_GameCategory_Pidle", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Action-Adventure", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Adventure", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_RolePlay", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Simulation", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Strategy", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Sport", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Puzzle", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_GameCategory_Pidle", "Reaction"))).queue();
        });

    }

    /* Games */
    public void createGamesReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Game", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Game_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_Minecraft", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Game_Minecraft", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_Battlefield", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Game_Battlefield", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_CounterStrike", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Game_CounterStrike", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_DeadByDaylight", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Game_DeadByDaylight", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_Minecraft", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_Battlefield", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_CounterStrike", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Game_DeadByDaylight", "Reaction"))).queue();
        });

    }

    /* Movie */
    public void createMovieReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Movie", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Action", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Action", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Comedy", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Comedy", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Drama", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Drama", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Horror", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Horror", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Fantasy", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Fantasy", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Mystery", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Mystery", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Romance", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Romance", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Thriller", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Thriller", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Western", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Western", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Series", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Movie_Series", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Action", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Comedy", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Drama", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Horror", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Fantasy", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Mystery", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Romance", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Thriller", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Western", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Movie_Series", "Reaction"))).queue();
        });

    }

    /* Music */
    public void createMusicReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Music", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Country", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Country", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Electronic", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Electronic", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Funk", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Funk", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_HipHop", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_HipHop", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Jazz", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Jazz", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Pop", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Pop", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Punk", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Punk", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Rock", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Rock", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Reggae", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Reggae", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Metal", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Metal", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Tradition", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Music_Tradition", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Country", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Electronic", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Funk", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_HipHop", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Jazz", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Pop", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Punk", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Rock", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Reggae", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Metal", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Tradition", "Reaction"))).queue();
        });

    }

    /* Pronouns */
    public void createPronounsReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Pronouns", "EmbedColor"));
        embedBuilder.setTitle("Pronouns Roles");
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_He", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_He", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_She", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_She", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_It", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_It", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_Ask", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_Ask", "messageContent") + "**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_He", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_She", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_It", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Pronouns_Ask", "Reaction"))).queue();
        });

    }

    /* Sexuality */
    public void createSexualityReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Sex", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Gay", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Gay", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Bi", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Bi", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Lesb", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Lesb", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Pansex", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Pan", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Asex", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Asex", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Straight", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Straight", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Other", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Other", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Gay", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Bi", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Lesb", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Pansex", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Asex", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Straight", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sex_Other", "Reaction"))).queue();
        });

    }

    /* StarSign */
    public void createStarSignReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_StarSign", "EmbedColor"));
        embedBuilder.setTitle("StarSign Roles");
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Capricorn", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Capricorn", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Aquarius", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Aquarius", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Pisces", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Pisces", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Aries", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Aries", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Taurus", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Taurus", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Gemini", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Gemini", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Cancer", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Cancer", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Leo", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Leo", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Virgo", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Virgo", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Libra", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Libra", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Scorpio", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Scorpio", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Sagittarius", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_StarSign_Sagittarius", "messageContent") + "**"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Capricorn", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Aquarius", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Pisces", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Aries", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Taurus", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Gemini", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Cancer", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Leo", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Virgo", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Libra", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Scorpio", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_StarSign_Sagittarius", "Reaction"))).queue();
        });

    }

    /* Sport */
    public void createSportReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Sport", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Swim", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Swim", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Dance", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Dance", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Climb", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Climb", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Football", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Football", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Baseball", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Baseball", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Basketball", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Basketball", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Hockey", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Hockey", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Gun", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Gun", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Fight", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sport_Fight", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Swim", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Dance", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Climb", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Football", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Baseball", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Basketball", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Hockey", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Music_Rock", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Gun", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Sport_Fight", "Reaction"))).queue();
        });

    }

    /* Hobby */
    public void createHobbyReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Hobby", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Hobby_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_Draw", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Hobby_Draw", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_MeetUp", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Hobby_MeetUp", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_Gaming", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Hobby_Gaming", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_WatchTV", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Hobby_WatchTV", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_Draw", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_MeetUp", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_Gaming", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Hobby_WatchTV", "Reaction"))).queue();
        });

    }

    /* Job */
    public void createJobReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Job", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Job_Heading", "messageContent"));
        embedBuilder.setContent(Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_IT", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_IT", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Army", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Army", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Medic", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Medic", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Educator", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Educator", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Caregiver", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Caregiver", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Social", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Social", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Banker", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Banker", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Ingenuer", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Ingenuer", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Mechanic", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Mechanic", "messageContent") + "**\n" +
                Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Seller", "Reaction") + " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Jobs_Seller", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_IT", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Army", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Medic", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Educator", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Caregiver", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Social", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Banker", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Ingenuer", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Mechanic", "Reaction"))).queue();
            message.addReaction(EmojiParser.parseToUnicode((String) Main.getMySql().getObject(event.getGuild(), "Emoji", "ReactionID", "ReactionRole_Jobs_Seller", "Reaction"))).queue();
        });

    }

    /* Verification */
    public void createVerificationReactionMessage(MessageReceivedEvent event) {

        //

    }

}
