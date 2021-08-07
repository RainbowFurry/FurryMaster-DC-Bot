package listener.stats;

import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 13:21 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class RolesStatsListener extends ListenerAdapter {

    //if module
    //if channel

    @Override
    public void onGuildMemberRoleAdd(@Nonnull GuildMemberRoleAddEvent event) {

        int old = Init.Roles.get(event.getGuild());
        Init.Roles.remove(event.getGuild());
        Init.Roles.put(event.getGuild(), old + 1);
        //Display Message

    }

    @Override
    public void onGuildMemberRoleRemove(@Nonnull GuildMemberRoleRemoveEvent event) {

        int old = Init.Roles.get(event.getGuild());
        Init.Roles.remove(event.getGuild());
        Init.Roles.put(event.getGuild(), old - 1);
        //Display Message

    }

}
