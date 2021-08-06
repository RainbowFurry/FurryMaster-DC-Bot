package templates;

import core.Main;
import manager.Checker;
import net.dv8tion.jda.api.entities.Guild;

/**
 * @author DarkSide_Wolf
 * File was created in 21:43 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Roles {

    public void createDefaultRoles(Guild guild){

        //PERMISSION AND COLOR OPTION MISSING

        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Owner", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Owner", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Administrator", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Moderator", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Supporter", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Developer", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Designer", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Team_Member", "messageContent")).queue();
        }

    }

    public void createPermissionRoles(Guild guild){
        //jede permission als eigene rolle?
    }

    public void createGenderRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Gender_Male", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Gender_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Gender_Male", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Gender_Female", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Gender_Other", "messageContent")).queue();
        }
    }

    public void createAgeRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Age_13-15", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Age_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Age_13-15", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Age_16-17", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Age_18+", "messageContent")).queue();
        }
    }

    public void createAnimalRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Animal_Wolf", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Animal_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Wolf", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Dog", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Cat", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Rabbit", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Fox", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Bear", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Tiger", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Lion", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Kangaroo", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Giraffe", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Monkey", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Koala", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Animal_Horse", "messageContent")).queue();
        }
    }

    public void createColorRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Red", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "Role_Color_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Red", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Orange", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Yellow", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Green", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Blue", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Purple", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Pink", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Light", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Color_Dark", "messageContent")).queue();
        }
    }

    public void createCountryRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Country_Germany", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "Role_Country_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Country_Germany", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Country_America", "messageContent")).queue();
        }
    }

    public void createGameRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Game_Minecraft", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Game_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Game_Minecraft", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Game_Battlefield", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Game_CallOfDuty", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Game_CounterStrike", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Game_DeadByDaylight", "messageContent")).queue();
        }
    }

    public void createGameCategoryRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Action", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_GameCategory_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Action", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Action-Adventure", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Adventure", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_RolePlay", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Simulation", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Strategy", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Sport", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Puzzle", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_GameCategory_Idle", "messageContent")).queue();
        }
    }

    public void createMovieRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Action", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Action", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Comedy", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Drama", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Horror", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Fantasy", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Mystery", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Romance", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Thriller", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Western", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Movie_Series", "messageContent")).queue();
        }
    }

    public void createMusicRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Country", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Country", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Electronic", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Funk", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_HipHop", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Jazz", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Pop", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Punk", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Rock", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Reggae", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Metal", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Music_Tradition", "messageContent")).queue();
        }
    }

    public void createPronounsRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Pronouns_He", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "Role_Pronouns_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Pronouns_He", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Pronouns_She", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Pronouns_It", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Pronouns_Ask", "messageContent")).queue();
        }
    }

    public void createSexualityRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Gay", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "Role_Sex_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Gay", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Bi", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Lesb", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Pansex", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Asex", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Straight", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sex_Other", "messageContent")).queue();
        }
    }

    public void createStarSignRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Capricorn", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "Role_StarSign_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Capricorn", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Aquarius", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Pisces", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Aries", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Taurus", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Gemini", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Cancer", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Leo", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Virgo", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Libra", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Scorpio", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null, Checker.checkServerLanguage(guild), "messageName", "ReactionRole_StarSign_Sagittarius", "messageContent")).queue();
        }
    }

    public void createJobRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_IT", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Job_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_IT", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Army", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Medic", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Educator", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Caregiver", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Social", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Banker", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Ingenuer", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Mechanic", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Jobs_Seller", "messageContent")).queue();
        }
    }

    public void createHobbyRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_Draw", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_Draw", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_MeetUp", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_Gaming", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Hobby_WatchTV", "messageContent")).queue();
        }
    }

    public void createSportRoles(Guild guild){
        if(guild.getRolesByName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Swim", "messageContent"), false).isEmpty()) {
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Heading", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Swim", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Dance", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Climb", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Football", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Baseball", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Basketball", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Hockey", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Gun", "messageContent")).queue();
            guild.createRole().setName((String) Main.getMySql().getObject(null , Checker.checkServerLanguage(guild), "messageName", "ReactionRole_Sport_Fight", "messageContent")).queue();
        }
    }

    public void createVerificationRole(Guild guild){

    }

}
