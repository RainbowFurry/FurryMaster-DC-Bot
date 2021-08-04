package listener.module;

import core.Main;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

/**
 * @author DarkSide_Wolf
 * File was created in 18:23 04.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class JoinRoleListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        String roles = (String) Main.getMySql().getObject(event.getGuild(), "Roles", "RoleUse", "JoinRoles", "Roles");

        if (((String) Main.getMySql().getObject(event.getGuild(), "ServerOptions", "OptionName", "Module_JoinRank", "OptionState")).equalsIgnoreCase("true")) {
            if (roles != null) {
                if (!roles.contains("-") && !roles.equals("")) {

                    for (String role : roles.split(",")) {
                        if (!event.getGuild().getRolesByName(role, false).isEmpty()) {
                            event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRolesByName(role, false).get(0)).queue();
                        }
                    }

                }
            }
        }

    }

}
