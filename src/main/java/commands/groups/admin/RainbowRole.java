package commands.groups.admin;

import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author DarkSide_Wolf
 * File was created in 14:39 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class RainbowRole implements Command {

    //guild - role - color
    public static HashMap<String, Color> start = new HashMap<>();
    public static HashMap<String, Timer> timerstart = new HashMap<>();

    //ON SHUTDOWN Set Role Color fallback

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    //args 0 = start/stop
    //args 1 = Role
    //args 2 = Mode
    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        //mode - random colors oder vorlage fest folgen
        //mode - gay/bi/rainbow/all colors/custom

        //Check args length
        //check permission
        //check channel

        if(args.length == 3) {
            if (args[0].equals("start")) {

                if(event.getJDA().getRolesByName(args[1], false).get(0) != null) {
                    start.put(event.getJDA().getRolesByName(args[1], false).get(0).getName(), event.getJDA().getRolesByName(args[1], false).get(0).getColor());

                    switch (args[2]) {

                        case "KP":
                            KP(event, args[1]);
                            break;

                        case "Rainbow":
                            // rainbowMode(event, args[1]);
                            break;

                        case "Bi":
                            // BiMode(event, args[1]);
                            break;

                        case "Gay":
                            //  GayMode(event, args[1]);
                            break;

                        case "Custom":
                            //  CustomMode(event, args[1]);
                            break;

                        default:
                            //
                            break;

                    }

                    //Message

                }

            } else if (args[0].equals("stop")) {
                timerstart.get(args[1]).cancel();
                event.getJDA().getRolesByName(args[1], false).get(0).getManager().setColor(start.get(args[1])).queue();
                //Message
            }
        }

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

    private void KP(MessageReceivedEvent event, String roleName){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                Random random = new Random();
                int color = random.nextInt(21);

                if (color == 0) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(0, 191, 255)).queue();
                } else if (color == 1) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(224, 117, 255)).queue();
                } else if (color == 2) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(224, 117, 69)).queue();
                } else if (color == 3) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 46, 69)).queue();
                } else if (color == 4) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 16, 36)).queue();
                } else if (color == 5) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 227, 36)).queue();
                } else if (color == 6) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(173, 227, 36)).queue();
                } else if (color == 7) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(92, 227, 36)).queue();
                } else if (color == 8) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(5, 227, 36)).queue();
                } else if (color == 9) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(5, 255, 189)).queue();
                } else if (color == 10) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(5, 237, 189)).queue();
                } else if (color == 11) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(5, 162, 189)).queue();
                } else if (color == 12) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(5, 107, 189)).queue();
                } else if (color == 13) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(111, 107, 189)).queue();
                } else if (color == 14) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(246, 107, 189)).queue();
                } else if (color == 15) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 191, 0)).queue();
                } else if (color == 16) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 0, 255)).queue();
                } else if (color == 17) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(0, 255, 255)).queue();
                } else if (color == 18) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(0, 191, 255)).queue();
                } else if (color == 19) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(0, 255, 0)).queue();
                } else if (color == 20) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(255, 255, 0)).queue();
                } else if (color == 21) {
                    event.getJDA().getRolesByName(roleName, false).get(0).getManager().setColor(new Color(191, 255, 0)).queue();
                }

            }
        };

        Timer timer = new Timer();
        timerstart.put(roleName, timer);
        timer.schedule(timerTask, 0, 1000 * 2);
    }
    
    private void rainbowMode(){

    }

    private void BiMode(){

    }

    private void GayMode(){

    }

    private void CustomMode(){
        
    }
    
}
