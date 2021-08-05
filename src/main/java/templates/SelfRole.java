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

        //

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

        //

    }

    /* Games */
    public void createGamesReactionMessage(MessageReceivedEvent event) {

        //

    }

    /* Movie */
    public void createMovieReactionMessage(MessageReceivedEvent event) {

        //

    }

    /* Music */
    public void createMusicReactionMessage(MessageReceivedEvent event) {

        //

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
        embedBuilder.setTitle("StarSign Roles");
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                " Fußball\n" +
                " Tennis\n" +
                " Basketball\n" +
                " Leichtatletk\n" +
                " Kampfport\n" +
                " Tanzsport\n" +
                "etc...");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
        });

    }

    /* Hobby */
    public void createHobbyReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Hobby", "EmbedColor"));
        embedBuilder.setTitle("StarSign Roles");
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                " Freunde Treffen\n" +
                " Fern sehen\n" +
                " Klettern\n" +
                " Schwimmen\n" +
                " Zocken\n" +
                "etc...");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
        });

    }

    /* Job */
    public void createJobReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Job", "EmbedColor"));
        embedBuilder.setTitle("StarSign Roles");
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                " Mediziener\n" +
                " Anwalt\n" +
                " Army\n" +
                " Erzieher\n" +
                " IT-ler\n" +
                " Pfleger\n" +
                " Bänker\n" +
                " Ingenuer\n" +
                " Mechaniker\n" +
                " Verkäufer\n" +
                "etc...");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
        });

    }

    /* Verification */
    public void createVerificationReactionMessage(MessageReceivedEvent event) {

        //

    }

}
