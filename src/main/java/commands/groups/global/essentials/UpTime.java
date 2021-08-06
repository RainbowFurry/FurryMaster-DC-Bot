package commands.groups.global.essentials;

import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @author DarkSide_Wolf
 * File was created in 23:26 04.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class UpTime implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
