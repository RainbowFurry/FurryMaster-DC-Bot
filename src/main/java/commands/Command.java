package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @author DarkSide_Wolf
 * File was created in 17:35 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public interface Command {

    boolean called(String[] args, MessageReceivedEvent event);

    void action(String[] args, MessageReceivedEvent event) throws Exception;

    void executed(boolean success, MessageReceivedEvent event);

    String help();

}
