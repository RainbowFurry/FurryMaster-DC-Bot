package database.sql;

import core.Main;

/**
 * @author DarkSide_Wolf
 * File was created in 11:51 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Master {

    public void createMasterDB(){
        Main.getMySql().createDatabase("FurryMaster_Master");
        Main.getMySql().createTable(null, "Language_DE", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
        Main.getMySql().createTable(null, "Language_EN", "messageName varchar(64), messageContent TEXT, PRIMARY KEY(messageName)");
        createDefaults();
    }

    private void createDefaults(){
        createLanguageEnglish();
        createLanguageGerman();
    }

    private void createLanguageGerman(){

        /* MainContent */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "BotCreator", "messageName,messageContent", "'BotCreator' , '-'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "BotInvite", "messageName,messageContent", "'BotInvite' , '-'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Help", "messageName,messageContent", "'Help' , '-'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "NoPermission", "messageName,messageContent", "'NoPermission' , 'Es tut mir leid, doch wie es aussieht, besitzt du nicht die erforderlichen Rechte, um diesen Command ausführen zu können.'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "BotActivity", "messageName,messageContent", "'BotActivity' , '-'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "WarnMessage", "messageName,messageContent", "'WarnMessage' , 'Du hast auf der Guilde ... eine Verwarnung Bekommen...'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "KickMessage", "messageName,messageContent", "'KickMessage' , 'Du wurdest von der Guilde ... geworfen. Grund...'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "BanMessage", "messageName,messageContent", "'BanMessage' , 'Du wurdest von der Guilde ... ausgeschlossen. Grund...'");

        /* Gender */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Heading", "messageName,messageContent", "'ReactionRole_Gender_Heading' , 'Geschlechts Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'ReactionRole_Gender_Male' , 'Mann'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Female", "messageName,messageContent", "'ReactionRole_Gender_Female' , 'Frau'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Divers", "messageName,messageContent", "'ReactionRole_Gender_Divers' , 'Divers'");

        /*Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");*/


        /* Age */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Age_Heading", "messageName,messageContent", "'ReactionRole_Age_Heading' , 'Alters Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Age_13-15", "messageName,messageContent", "'ReactionRole_Age_13-15' , '13-15'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Age_16-17", "messageName,messageContent", "'ReactionRole_Age_16-17' , '16-17'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Age_18+", "messageName,messageContent", "'ReactionRole_Age_18+' , '18+'");

        /*Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");*/

        /* Color */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Heading", "messageName,messageContent", "'ReactionRole_Color_Heading' , 'Farb Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Red", "messageName,messageContent", "'ReactionRole_Color_Red' , 'Rot'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Orange", "messageName,messageContent", "'ReactionRole_Color_Orange' , 'Orange'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Yellow", "messageName,messageContent", "'ReactionRole_Color_Yellow' , 'Gelb'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Green", "messageName,messageContent", "'ReactionRole_Color_Green' , 'Grün'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Blue", "messageName,messageContent", "'ReactionRole_Color_Blue' , 'Blau'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Purple", "messageName,messageContent", "'ReactionRole_Color_Purple' , 'Purple'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Pink", "messageName,messageContent", "'ReactionRole_Color_Pink' , 'Pink'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Cyan", "messageName,messageContent", "'ReactionRole_Color_Cyan' , 'Cyan'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Brown", "messageName,messageContent", "'ReactionRole_Color_Brown' , 'Brown'");

        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Light", "messageName,messageContent", "'ReactionRole_Color_Light' , 'Hell'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Color_Dark", "messageName,messageContent", "'ReactionRole_Color_Dark' , 'Dunkel'");

        /* Country */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Heading", "messageName,messageContent", "'ReactionRole_Country_Heading' , 'Länder Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Germany", "messageName,messageContent", "'ReactionRole_Country_Germany' , 'Deutschland'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_America", "messageName,messageContent", "'ReactionRole_Country_America' , 'America'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_England", "messageName,messageContent", "'ReactionRole_Country_England' , 'England'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Franc", "messageName,messageContent", "'ReactionRole_Country_Franc' , 'Frankreich'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Italy", "messageName,messageContent", "'ReactionRole_Country_Italy' , 'Italien'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Russia", "messageName,messageContent", "'ReactionRole_Country_Russia' , 'Russland'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Country_Swiz", "messageName,messageContent", "'ReactionRole_Country_Swiz' , 'Schweiz'");
        //Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");

        /* GameCategory */
        //

        /* Games */
        //

        /* Movie */
        //

        /* Music */
        //

        /* Pronouns */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Pronouns_Heading", "messageName,messageContent", "'ReactionRole_Pronouns_Heading' , 'Ansprache Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Pronouns_He", "messageName,messageContent", "'ReactionRole_Pronouns_He' , 'Er'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Pronouns_She", "messageName,messageContent", "'ReactionRole_Pronouns_She' , 'Sie'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Pronouns_It", "messageName,messageContent", "'ReactionRole_Pronouns_It' , 'Es?'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Pronouns_Ask", "messageName,messageContent", "'ReactionRole_Pronouns_Ask' , 'Frag mich'");

        /* Sexuality */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Heading", "messageName,messageContent", "'ReactionRole_Sex_Heading' , 'Sexualitäts Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Gay", "messageName,messageContent", "'ReactionRole_Sex_Gay' , 'Schwul'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Bi", "messageName,messageContent", "'ReactionRole_Sex_Bi' , 'Bi'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Lesb", "messageName,messageContent", "'ReactionRole_Sex_Lesb' , 'Lesbisch'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Pansex", "messageName,messageContent", "'ReactionRole_Sex_Pansex' , 'Pansexuell'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Asex", "messageName,messageContent", "'ReactionRole_Sex_Asex' , 'Asexuell'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Asex", "messageName,messageContent", "'ReactionRole_Sex_Straight' , 'Hetero'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sex_Other", "messageName,messageContent", "'ReactionRole_Sex_Other' , 'Anderes'");

        /* StarSign */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Heading", "messageName,messageContent", "'ReactionRole_StarSign_Heading' , 'Sternzeichen Rollen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Capricorn", "messageName,messageContent", "'ReactionRole_StarSign_Capricorn' , 'Steinbock'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Aquarius", "messageName,messageContent", "'ReactionRole_StarSign_Aquarius' , 'Wassermann'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Pisces", "messageName,messageContent", "'ReactionRole_StarSign_Pisces' , 'Fische'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Aries", "messageName,messageContent", "'ReactionRole_StarSign_Aries' , 'Widder'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Taurus", "messageName,messageContent", "'ReactionRole_StarSign_Taurus' , 'Stier'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Gemini", "messageName,messageContent", "'ReactionRole_StarSign_Gemini' , 'Zwillinge'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Cancer", "messageName,messageContent", "'ReactionRole_StarSign_Cancer' , 'Krebs'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Leo", "messageName,messageContent", "'ReactionRole_StarSign_Leo' , 'Löwe'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Virgo", "messageName,messageContent", "'ReactionRole_StarSign_Virgo' , 'Jungfrau'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Libra", "messageName,messageContent", "'ReactionRole_StarSign_Libra' , 'Waage'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Scorpio", "messageName,messageContent", "'ReactionRole_StarSign_Scorpio' , 'Skorpion'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_StarSign_Sagittarius", "messageName,messageContent", "'ReactionRole_StarSign_Sagittarius' , 'Schütze'");

        /* Other */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "SingleSelection", "messageName,messageContent", "'SingleSelection' , 'Du kannst nur eines auswählen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "MultipleSelection", "messageName,messageContent", "'MultipleSelection' , 'Du kannst mehrere auswählen'");

        /* Commands */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "AdminCommands", "messageName,messageContent", "'AdminCommands' , '-'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "UserCommands", "messageName,messageContent", "'UserCommands' , '-'");

        /* Roles */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Heading", "messageName,messageContent", "'Role_Team_Heading' , '____________ \" Team \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Owner", "messageName,messageContent", "'Role_Team_Owner' , 'Inhaber'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Administrator", "messageName,messageContent", "'Role_Team_Administrator' , 'Administrator'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Moderator", "messageName,messageContent", "'Role_Team_Moderator' , 'Moderator'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Supporter", "messageName,messageContent", "'Role_Team_Supporter' , 'Supporter'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Developer", "messageName,messageContent", "'Role_Team_Developer' , 'Entwickler'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Designer", "messageName,messageContent", "'Role_Team_Designer' , 'Designer'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Team_Member", "messageName,messageContent", "'Role_Team_Member' , 'Benutzer'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Age_Heading", "messageName,messageContent", "'Role_Age_Heading' , '____________ \" Alter \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Gender_Heading", "messageName,messageContent", "'Role_Gender_Heading' , '____________ \" Geschlechtr \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Pronouns_Heading", "messageName,messageContent", "'Role_Pronouns_Heading' , '____________ \" Anreden \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Color_Heading", "messageName,messageContent", "'Role_Color_Heading' , '____________ \" Farben \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Country_Heading", "messageName,messageContent", "'Role_Country_Heading' , '____________ \" Länder \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_Sex_Heading", "messageName,messageContent", "'Role_Sex_Heading' , '____________ \" Sexualitäten \" ____________'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "Role_StarSign_Heading", "messageName,messageContent", "'Role_StarSign_Heading' , '____________ \" Sternzeichen \" ____________'");

    }

    private void createLanguageEnglish(){

        /* MainContent */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "BotCreator", "messageName,messageContent", "'BotCreator' , '-'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "BotInvite", "messageName,messageContent", "'BotInvite' , '-'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Help", "messageName,messageContent", "'Help' , '-'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "NoPermission", "messageName,messageContent", "'NoPermission' , 'I'm sorry, but it looks like you don't have the necessary rights to execute this command.'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "BotActivity", "messageName,messageContent", "'BotActivity' , '-'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "WarnMessage", "messageName,messageContent", "'WarnMessage' , 'Du hast auf der Guilde ... eine Verwarnung Bekommen...'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "KickMessage", "messageName,messageContent", "'KickMessage' , 'Du wurdest von der Guilde ... geworfen. Grund...'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "BanMessage", "messageName,messageContent", "'BanMessage' , 'Du wurdest von der Guilde ... ausgeschlossen. Grund...'");

        /* Gender */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Gender_Heading", "messageName,messageContent", "'ReactionRole_Gender_Heading' , 'Gender Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'ReactionRole_Gender_Male' , 'Man'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Gender_Female", "messageName,messageContent", "'ReactionRole_Gender_Female' , 'Woman'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Gender_Divers", "messageName,messageContent", "'ReactionRole_Gender_Divers' , 'Divers'");

        /*Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");*/


        /* Age */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Age_Heading", "messageName,messageContent", "'ReactionRole_Age_Heading' , 'Age Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Age_13-15", "messageName,messageContent", "'ReactionRole_Age_13-15' , '13-15'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Age_16-17", "messageName,messageContent", "'ReactionRole_Age_16-17' , '16-17'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Age_18+", "messageName,messageContent", "'ReactionRole_Age_18+' , '18+'");

        /*Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");*/

        /* Color */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Heading", "messageName,messageContent", "'ReactionRole_Color_Heading' , 'Color Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Red", "messageName,messageContent", "'ReactionRole_Color_Red' , 'Red'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Orange", "messageName,messageContent", "'ReactionRole_Color_Orange' , 'Orange'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Yellow", "messageName,messageContent", "'ReactionRole_Color_Yellow' , 'Yellow'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Green", "messageName,messageContent", "'ReactionRole_Color_Green' , 'Green'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Blue", "messageName,messageContent", "'ReactionRole_Color_Blue' , 'Blue'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Purple", "messageName,messageContent", "'ReactionRole_Color_Purple' , 'Purple'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Pink", "messageName,messageContent", "'ReactionRole_Color_Pink' , 'Pink'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Cyan", "messageName,messageContent", "'ReactionRole_Color_Cyan' , 'Cyan'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Brown", "messageName,messageContent", "'ReactionRole_Color_Brown' , 'Brown'");

        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Light", "messageName,messageContent", "'ReactionRole_Color_Light' , 'Light'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Color_Dark", "messageName,messageContent", "'ReactionRole_Color_Dark' , 'Dark'");

        /* Country */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Heading", "messageName,messageContent", "'ReactionRole_Country_Heading' , 'Country Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Germany", "messageName,messageContent", "'ReactionRole_Country_Germany' , 'Germany'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_America", "messageName,messageContent", "'ReactionRole_Country_America' , 'America'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_England", "messageName,messageContent", "'ReactionRole_Country_England' , 'England'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Franc", "messageName,messageContent", "'ReactionRole_Country_Franc' , 'Franc'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Italy", "messageName,messageContent", "'ReactionRole_Country_Italy' , 'Italy'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Russia", "messageName,messageContent", "'ReactionRole_Country_Russia' , 'Russia'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Country_Swiz", "messageName,messageContent", "'ReactionRole_Country_Swiz' , 'Switzerland'");
        //Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Gender_Male", "messageName,messageContent", "'Mann' , '!'");

        /* GameCategory */
        //

        /* Games */
        //

        /* Movie */
        //

        /* Music */
        //

        /* Pronouns */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Pronouns_Heading", "messageName,messageContent", "'ReactionRole_Pronouns_Heading' , 'Pronounsment Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Pronouns_He", "messageName,messageContent", "'ReactionRole_Pronouns_He' , 'He'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Pronouns_She", "messageName,messageContent", "'ReactionRole_Pronouns_She' , 'She'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Pronouns_It", "messageName,messageContent", "'ReactionRole_Pronouns_It' , 'It?'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Pronouns_Ask", "messageName,messageContent", "'ReactionRole_Pronouns_Ask' , 'Ask me'");

        /* Sexuality */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Heading", "messageName,messageContent", "'ReactionRole_Sex_Heading' , 'Sexuality Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Gay", "messageName,messageContent", "'ReactionRole_Sex_Gay' , 'Gay'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Bi", "messageName,messageContent", "'ReactionRole_Sex_Bi' , 'Bi'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Lesb", "messageName,messageContent", "'ReactionRole_Sex_Lesb' , 'Lesb'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Pansex", "messageName,messageContent", "'ReactionRole_Sex_Pansex' , 'Pansexuell'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Asex", "messageName,messageContent", "'ReactionRole_Sex_Asex' , 'Asexuell'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Asex", "messageName,messageContent", "'ReactionRole_Sex_Straight' , 'Straight'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sex_Other", "messageName,messageContent", "'ReactionRole_Sex_Other' , 'Other'");

        /* StarSign */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Heading", "messageName,messageContent", "'ReactionRole_StarSign_Heading' , 'StarSign Roles'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Capricorn", "messageName,messageContent", "'ReactionRole_StarSign_Capricorn' , 'Capricorn'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Aquarius", "messageName,messageContent", "'ReactionRole_StarSign_Aquarius' , 'Aquarius'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Pisces", "messageName,messageContent", "'ReactionRole_StarSign_Pisces' , 'Pisces'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Aries", "messageName,messageContent", "'ReactionRole_StarSign_Aries' , 'Aries'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Taurus", "messageName,messageContent", "'ReactionRole_StarSign_Taurus' , 'Taurus'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Gemini", "messageName,messageContent", "'ReactionRole_StarSign_Gemini' , 'Gemini'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Cancer", "messageName,messageContent", "'ReactionRole_StarSign_Cancer' , 'Cancer'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Leo", "messageName,messageContent", "'ReactionRole_StarSign_Leo' , 'Leo'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Virgo", "messageName,messageContent", "'ReactionRole_StarSign_Virgo' , 'Virgo'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Libra", "messageName,messageContent", "'ReactionRole_StarSign_Libra' , 'Libra'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Scorpio", "messageName,messageContent", "'ReactionRole_StarSign_Scorpio' , 'Scorpio'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_StarSign_Sagittarius", "messageName,messageContent", "'ReactionRole_StarSign_Sagittarius' , 'Sagittarius'");

        /* Other */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "SingleSelection", "messageName,messageContent", "'SingleSelection' , 'You only can select one'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "MultipleSelection", "messageName,messageContent", "'MultipleSelection' , 'You can select multiple'");

        /* Commands */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "AdminCommands", "messageName,messageContent", "'AdminCommands' , '-'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "UserCommands", "messageName,messageContent", "'UserCommands' , '-'");

        /* Roles */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Heading", "messageName,messageContent", "'Role_Team_Heading' , '____________ \" Team \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Owner", "messageName,messageContent", "'Role_Team_Owner' , 'Owner'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Administrator", "messageName,messageContent", "'Role_Team_Administrator' , 'Administrator'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Moderator", "messageName,messageContent", "'Role_Team_Moderator' , 'Moderator'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Supporter", "messageName,messageContent", "'Role_Team_Supporter' , 'Supporter'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Developer", "messageName,messageContent", "'Role_Team_Developer' , 'Developer'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Designer", "messageName,messageContent", "'Role_Team_Designer' , 'Designer'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Team_Member", "messageName,messageContent", "'Role_Team_Member' , 'User'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Age_Heading", "messageName,messageContent", "'Role_Age_Heading' , '____________ \" Age \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Gender_Heading", "messageName,messageContent", "'Role_Gender_Heading' , '____________ \" Gender \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Pronouns_Heading", "messageName,messageContent", "'Role_Pronouns_Heading' , '____________ \" Pronoun's \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Color_Heading", "messageName,messageContent", "'Role_Color_Heading' , '____________ \" Color's \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Country_Heading", "messageName,messageContent", "'Role_Country_Heading' , '____________ \" Country's \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_Sex_Heading", "messageName,messageContent", "'Role_Sex_Heading' , '____________ \" Sex \" ____________'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "Role_StarSign_Heading", "messageName,messageContent", "'Role_StarSign_Heading' , '____________ \" StarSign \" ____________'");
    }

}
