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

        /* Animal */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Wolf", "messageName,messageContent", "'ReactionRole_Animal_Wolf' , 'Wolf'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Dog", "messageName,messageContent", "'ReactionRole_Animal_Dog' , 'Hund'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Cat", "messageName,messageContent", "'ReactionRole_Animal_Cat' , 'Katze'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Rabbit", "messageName,messageContent", "'ReactionRole_Animal_Rabbit' , 'Hase'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Fox", "messageName,messageContent", "'ReactionRole_Animal_Fox' , 'Fuchs'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Bear", "messageName,messageContent", "'ReactionRole_Animal_Bear' , 'Bär'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Tiger", "messageName,messageContent", "'ReactionRole_Animal_Tiger' , 'Tiger'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Lion", "messageName,messageContent", "'ReactionRole_Animal_Lion' , 'Löwe'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Kangaroo", "messageName,messageContent", "'ReactionRole_Animal_Kangaroo' , 'Känguru'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Giraffe", "messageName,messageContent", "'ReactionRole_Animal_Giraffe' , 'Giraffe'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Monkey", "messageName,messageContent", "'ReactionRole_Animal_Monkey' , 'Affe'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Koala", "messageName,messageContent", "'ReactionRole_Animal_Koala' , 'Koala Bär'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Animal_Horse", "messageName,messageContent", "'ReactionRole_Animal_Horse' , 'Pferd'");

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

        /* GameCategory */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Action", "messageName,messageContent", "'ReactionRole_GameCategory_Action' , 'Action'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Action-Adventure", "messageName,messageContent", "'ReactionRole_GameCategory_Action-Adventure' , 'Action und Abenteuer'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Adventure", "messageName,messageContent", "'ReactionRole_GameCategory_Adventure' , 'Abenteuer'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_RolePlay", "messageName,messageContent", "'ReactionRole_GameCategory_RolePlay' , 'Rollen Spiel'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Simulation", "messageName,messageContent", "'ReactionRole_GameCategory_Simulation' , 'Simulation'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Strategy", "messageName,messageContent", "'ReactionRole_GameCategory_Strategy' , 'Strategie'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Sport", "messageName,messageContent", "'ReactionRole_GameCategory_Sport' , 'Sport'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Puzzle", "messageName,messageContent", "'ReactionRole_GameCategory_Puzzle' , 'Rätsel'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_GameCategory_Idle", "messageName,messageContent", "'ReactionRole_GameCategory_Idle' , 'Untätig'");

        /* Games */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Game_Minecraft", "messageName,messageContent", "'ReactionRole_Game_Minecraft' , 'Minecraft'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Game_Battlefield", "messageName,messageContent", "'ReactionRole_Game_Battlefield' , 'Battlefield'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Game_CallOfDuty", "messageName,messageContent", "'ReactionRole_Game_CallOfDuty' , 'Call of Duty'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Game_CounterStrike", "messageName,messageContent", "'ReactionRole_Game_CounterStrike' , 'Counter Strike'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Game_DeadByDaylight", "messageName,messageContent", "'ReactionRole_Game_DeadByDaylight' , 'Dead by Daylight'");

        /* Movie */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Action", "messageName,messageContent", "'ReactionRole_Movie_Action' , 'Aktion'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Comedy", "messageName,messageContent", "'ReactionRole_Movie_Comedy' , 'Kommödie'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Drama", "messageName,messageContent", "'ReactionRole_Movie_Drama' , 'Drama'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Horror", "messageName,messageContent", "'ReactionRole_Movie_Horror' , 'Horror'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Fantasy", "messageName,messageContent", "'ReactionRole_Movie_Fantasy' , 'Fantasie'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Mystery", "messageName,messageContent", "'ReactionRole_Movie_Mystery' , 'Mysterie'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Romance", "messageName,messageContent", "'ReactionRole_Movie_Romance' , 'Romantik'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Thriller", "messageName,messageContent", "'ReactionRole_Movie_Thriller' , 'Thriller'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Western", "messageName,messageContent", "'ReactionRole_Movie_Western' , 'Western'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Movie_Series", "messageName,messageContent", "'ReactionRole_Movie_Series' , 'Serien'");

        /* Music */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Country", "messageName,messageContent", "'ReactionRole_Music_Country' , 'Country'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Electronic", "messageName,messageContent", "'ReactionRole_Music_Electronic' , 'Elektro'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Funk", "messageName,messageContent", "'ReactionRole_Music_Funk' , 'Funk'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_HipHop", "messageName,messageContent", "'ReactionRole_Music_HipHop' , 'Hip Hop'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Jazz", "messageName,messageContent", "'ReactionRole_Music_Jazz' , 'Jazz'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Pop", "messageName,messageContent", "'ReactionRole_Music_Pop' , 'Pop'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Punk", "messageName,messageContent", "'ReactionRole_Music_Punk' , 'Punk'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Rock", "messageName,messageContent", "'ReactionRole_Music_Rock' , 'Rock'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Reggae", "messageName,messageContent", "'ReactionRole_Music_Reggae' , 'Reggae'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Metal", "messageName,messageContent", "'ReactionRole_Music_Metal' , 'Metal'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Music_Tradition", "messageName,messageContent", "'ReactionRole_Music_Tradition' , 'Volks Musik'");

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

        /* Job */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_IT", "messageName,messageContent", "'ReactionRole_Jobs_IT' , 'IT'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Army", "messageName,messageContent", "'ReactionRole_Jobs_Army' , 'Bundeswehr'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Medic", "messageName,messageContent", "'ReactionRole_Jobs_Medic' , 'Mediziener'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Educator", "messageName,messageContent", "'ReactionRole_Jobs_Educator' , 'Erzieher'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Caregiver", "messageName,messageContent", "'ReactionRole_Jobs_Caregiver' , 'Pfleger'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Social", "messageName,messageContent", "'ReactionRole_Jobs_Social' , 'Sozial'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Banker", "messageName,messageContent", "'ReactionRole_Jobs_Banker' , 'Bänker'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Ingenuer", "messageName,messageContent", "'ReactionRole_Jobs_Ingenuer' , 'Ingenuer'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Mechanic", "messageName,messageContent", "'ReactionRole_Jobs_Mechanic' , 'Mechaniker'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Jobs_Seller", "messageName,messageContent", "'ReactionRole_Jobs_Seller' , 'Verkäufer'");

        /* Hobby */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Hobby_Draw", "messageName,messageContent", "'ReactionRole_Hobby_Draw' , 'malen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Hobby_MeetUp", "messageName,messageContent", "'ReactionRole_Hobby_MeetUp' , 'Freunde treffen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Hobby_Gaming", "messageName,messageContent", "'ReactionRole_Hobby_Gaming' , 'zocken'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Hobby_WatchTV", "messageName,messageContent", "'ReactionRole_Hobby_WatchTV' , 'fern sehen'");

        /* Sport */
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Swim", "messageName,messageContent", "'ReactionRole_Sport_Swim' , 'Schwimmen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Dance", "messageName,messageContent", "'ReactionRole_Sport_Dance' , 'Tanzen'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Climb", "messageName,messageContent", "'ReactionRole_Sport_Climb' , 'Klettern'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Football", "messageName,messageContent", "'ReactionRole_Sport_Football' , 'Fußball'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Baseball", "messageName,messageContent", "'ReactionRole_Sport_Baseball' , 'Baseball'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Basketball", "messageName,messageContent", "'ReactionRole_Sport_Basketball' , 'Basketball'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Hockey", "messageName,messageContent", "'ReactionRole_Sport_Hockey' , 'Hockey'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Gun", "messageName,messageContent", "'ReactionRole_Sport_Gun' , 'Schützen Sport'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Fight", "messageName,messageContent", "'ReactionRole_Sport_Fight' , 'Kampf Sport'");

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

        /* Animal */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Wolf", "messageName,messageContent", "'ReactionRole_Animal_Wolf' , 'Wolf'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Dog", "messageName,messageContent", "'ReactionRole_Animal_Dog' , 'Dog'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Cat", "messageName,messageContent", "'ReactionRole_Animal_Cat' , 'Cat'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Rabbit", "messageName,messageContent", "'ReactionRole_Animal_Rabbit' , 'Rabbit'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Fox", "messageName,messageContent", "'ReactionRole_Animal_Fox' , 'Fox'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Bear", "messageName,messageContent", "'ReactionRole_Animal_Bear' , 'Bear'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Tiger", "messageName,messageContent", "'ReactionRole_Animal_Tiger' , 'Tiger'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Lion", "messageName,messageContent", "'ReactionRole_Animal_Lion' , 'Lion'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Kangaroo", "messageName,messageContent", "'ReactionRole_Animal_Kangaroo' , 'Kangaroo'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Giraffe", "messageName,messageContent", "'ReactionRole_Animal_Giraffe' , 'Giraffe'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Monkey", "messageName,messageContent", "'ReactionRole_Animal_Monkey' , 'Monkey'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Koala", "messageName,messageContent", "'ReactionRole_Animal_Koala' , 'Koala Bear'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Animal_Horse", "messageName,messageContent", "'ReactionRole_Animal_Horse' , 'Horse'");

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

        /* GameCategory */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Action", "messageName,messageContent", "'ReactionRole_GameCategory_Action' , 'Action'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Action-Adventure", "messageName,messageContent", "'ReactionRole_GameCategory_Action-Adventure' , 'Action and Adventure'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Adventure", "messageName,messageContent", "'ReactionRole_GameCategory_Adventure' , 'Adventure'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_RolePlay", "messageName,messageContent", "'ReactionRole_GameCategory_RolePlay' , 'Role Play'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Simulation", "messageName,messageContent", "'ReactionRole_GameCategory_Simulation' , 'Simulation'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Strategy", "messageName,messageContent", "'ReactionRole_GameCategory_Strategy' , 'Strategy'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Sport", "messageName,messageContent", "'ReactionRole_GameCategory_Sport' , 'Sport'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Puzzle", "messageName,messageContent", "'ReactionRole_GameCategory_Puzzle' , 'Puzzle'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_GameCategory_Idle", "messageName,messageContent", "'ReactionRole_GameCategory_Idle' , 'Idle'");

        /* Games */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Game_Minecraft", "messageName,messageContent", "'ReactionRole_Game_Minecraft' , 'Minecraft'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Game_Battlefield", "messageName,messageContent", "'ReactionRole_Game_Battlefield' , 'Battlefield'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Game_CallOfDuty", "messageName,messageContent", "'ReactionRole_Game_CallOfDuty' , 'Call of Duty'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Game_CounterStrike", "messageName,messageContent", "'ReactionRole_Game_CounterStrike' , 'Counter Strike'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Game_DeadByDaylight", "messageName,messageContent", "'ReactionRole_Game_DeadByDaylight' , 'Dead by Daylight'");

        /* Movie */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Action", "messageName,messageContent", "'ReactionRole_Movie_Action' , 'Action'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Comedy", "messageName,messageContent", "'ReactionRole_Movie_Comedy' , 'Comedy'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Drama", "messageName,messageContent", "'ReactionRole_Movie_Drama' , 'Drama'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Horror", "messageName,messageContent", "'ReactionRole_Movie_Horror' , 'Horror'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Fantasy", "messageName,messageContent", "'ReactionRole_Movie_Fantasy' , 'Fantasy'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Mystery", "messageName,messageContent", "'ReactionRole_Movie_Mystery' , 'Mystery'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Romance", "messageName,messageContent", "'ReactionRole_Movie_Romance' , 'Romance'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Thriller", "messageName,messageContent", "'ReactionRole_Movie_Thriller' , 'Thriller'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Western", "messageName,messageContent", "'ReactionRole_Movie_Western' , 'Western'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Movie_Series", "messageName,messageContent", "'ReactionRole_Movie_Series' , 'Series'");

        /* Music */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Country", "messageName,messageContent", "'ReactionRole_Music_Country' , 'Country'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Electronic", "messageName,messageContent", "'ReactionRole_Music_Electronic' , 'Elektro'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Funk", "messageName,messageContent", "'ReactionRole_Music_Funk' , 'Funk'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_HipHop", "messageName,messageContent", "'ReactionRole_Music_HipHop' , 'Hip Hop'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Jazz", "messageName,messageContent", "'ReactionRole_Music_Jazz' , 'Jazz'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Pop", "messageName,messageContent", "'ReactionRole_Music_Pop' , 'Pop'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Punk", "messageName,messageContent", "'ReactionRole_Music_Punk' , 'Punk'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Rock", "messageName,messageContent", "'ReactionRole_Music_Rock' , 'Rock'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Reggae", "messageName,messageContent", "'ReactionRole_Music_Reggae' , 'Reggae'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Metal", "messageName,messageContent", "'ReactionRole_Music_Metal' , 'Metal'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Music_Tradition", "messageName,messageContent", "'ReactionRole_Music_Tradition' , 'Tradition'");

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

        /* Job */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_IT", "messageName,messageContent", "'ReactionRole_Jobs_IT' , 'IT'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Army", "messageName,messageContent", "'ReactionRole_Jobs_Army' , 'Army'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Medic", "messageName,messageContent", "'ReactionRole_Jobs_Medic' , 'Medical'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Educator", "messageName,messageContent", "'ReactionRole_Jobs_Educator' , 'Educator'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Caregiver", "messageName,messageContent", "'ReactionRole_Jobs_Caregiver' , 'Caregiver'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Social", "messageName,messageContent", "'ReactionRole_Jobs_Social' , 'Social'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Banker", "messageName,messageContent", "'ReactionRole_Jobs_Banker' , 'Banker'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Ingenuer", "messageName,messageContent", "'ReactionRole_Jobs_Ingenuer' , 'Ingenuer'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Mechanic", "messageName,messageContent", "'ReactionRole_Jobs_Mechanic' , 'Mechanic'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Jobs_Seller", "messageName,messageContent", "'ReactionRole_Jobs_Seller' , 'Seller'");

        /* Hobby */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Hobby_Draw", "messageName,messageContent", "'ReactionRole_Hobby_Draw' , 'draw'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Hobby_MeetUp", "messageName,messageContent", "'ReactionRole_Hobby_MeetUp' , 'meetup friends'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Hobby_Gaming", "messageName,messageContent", "'ReactionRole_Hobby_Gaming' , 'gaming'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Hobby_WatchTV", "messageName,messageContent", "'ReactionRole_Hobby_WatchTV' , 'watch TV'");

        /* Sport */
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Swim", "messageName,messageContent", "'ReactionRole_Sport_Swim' , 'Swim'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Dance", "messageName,messageContent", "'ReactionRole_Sport_Dance' , 'Dance'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Climb", "messageName,messageContent", "'ReactionRole_Sport_Climb' , 'Climb'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Football", "messageName,messageContent", "'ReactionRole_Sport_Football' , 'Football'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Baseball", "messageName,messageContent", "'ReactionRole_Sport_Baseball' , 'Baseball'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Basketball", "messageName,messageContent", "'ReactionRole_Sport_Basketball' , 'Basketball'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Hockey", "messageName,messageContent", "'ReactionRole_Sport_Hockey' , 'Hockey'");
        Main.getMySql().insertInto(null , "Language_EN", "messageName", "ReactionRole_Sport_Gun", "messageName,messageContent", "'ReactionRole_Sport_Gun' , 'Gun Sport'");
        Main.getMySql().insertInto(null , "Language_DE", "messageName", "ReactionRole_Sport_Fight", "messageName,messageContent", "'ReactionRole_Sport_Fight' , 'Fight Sport'");

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
