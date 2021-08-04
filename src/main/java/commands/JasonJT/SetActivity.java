package commands.JasonJT;

import commands.Command;
import core.Main;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @author DarkSide_Wolf
 * File was created in 21:29 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class SetActivity implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        if(event.getMember().getUser().getId().equals("246277810274959360")) {

            Activity currentActivity = Main.jda.getPresence().getActivity();

            Main.jda.getPresence().setActivity(Activity.of(Activity.ActivityType.DEFAULT, "JasonJT"));

            event.getTextChannel().sendMessage("Du hast die Activity von " + currentActivity + " auf " + "JasonJT" + " gestellt.").queue();
            System.out.println("FurryMaster: Du hast die Activity von " + currentActivity + " auf " + "JasonJT" + " gestellt.");

        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

}
