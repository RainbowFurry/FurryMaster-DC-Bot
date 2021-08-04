package needed;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author DarkSide_Wolf
 * File was created in 20:10 25.05.2020
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class PermissionListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){
        if(event.getChannel().getName().equals("rollen") || event.getChannel().getName().equals("roules")) {

            String reaction = event.getReactionEmote().toString();
            reaction = reaction.split("\\(")[1];
            reaction = reaction.replace(")", "");

            switch (reaction){

                case "714536263679606886":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C", false).get(0)).queue();
                    break;

                case "714487824157769790":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C++", false).get(0)).queue();
                    break;

                case "714487815622230036":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C#", false).get(0)).queue();
                    break;

                case "714487833590497353":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Java", false).get(0)).queue();
                    break;

                case "714491197544202270":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Android", false).get(0)).queue();
                    break;

                case "714538107915206746":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Python", false).get(0)).queue();
                    break;

                case "714536344705171576":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("HTML", false).get(0)).queue();
                    break;

                case "714491376179347559":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("JS", false).get(0)).queue();
                    break;

                case "714491288648548403":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("PhP", false).get(0)).queue();
                    break;

                case "714536288115490908":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("CSS", false).get(0)).queue();
                    break;


                case "714487794361172018":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("MySql", false).get(0)).queue();
                    break;

                case "714487847943667754":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("MongoDB", false).get(0)).queue();
                    break;


                case "714536387667558410":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("IntelliJ", false).get(0)).queue();
                    break;

                case "714536312706957402":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Eclipse", false).get(0)).queue();
                    break;

                case "714536451542482985":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("PhPStorm", false).get(0)).queue();
                    break;

                case "714491255421141012":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("VisualStudio", false).get(0)).queue();
                    break;

                case "714491228355297321":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("VisualStudioCode", false).get(0)).queue();
                    break;


                case "714487782751600660":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Windows", false).get(0)).queue();
                    break;

                case "714487839974359132":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Linux", false).get(0)).queue();
                    break;

                case "714536359724843038":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Mac", false).get(0)).queue();
                    break;

                case "714537371416264724":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Web", false).get(0)).queue();
                    break;


                case "714491271770669067":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Discord", false).get(0)).queue();
                    break;

                case "714583275586453564":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Minecraft", false).get(0)).queue();
                    break;

                case "714760187399110666":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Angular", false).get(0)).queue();
                    break;

                case "714760218705264681":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("NodeJS", false).get(0)).queue();
                    break;

                case "714761303327244289":
                    event.getGuild().addRoleToMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("TypeScript", false).get(0)).queue();
                    break;

            }

           // System.out.println(event.getReactionEmote());
        }
    }

    @Override
    public void onMessageReactionRemove(@NotNull MessageReactionRemoveEvent event) {
        if(event.getChannel().getName().equals("rollen") || event.getChannel().getName().equals("roules")) {

            String reaction = event.getReactionEmote().toString();
            reaction = reaction.split("\\(")[1];
            reaction = reaction.replace(")", "");

            switch (reaction){

                case "714536263679606886":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C", false).get(0)).queue();
                    break;

                case "714487824157769790":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C++", false).get(0)).queue();
                    break;

                case "714487815622230036":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("C#", false).get(0)).queue();
                    break;

                case "714487833590497353":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Java", false).get(0)).queue();
                    break;

                case "714491197544202270":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Android", false).get(0)).queue();
                    break;

                case "714538107915206746":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Python", false).get(0)).queue();
                    break;

                case "714536344705171576":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("HTML", false).get(0)).queue();
                    break;

                case "714491376179347559":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("JS", false).get(0)).queue();
                    break;

                case "714491288648548403":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("PhP", false).get(0)).queue();
                    break;

                case "714536288115490908":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("CSS", false).get(0)).queue();
                    break;


                case "714487794361172018":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("MySql", false).get(0)).queue();
                    break;

                case "714487847943667754":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("MongoDB", false).get(0)).queue();
                    break;


                case "714536387667558410":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("IntelliJ", false).get(0)).queue();
                    break;

                case "714536312706957402":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Eclipse", false).get(0)).queue();
                    break;

                case "714536451542482985":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("PhPStorm", false).get(0)).queue();
                    break;

                case "714491255421141012":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("VisualStudio", false).get(0)).queue();
                    break;

                case "714491228355297321":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("VisualStudioCode", false).get(0)).queue();
                    break;


                case "714487782751600660":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Windows", false).get(0)).queue();
                    break;

                case "714487839974359132":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Linux", false).get(0)).queue();
                    break;

                case "714536359724843038":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Mac", false).get(0)).queue();
                    break;

                case "714537371416264724":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Web", false).get(0)).queue();
                    break;


                case "714491271770669067":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Discord", false).get(0)).queue();
                    break;

                case "714583275586453564":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Minecraft", false).get(0)).queue();
                    break;

                case "714760187399110666":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("Angular", false).get(0)).queue();
                    break;

                case "714760218705264681":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("NodeJS", false).get(0)).queue();
                    break;

                case "714761303327244289":
                    event.getGuild().removeRoleFromMember(event.getGuild().getMember(event.getUser()) , event.getGuild().getRolesByName("TypeScript", false).get(0)).queue();
                    break;

            }


            // System.out.println(event.getReactionEmote());
        }
    }

        /*@Override
    public void onGuildMessageReactionAdd(@NotNull GuildMessageReactionAddEvent event){
        System.out.println(event.getReaction());
        System.out.println("TEST 2");
    }*/

}
