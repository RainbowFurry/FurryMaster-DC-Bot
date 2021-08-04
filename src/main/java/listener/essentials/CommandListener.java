package listener.essentials;

import core.CommandHandler;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import utils.STATIC;

/**
 * @author DarkSide_Wolf
 * File was created in 21:17 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CommandListener extends ListenerAdapter {

    private CommandHandler commandHandler1;
    public static Guild guild;

    public CommandListener(CommandHandler commandHandler){
        this.commandHandler1 = commandHandler;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        guild = event.getGuild();
        String prefix = STATIC.PREFIX;
        if(event.getMessage().getContentRaw().startsWith(prefix) && !event.getMessage().getAuthor().getId().equals(event.getJDA().getSelfUser().getId())) {
            try {
                commandHandler1.handleCommand(CommandHandler.parse.parse(event.getMessage().getContentRaw(), event));
                System.out.println("FurryMaster: The Member: " + event.getMember().getEffectiveName() + "has run the Command: " + event.getMessage().getContentRaw());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
