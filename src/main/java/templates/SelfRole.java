package templates;

import builder.CustomEmbedBuilder;
import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

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
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                ":male_sign: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Gender_Male", "messageContent") + "**\n" +
                ":female_sign: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Gender_Female", "messageContent") + "**\n" +
                ":joy: **Other**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction("🚹").queue();
            message.addReaction("🚺").queue();
            message.addReaction("💚").queue();
        });

    }

    /* Age */
    public void createAgeReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Age", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_Heading", "messageContent"));
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                ":baby_tone3: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_13-15", "messageContent") + "**\n" +
                ":adult_tone3: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_16-17", "messageContent") + "**\n" +
                ":older_adult_tone3: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Age_18+", "messageContent") + "**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction("👶🏽").queue();
            message.addReaction("🧑🏽").queue();
            message.addReaction("👨🏽‍🦳").queue();
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
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "MultipleSelection", "messageContent") + "\n" +
                "\n" +
                ":red_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Red", "messageContent") + "**\n" +
                ":orange_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Yellow", "messageContent") + "**\n" +
                ":yellow_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Orange", "messageContent") + "**\n" +
                ":green_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Green", "messageContent") + "**\n" +
                ":blue_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Blue", "messageContent") + "**\n" +
                ":purple_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Purple", "messageContent") + "**\n" +
                "\n" +
                ":white_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Light", "messageContent") + "**\n" +
                ":black_circle: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Color_Dark", "messageContent") + "**\n");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction("🔴").queue();//red
            message.addReaction("🟠").queue();//orange
            message.addReaction("🟡").queue();//yellow
            message.addReaction("🟢").queue();//green
            message.addReaction("🔵").queue();//blue
            message.addReaction("🟣").queue();//purble
            message.addReaction("🟤").queue();//brown

            message.addReaction("⚪").queue();//light
            message.addReaction("⚫").queue();//dark
        });

    }

    /* Country */
    public void createCountryReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Country", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Heading", "messageContent"));
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                ":flag_de: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Germany", "messageContent") + "**\n" +
                ":flag_us: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_America", "messageContent") + "**\n" +
                " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_England", "messageContent") + "**\n" +
                " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Franc", "messageContent") + "**\n" +
                " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Italy", "messageContent") + "**\n" +
                " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Russia", "messageContent") + "**\n" +
                " **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Country_Swiz", "messageContent") + "**\n"
        );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            //message.addReaction("").queue();
            //message.addReaction("").queue();
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
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                ":slight_smile: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_He", "messageContent") + "**\n" +
                ":grinning: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_She", "messageContent") + "**\n" +
                ":blush: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_It", "messageContent") + "**\n" +
                ":innocent: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Pronouns_Ask", "messageContent") + "**");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction("🙂").queue();
            message.addReaction("😀").queue();
            message.addReaction("😊").queue();
            message.addReaction("😇").queue();
        });

    }

    /* Sexuality */
    public void createSexualityReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_Sex", "EmbedColor"));
        embedBuilder.setTitle((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Heading", "messageContent"));
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                ":heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Gay", "messageContent") + "**\n" +
                ":orange_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Bi", "messageContent") + "**\n" +
                ":yellow_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Lesb", "messageContent") + "**\n" +
                ":green_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Pan", "messageContent") + "**\n" +
                ":blue_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Asex", "messageContent") + "**\n" +
                ":white_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Straight", "messageContent") + "**\n" +
                ":black_heart: **" + Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "ReactionRole_Sex_Other", "messageContent") + "**\n"
                );

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
            message.addReaction("❤").queue();
            message.addReaction("🧡").queue();
            message.addReaction("💛").queue();
            message.addReaction("💚").queue();
            message.addReaction("💙").queue();
        });

    }

    /* StarSign */
    public void createStarSignReactionMessage(MessageReceivedEvent event) {

        CustomEmbedBuilder embedBuilder = new CustomEmbedBuilder();
        embedBuilder.setEmbedColor((String) Main.getMySql().getObject(event.getGuild(), "EmbedColor", "EmbedMessage", "SelfRole_StarSign", "EmbedColor"));
        embedBuilder.setTitle("StarSign Roles");
        embedBuilder.setContent((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(event.getGuild()), "messageName", "SingleSelection", "messageContent") + "\n" +
                "\n" +
                "Comming soon!");

        event.getTextChannel().sendMessage(embedBuilder.build()).queue(message -> {
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
