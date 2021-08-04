package listener.log;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.PrivateChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import utils.STATIC;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 21:13 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class GuildLeaveLogListener extends ListenerAdapter {

    @Override
    public void onGuildMemberLeave(GuildMemberLeaveEvent event){

        //if enabeled

        EmbedBuilder eb1 = new EmbedBuilder();
        eb1.setColor(Color.green);
        eb1.setDescription(STATIC.TITLE +
                "Sad that you **" + event.getMember().getNickname() + "** leave us on **" + event.getGuild().getName() + "**!"
                + "We hope you come back soon");

        PrivateChannel pc = event.getMember().getUser().openPrivateChannel().complete();
        pc.sendMessage(eb1.build()
        ).queue();

    }

}
