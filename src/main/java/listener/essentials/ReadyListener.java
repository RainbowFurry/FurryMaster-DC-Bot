package listener.essentials;

import core.Main;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author DarkSide_Wolf
 * File was created in 18:47 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event){

        //Display on which Discord Servers the Bot is running
        StringBuilder onGuilds = new StringBuilder();
        for(Guild guild : event.getJDA().getGuilds())
            onGuilds.append("Name: ").append(guild.getName()).append(", ID: ").append(guild.getId()).append("\n");
        Main.getLogger().info("This bot is on following servers:\n" + onGuilds);

       // event.getJDA().getGuilds().forEach(Main::manageMySQL);

    }

}
