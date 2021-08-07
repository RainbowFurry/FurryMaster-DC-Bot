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

    /** Replace the UserName Placeholder {username} **/
    public void replaceUserName(String userName){
        this.message = this.message.replace(PlaceHolder.UserName, userName);
    }

    /** Replace the ChannelName Placeholder {channel} **/
    public void replaceChannelName(String channelName){
        this.message = this.message.replace(PlaceHolder.ChannelName, channelName);
    }

    /** Replace the ServerName Placeholder {server} **/
    public void replaceServerName(String serverName){
        this.message = this.message.replace(PlaceHolder.ServerName, serverName);
    }

    /** Replace the User Placeholder {user} **/
    public void replaceUser(String user){
        this.message = this.message.replace(PlaceHolder.User, user);
    }

    /** Replace the UserName Placeholder {mention} {\@} **/
    public void replaceMention(String mention){
        this.message = this.message.replace(PlaceHolder.MentionUser, mention);
    }

    /** Replace the Message Placeholder {message} **/
    public void replaceMessage(String messageContent){
        this.message = this.message.replace(PlaceHolder.Message, messageContent);
    }

    /** Replace the OLD Placeholder {old} **/
    public void replaceOld(String oldContent){
        this.message = this.message.replace(PlaceHolder.Old, oldContent);
    }

    /** Replace the NEW Placeholder {new} **/
    public void replaceNew(String newContent){
        this.message = this.message.replace(PlaceHolder.New, newContent);
    }

    /** Replace the Time Placeholder {time} **/
    public void replaceTime(){
        //Date resultdate = new Date(yourmilliseconds);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        simpleDateFormat.format(System.currentTimeMillis());
        this.message = this.message.replace("{time}", simpleDateFormat.toString());
    }

    /** Replace the Date Placeholder {date} **/
    public void replaceDate(){
        //Date resultdate = new Date(yourmilliseconds);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        simpleDateFormat.format(System.currentTimeMillis());
        this.message = this.message.replace("{date}", simpleDateFormat.toString());
    }

    /** Replace the Time Placeholder {dt} **/
    public void replaceDateAndTime(){
        //Date resultdate = new Date(yourmilliseconds);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        simpleDateFormat.format(System.currentTimeMillis());
        this.message = this.message.replace("{dt}", simpleDateFormat.toString());
    }

    public String build(){
        return  this.message;
    }

}
