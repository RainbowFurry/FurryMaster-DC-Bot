package listener.log;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import utils.STATIC;

import java.awt.*;
import java.util.Objects;

/**
 * @author DarkSide_Wolf
 * File was created in 21:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class GuildJoinLogListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        //if enabeled

        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.green);
        eb.setDescription(STATIC.TITLE + "\n" +
                "Welcome **" + event.getMember().getEffectiveName() + "** to **" + event.getGuild().getName() + "**.");

        Objects.requireNonNull(event.getGuild().getDefaultChannel()).sendMessage(eb.build()).queue();
    }

}
