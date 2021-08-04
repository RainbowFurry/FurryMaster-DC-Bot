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
        //
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

    public void createGamesRoles(Guild guild){

    }

    public void createGameCategoryRoles(Guild guild){

    }

    public void createMovieRoles(Guild guild){

    }

    public void createMusicRoles(Guild guild){

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

    }

    public void createHobbyRoles(Guild guild){

    }

    public void createSportRoles(Guild guild){

    }

    public void createVerificationRole(Guild guild){

    }

}
