package builder;

import variables.PlaceHolder;

import java.text.SimpleDateFormat;

/**
 * @author DarkSide_Wolf
 * File was created in 23:51 06.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class MessageBuilder {

    private String message;

    public MessageBuilder(String message){
        this.message = message;
    }

    public void replaceUserName(String userName){
        this.message = this.message.replace(PlaceHolder.UserName, userName);
    }

    public void replaceChannelName(String channelName){
        this.message = this.message.replace(PlaceHolder.ChannelName, channelName);
    }

    public void replaceServerName(String serverName){
        this.message = this.message.replace(PlaceHolder.ServerName, serverName);
    }

    public void replaceUser(String user){
        this.message = this.message.replace(PlaceHolder.User, user);
    }

    public void replaceMention(String mention){
        this.message = this.message.replace(PlaceHolder.MentionUser, mention);
    }

    public void replaceMessage(String messageContent){
        this.message = this.message.replace(PlaceHolder.Message, messageContent);
    }

    public void replaceOld(String oldContent){
        this.message = this.message.replace(PlaceHolder.Old, oldContent);
    }

    public void replaceNew(String newContent){
        this.message = this.message.replace(PlaceHolder.New, newContent);
    }

    public void replaceTime(){
        //Date resultdate = new Date(yourmilliseconds);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        simpleDateFormat.format(System.currentTimeMillis());
        this.message = this.message.replace("{time}", simpleDateFormat.toString());
    }

    public String build(){
        return  this.message;
    }

}
