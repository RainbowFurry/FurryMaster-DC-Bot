package builder;

import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author DarkSide_Wolf
 * File was created in 10:48 03.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class ReactionRoleBuilder {

    private CustomEmbedBuilder embedBuilder;
    private String content = "";

    public ReactionRoleBuilder(){
       embedBuilder = new CustomEmbedBuilder();
    }

    public void setTitle(String title){
        embedBuilder.setTitle(title);
    }

    public void addRole(String role, String emoji){
        content += emoji + " **" + role + "**\n";
    }

    public void addPlaceHolder(){

    }

    public void addSpacer(){

    }

    public void setColor(Color color){
        embedBuilder.setEmbedColor(color);
    }

    public MessageEmbed build(){
        embedBuilder.setContent(content);
        return embedBuilder.build();
    }

}
