package needed;

import commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 17:07 25.05.2020
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CreateRoles implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(event.getChannel().getName().equals("rollen") || event.getChannel().getName().equals("roules")) {
            event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setDescription("Comment the Following Line to get The Rank and the Channel Permissions").build()).queue();

            programmingLanguages(event);
            dbLanguages(event);
            editors(event);
            system(event);
            elsecoding(event);
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }


    private void programmingLanguages(MessageReceivedEvent event){
        //in DC gehen /:joy: z.b. eingeben und dann copy paste
        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("DWC_VA | Languages")
                .addField(" C", "<:C_:714536263679606886>", true)
                .addField("C++", "<:CPlusPlus:714487824157769790>", true)
                .addField("C#", "<:CSharp:714487815622230036>", true)

                .addField("Java", "<:Java:714487833590497353>", true)
                .addField("Android", "<:Android:714491197544202270>", true)
                .addField("Python", "<:Python:714538107915206746>", true)

                .addField("HTML", "<:HTTML:714536344705171576>", true)
                .addField("JS", "<:JS:714491376179347559>", true)
                .addField("PhP", "<:PHP:714491288648548403>", true)

                .addField("CSS", "<:CSS:714536288115490908>", true)
                .addField("Angular", "<:Angular:714760187399110666>", true)
                .addField("TypeScript", "<:TypeScript:714761303327244289>", true)

                .addField("NodeJS", "<:NodeJS:714760218705264681>", true)
                .addField("other", ":joy:", true)
                .build()).queue();

    }

    private void dbLanguages(MessageReceivedEvent event){

        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("DWC_VA | DB")
                .addField(" MySql", "<:MySql:714487794361172018>", true)
                .addField("MongoDB", "<:MongoDB:714487847943667754>", true)
                .build()).queue();

    }

    private void editors(MessageReceivedEvent event){

        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("DWC_VA | Editors")
                .addField("IntelliJ", "<:IntelliJ:714536387667558410>", true)
                .addField("Eclipse", "<:Eclipse:714536312706957402>", true)
                .addField("PhPStorm", "<:PhPStorm:714536451542482985>", true)

                .addField("VS", "<:VS:714491255421141012>", true)
                .addField("VSC", "<:VSC:714491228355297321>", true)
                .build()).queue();

    }

    private void system(MessageReceivedEvent event){

        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("DWC_VA | System")
                .addField("Windows", "<:Windows:714487782751600660>", true)
                .addField("Linux", "<:Linux:714487839974359132>", true)
                .addField("Mac", "<:Mac:714536359724843038>", true)

                .addField("Android", "<:Android:714491197544202270>", true)
                .addField("Web", "<:Web:714537371416264724>", true)
                .build()).queue();

    }

    private void elsecoding(MessageReceivedEvent event){

        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("DWC_VA | Sonstiges")
                .addField("Discord", "<:DC:714491271770669067> ", true)
                .addField("Minecraft", "<:Minecraft:714583275586453564>", true)
                .build()).queue();

    }

}
