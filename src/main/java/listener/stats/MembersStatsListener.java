package listener.stats;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.events.user.update.UserUpdateOnlineStatusEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 13:17 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class MembersStatsListener extends ListenerAdapter {

    @Override
    public void onUserUpdateOnlineStatus(@Nonnull UserUpdateOnlineStatusEvent event) {

        //If Module
        //IF Channel

        if (event.getNewOnlineStatus().equals(OnlineStatus.ONLINE)) {
            int old = Init.OnlineMembers.get(event.getGuild());
            Init.OnlineMembers.remove(event.getGuild());
            Init.OnlineMembers.put(event.getGuild(), old + 1);
            //Display Message
        } else if (event.getNewOnlineStatus().equals(OnlineStatus.OFFLINE)) {
            int old = Init.OnlineMembers.get(event.getGuild());
            Init.OnlineMembers.remove(event.getGuild());
            Init.OnlineMembers.put(event.getGuild(), old - 1);
            //Display Message
        }

    }

    @Override
    public void onGuildMemberJoin(@Nonnull GuildMemberJoinEvent event) {

        if(event.getMember().getUser().isBot()){
            int old = Init.Bots.get(event.getGuild());
            Init.Bots.remove(event.getGuild());
            Init.Bots.put(event.getGuild(), old + 1);
            //Display Message
        }else if(!event.getMember().getUser().isBot()){
            int old = Init.Members.get(event.getGuild());
            Init.Members.remove(event.getGuild());
            Init.Members.put(event.getGuild(), old + 1);
            //Display Message
        }

        int old = Init.TotalMembers.get(event.getGuild());
        Init.TotalMembers.remove(event.getGuild());
        Init.TotalMembers.put(event.getGuild(), old + 1);
        //Display Message

    }

    @Override
    public void onGuildMemberLeave(@Nonnull GuildMemberLeaveEvent event) {

        if(event.getMember().getUser().isBot()){
            int old = Init.Bots.get(event.getGuild());
            Init.Bots.remove(event.getGuild());
            Init.Bots.put(event.getGuild(), old - 1);
            //Display Message
        }else if(!event.getMember().getUser().isBot()){
            int old = Init.Members.get(event.getGuild());
            Init.Members.remove(event.getGuild());
            Init.Members.put(event.getGuild(), old - 1);
            //Display Message
        }

        int old = Init.TotalMembers.get(event.getGuild());
        Init.TotalMembers.remove(event.getGuild());
        Init.TotalMembers.put(event.getGuild(), old - 1);
        //Display Message

    }

}
