package builder;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.PrivateChannel;

/**
 * @author DarkSide_Wolf
 * File was created in 21:12 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class PrivateMessageBuilder {

    /** Sent a private Embed Message to the User **/
    public void sentPrivateEmbedMessage(Member member, MessageEmbed messageEmbed){
        PrivateChannel pc = member.getUser().openPrivateChannel().complete();
        pc.sendMessage(messageEmbed).queue();
    }

    /** Sent a private Message to the User **/
    public void sentPrivateMessage(Member member, String message){
        PrivateChannel pc = member.getUser().openPrivateChannel().complete();
        pc.sendMessage(message).queue();
    }

}
