package listener.stats;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.user.update.UserUpdateOnlineStatusEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DarkSide_Wolf
 * File was created in 16:17 07.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Init extends ListenerAdapter {

    public static Map<Guild, Integer> OnlineMembers = new HashMap<>();
    public static Map<Guild, Integer> Members = new HashMap<>();
    public static Map<Guild, Integer> Bots = new HashMap<>();
    public static Map<Guild, Integer> TotalMembers = new HashMap<>();
    public static Map<Guild, Integer> TextChannels = new HashMap<>();
    public static Map<Guild, Integer> VoiceChannels = new HashMap<>();
    public static Map<Guild, Integer> TotalChannels = new HashMap<>();
    public static Map<Guild, Integer> Category = new HashMap<>();
    public static Map<Guild, Integer> Roles = new HashMap<>();

    @Override
    public void onReady(ReadyEvent event){

        for (Guild guild : event.getJDA().getGuilds()){
            loadStats(guild);
        }

    }

    private void loadStats(Guild guild){
        getOnlineMembers(guild);
        getChannels(guild);
        getRoles(guild);
    }

    private void getOnlineMembers(Guild guild){

        if(check()) {

            int online = 0;
            int user = 0;
            int bot = 0;
            int total;

            for (Member member : guild.getMembers()) {
                //IF User Online
                if (!member.getOnlineStatus().equals(OnlineStatus.OFFLINE)) {
                    online++;
                }

                //Get Users
                if (!member.getUser().isBot())
                    user++;
                else
                    bot++;
            }
            total = user + bot;

            OnlineMembers.put(guild, online);
            //guild.getTextChannelsByName("test", false).get(0).sendMessage("Es sind " + OnlineMembers.get(guild) + " User online.").queue();

            Members.put(guild, user);
            //guild.getTextChannelsByName("test", false).get(0).sendMessage("Es sind " + Members.get(guild) + " User auf dem Server.").queue();

            Bots.put(guild, bot);
            //guild.getTextChannelsByName("test", false).get(0).sendMessage("Es sind " + Bots.get(guild) + " Bots auf dem Server.").queue();

            TotalMembers.put(guild, total);
            //guild.getTextChannelsByName("test", false).get(0).sendMessage("Es sind insgesamt " + TotalMembers.get(guild) + " User auf dem Server.").queue();

        }

    }

    private void getChannels(Guild guild){

        int channels = 0;
        int voice = 0;
        int text = 0;
        int category = 0;

        for (GuildChannel channel : guild.getChannels()){

            if(channel.getType().equals(ChannelType.VOICE)){
                voice++;
            }else if(channel.getType().equals(ChannelType.TEXT)){
                text++;
            }else if(channel.getType().equals(ChannelType.CATEGORY)){
                category++;
            }
            channels++;
        }

        TotalChannels.put(guild, channels);
        VoiceChannels.put(guild, voice);
        TextChannels.put(guild, text);
        Category.put(guild, category);

    }

    private void getRoles(Guild guild){
        if(check()) {

            int roles = 0;

            for (Role role : guild.getRoles()) {
                roles++;
            }

            Roles.put(guild, roles);

        }
    }


    private boolean check(){
        //If Module
        //IF Channel

        return true;

    }

}
