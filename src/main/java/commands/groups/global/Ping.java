package commands.groups.global;

import commands.Command;
import core.CommandParser;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Date;

/**
 * @author DarkSide_Wolf
 * File was created in 14:53 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class Ping implements Command {

    private static long inputTime;

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        //check channel

        if(args.length == 0) {
            setInputTime(System.currentTimeMillis());
            long processing = new Date().getTime() - inputTime;
            long ping = event.getJDA().getGatewayPing();
            CommandParser.sendMessage(event, Color.red, "Title" +
                    String.format(":ping_pong:   Pong!\n\nThe Bot takes %s milliseconds to answer.",
                            ping)
            );
        }else{
            //ping server
        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

    public static void setInputTime(long inputTimeLong) {
        inputTime = inputTimeLong;
    }

    private Color getColorByPing(long ping) {
        if (ping < 100)
            return Color.cyan;
        if (ping < 400)
            return Color.green;
        if (ping < 700)
            return Color.yellow;
        if (ping < 1000)
            return Color.orange;
        return Color.red;
    }

}
