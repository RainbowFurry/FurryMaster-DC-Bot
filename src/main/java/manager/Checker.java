package manager;

import core.Main;
import net.dv8tion.jda.api.entities.Guild;
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

    public static boolean isBotCreator(User user){
        if(user.getId().equals("246277810274959360"))
            return true;
        else
            return false;
    }

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

    private boolean checkModuleAndChannel(Guild guild, String module, String channel) {
        //Module Check
        if (module.equals("true")) {
            //Channel Check
            if (guild.getTextChannelsByName(channel, false).get(0) != null) {
                return true;
            }
        }
        return false;
    }

    /*
    check channel/module - singel
    * check verified
    * check channel
    * check role
    * check ...
    * */

}
