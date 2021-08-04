package listener.essentials;

import builder.PrivateMessageBuilder;
import core.Main;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author DarkSide_Wolf
 * File was created in 02:05 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class BotGuildJoinListener extends ListenerAdapter {

    private Guild guild;

    @Override
    public void onGuildJoin(GuildJoinEvent event) {

        guild = event.getGuild();

        //Create SQL Entry for Guild
        Main.manageMySQL(guild);

        event.getGuild().getDefaultChannel().sendMessage("").queue();

        PrivateMessageBuilder privateMessageBuilder = new PrivateMessageBuilder();
        //privateMessageBuilder.sentPrivateMessage(guild.getOwner(), "");

        /*
        * Danke nachricht, für das verwenden des bots wenn möglich...
        * */

    }

}
