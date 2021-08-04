package templates;

import net.dv8tion.jda.api.entities.Guild;

/**
 * @author DarkSide_Wolf
 * File was created in 21:43 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Channel {

    public void createDefaultChannels(Guild guild){

        /* Info */
        guild.createCategory("Info").queue();
        guild.createTextChannel("welcome").queue();
        guild.createTextChannel("news").queue();
        guild.createTextChannel("rules").queue();

        /* Talk */
        guild.createCategory("Talk").queue();
        guild.createTextChannel("Austausch").queue();
        guild.createVoiceChannel("Talk - 1").queue();
        guild.createVoiceChannel("Talk - 2").queue();
        guild.createVoiceChannel("Talk - 3").queue();

        /* Support */
        guild.createCategory("Support").queue();
        guild.createTextChannel("support").queue();
        guild.createTextChannel("Support - 1").queue();
        guild.createTextChannel("Support - 2").queue();
        guild.createTextChannel("Support - 3").queue();

    }

    public void createLogChannels(Guild guild){
        guild.createCategory("Log's").queue();
        guild.createTextChannel("log").queue();
    }

    public void createStatisticsChannels(Guild guild){
        guild.createCategory("Statistic's").queue();
        guild.createTextChannel("Members Stats").queue();
    }

    public void createNSFWChannels(){
        /*
        * nsfw
neko
furry
anime
hantai
solo-male
solo-female
guy-on-guy
girl-on-girl

        * */
    }

}
