package needed;

import commands.Command;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 20:06 25.05.2020
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class CreateVerify implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(event.getChannel().getName().equals("regeln") || event.getChannel().getName().equals("rules")) {
            event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setDescription("Reagiere mit <:Verifiziert:714554521866469469> auf die Regeln, um dich zu Verifizieren und zu bestätigen dass du die Regeln gelesen hast.").build()).queue();
            rules(event);
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

    private void rules(MessageReceivedEvent event){
        event.getTextChannel().sendMessage(new EmbedBuilder().setColor(Color.GREEN).setDescription("Unsere Regeln:\n\n" +
                "Regeln zur Nutzung unseres Discord\n\n" +
                "§1 - Umgang mit Usern\nJeder Nutzer des Discord Servers ist stets freundlich zu behandeln. Es wird niemand beleidigt.\n\n" +
                "§2 - Störgeräusche\nJeder ist dazu verpflichtet, sein Mikrofon so einzustellen, dass man keine Stör- oder Hintergrundgeräusche hört.\n\n" +
                "§3 - Ausnutzung der Rechte\nEs wird niemand ohne einen bestimmten Grund vom Server gemuted, gekickt, gebannt oder gemoved.\n\n" +
                "§4 - Avatar\nAvatare dürfen keine pornographischen, rassistischen, beleidigenden Inhalte beinhalten.\n\n" +
                "§5 - Gespräche aufnehmen\nDas Aufnehmen von Gesprächen ist nur erlaubt, wenn alle beteiligten im Channel einverstanden sind.\n\n" +
                "§6 - Anweisungen\nDas verweigern von Anweisungen der Admins/Moderatoren werden mit einem Kick oder einen Bann bestraft.\n\n" +
                "§7 - Werbung\nJegliche Art von Werbung ist auf dem Discord Server strikt untersagt. Außer er hat die ausdrückliche Erlaubnis eines Admins oder Supporters\n\n" +
                "§8 - Datenschutz\nPrivate Daten wie z.B. Adressen, Telefonnummern etc. dürfen nicht an dritte weiter gegeben werden. Jeder Nutzer ist für den Schutz seiner Daten selbst verantwortlich.\n\n" +
                "§9 - Namensgebung\nJeder Nutzer ist dazu verpflichtet seinen Name so zu wählen, das er nicht beleidigend ist. Das Faken eines Nutzers ist verboten.\n\n" +
                "§10 - Spam\nSpam in jeglicher Form ist untersagt und wird mit einem Mute, Kick oder Bann bestraft.\n\n"
                ).build()).queue();
    }

}
