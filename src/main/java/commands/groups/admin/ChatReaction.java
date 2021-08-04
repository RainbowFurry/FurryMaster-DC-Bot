package commands.groups.admin;

import builder.CustomEmbedBuilder;
import commands.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import templates.SelfRole;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 14:23 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ChatReaction implements Command {

    private SelfRole selfRole = new SelfRole();

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) throws Exception {

        //if channel
        //display all templates + custom
        //react all 1 time

        if(args.length == 1){

            switch (args[0]){

                case "Gender":
                    selfRole.createGenderReactionMessage(event);
                    break;

                case "Age":
                    selfRole.createAgeReactionMessage(event);
                    break;

                case "Animal":
                    selfRole.createAnimalReactionMessage(event);
                    break;

                case "Color":
                    selfRole.createColorReactionMessage(event);
                    break;

                case "Country":
                    selfRole.createCountryReactionMessage(event);
                    break;

                case "GameCategory":
                    selfRole.createGameCategoryReactionMessage(event);
                    break;

                case "Games":
                    selfRole.createGamesReactionMessage(event);
                    break;

                case "Movie":
                    selfRole.createMovieReactionMessage(event);
                    break;

                case "Music":
                    selfRole.createMusicReactionMessage(event);
                    break;

                case "Pronouns":
                    selfRole.createPronounsReactionMessage(event);
                    break;

                case "Sexuality":
                    selfRole.createSexualityReactionMessage(event);
                    break;

                case "StarSign":
                    selfRole.createStarSignReactionMessage(event);
                    break;

                case "Job":
                    selfRole.createJobReactionMessage(event);
                    break;

                case "Hobby":
                    selfRole.createHobbyReactionMessage(event);
                    break;

                case "Sport":
                    selfRole.createSportReactionMessage(event);
                    break;

                case "Verification":
                    selfRole.createVerificationReactionMessage(event);
                    break;

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

}
