package manager;

import core.Main;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;

import java.util.HashMap;

/**
 * @author DarkSide_Wolf
 * File was created in 23:29 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Checker {

    private static HashMap<User, String> userLanguage = new HashMap<>();
    private static HashMap<Guild, String> serverLanguage = new HashMap<>();

    /** Check if the User is the Bot Creator **/
    public static boolean isBotCreator(User user){
        if(user.getId().equals("246277810274959360"))
            return true;
        else
            return false;
    }

    /** Get the Language of the User **/
    public static String checkUserLanguage(User user){
        if(userLanguage.containsKey(user)){
            return userLanguage.get(user);
        }else{
            //Check if UserDB exists
            //Get Value From DB
            userLanguage.put(user, "Language_" + "DE");
            return userLanguage.get(user);
        }
    }

    /** Get the Language of the Server **/
    public static String checkServerLanguage(Guild guild){
        String Language = (String) Main.getMySql().getObject(guild , "ServerOptions", "OptionName", "ServerLanguage", "OptionState");
        if(serverLanguage.containsKey(guild)){
            if(!serverLanguage.get(guild).equals(Language)){
                serverLanguage.remove(guild);
                serverLanguage.put(guild, "Language_" + Language);
            }
            return serverLanguage.get(guild);
        }else{
            serverLanguage.put(guild, "Language_" + Language);
            return serverLanguage.get(guild);
        }
    }

    /** Check if Module Enabled and Channel exists **/
    public boolean checkModuleAndChannel(Guild guild, String module, String channel) {
        //Module Check
        if (true) {
            //Channel Check
            if (guild.getTextChannelsByName(channel, false).get(0) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /** Check if the Module is enabled **/
    public boolean checkModule(Guild guild, String module){
        if(true)
            return true;
        return false;
    }

    /** Check if Channel exists **/
    public boolean checkChannel(Guild guild, String channel){
        if (guild.getTextChannelsByName(channel, false).get(0) != null)
            return true;
        return false;
    }

    /** Check if the User is Verified **/
    public boolean checkUserIsVerified(){
        return false;
    }

    /** Check if the User has the Role **/
    public boolean chceckIfUserHasRole(Guild guild, Member member, String roleName){
        if(guild.getRolesByName(roleName, false).get(0) != null){
            for (Role role : member.getRoles()){
                if(role.getName().equals(roleName))
                    return true;
            }
            return false;
        }
        return false;
    }

}
