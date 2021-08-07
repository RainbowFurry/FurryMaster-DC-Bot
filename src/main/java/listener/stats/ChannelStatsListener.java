package listener.stats;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.events.channel.category.CategoryDeleteEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.voice.VoiceChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.voice.VoiceChannelDeleteEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

/**
 * @author DarkSide_Wolf
 * File was created in 17:55 07.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ChannelStatsListener extends ListenerAdapter {

    //if module
    //if channel

    @Override
    public void onTextChannelCreate(@Nonnull TextChannelCreateEvent event) {

        int old = Init.TextChannels.get(event.getGuild());
        Init.TextChannels.remove(event.getGuild());
        Init.TextChannels.put(event.getGuild(), old + 1);

        onTotalCreate(event.getGuild());

    }

    @Override
    public void onTextChannelDelete(@Nonnull TextChannelDeleteEvent event) {

        int old = Init.TextChannels.get(event.getGuild());
        Init.TextChannels.remove(event.getGuild());
        Init.TextChannels.put(event.getGuild(), old - 1);

        onTotalDelete(event.getGuild());

    }

    @Override
    public void onVoiceChannelCreate(@Nonnull VoiceChannelCreateEvent event) {

        int old = Init.VoiceChannels.get(event.getGuild());
        Init.VoiceChannels.remove(event.getGuild());
        Init.VoiceChannels.put(event.getGuild(), old + 1);

        onTotalCreate(event.getGuild());

    }

    @Override
    public void onVoiceChannelDelete(@Nonnull VoiceChannelDeleteEvent event) {

        int old = Init.VoiceChannels.get(event.getGuild());
        Init.VoiceChannels.remove(event.getGuild());
        Init.VoiceChannels.put(event.getGuild(), old - 1);

        onTotalDelete(event.getGuild());

    }

    @Override
    public void onCategoryCreate(@Nonnull CategoryCreateEvent event) {

        int old = Init.Category.get(event.getGuild());
        Init.Category.remove(event.getGuild());
        Init.Category.put(event.getGuild(), old + 1);

        onTotalCreate(event.getGuild());

    }

    @Override
    public void onCategoryDelete(@Nonnull CategoryDeleteEvent event) {

        int old = Init.Category.get(event.getGuild());
        Init.Category.remove(event.getGuild());
        Init.Category.put(event.getGuild(), old - 1);

        onTotalDelete(event.getGuild());

    }

    private void onTotalCreate(Guild guild){
        int old = Init.TotalChannels.get(guild);
        Init.TotalChannels.remove(guild);
        Init.TotalChannels.put(guild, old + 1);
    }

    private void onTotalDelete(Guild guild){
        int old = Init.TotalChannels.get(guild);
        Init.TotalChannels.remove(guild);
        Init.TotalChannels.put(guild, old - 1);
    }

}
