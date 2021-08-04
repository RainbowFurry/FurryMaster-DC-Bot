package commands.groups.user;

import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @author DarkSide_Wolf
 * File was created in 17:47 04.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Commands implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        //IF admin list admin commands
        //if user List User commands
        //channel based?

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
