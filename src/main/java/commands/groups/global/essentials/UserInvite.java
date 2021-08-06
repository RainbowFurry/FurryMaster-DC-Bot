package commands.groups.global.essentials;

import commands.Command;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.requests.restaction.InviteAction;

/**
 * @author DarkSide_Wolf
 * File was created in 17:43 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class UserInvite implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        InviteAction inviteAction = event.getGuild().getDefaultChannel().createInvite().setUnique(false).setTemporary(false);
        Invite invite = inviteAction.complete();

        event.getChannel().sendMessage(invite.getUrl()).queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
