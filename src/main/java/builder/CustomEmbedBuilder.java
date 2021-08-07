package builder;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import javax.annotation.Nonnull;
import java.awt.*;

/***
 * @author DarkSide_Wolf
 * File was created in 21:12 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 **/
public class CustomEmbedBuilder {

    /**
    * Embed Type: -> Info, Warning, Error, etc.
    * auto tags to replace
    * **/

    private EmbedBuilder embedBuilder;

    /** Initialize Embed Builder **/
    public CustomEmbedBuilder(){
        embedBuilder = new EmbedBuilder();
    }

    /** Set the Color of the Embed **/
    public void setEmbedColor(@Nonnull Color color){
        embedBuilder.setColor(color);
    }

    /** Set the Color of the Embed with Hex-Code **/
    public void setEmbedColor(@Nonnull String color){
        if(color.startsWith("#"))
            embedBuilder.setColor(Color.decode(color));
        else
            embedBuilder.setColor(Color.decode("#07e843"));
    }

    /**public void setEmbedColor(@javax.annotation.Nonnull int r, int g, int b){
        //...
    }**/

    /** Set the Title of the Embed **/
    public void setTitle(@Nonnull String title){
        embedBuilder.setTitle(title);
    }

    /** Set the Content of the Embed **/
    public void setContent(@Nonnull String content){
        embedBuilder.setDescription(content);
    }

    /** ... **/
    public void setImage(@Nonnull String url){
        embedBuilder.setImage(url);
    }

    /** Set the Tumbnail of the Embed **/
    public void setThumbnail(@Nonnull String url){
        embedBuilder.setThumbnail(url);
    }

    /** Set the Author of the Embed **/
    public void setAuthor( @Nonnull String author){
        embedBuilder.setAuthor(author);
    }

    /** Set the Footer of the Embed **/
    public void setFooter(@Nonnull String footer){
        embedBuilder.setFooter(footer);
    }

    /** Create the Embed and return it **/
    public MessageEmbed build(){
        return embedBuilder.build();
    }

}
