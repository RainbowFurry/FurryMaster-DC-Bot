package database;

import net.dv8tion.jda.api.entities.Activity;

import java.io.*;
import java.util.Properties;

/**
 * @author DarkSide_Wolf
 * File was created in 22:22 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class BotFileManager {
    private final Properties properties = new Properties();

    public BotFileManager() throws IOException {
        File file = new File("config.txt");
        if (!file.exists())
            if (file.createNewFile()) {
                OutputStream outputStream;
                try {
                    outputStream = new FileOutputStream(file);
                    properties.setProperty("token", "YOUR_TOKEN");
                    properties.setProperty("activityType", "ONLINE");
                    properties.setProperty("activityText", "AktivityText");
                    properties.setProperty("DB_Host", "localhost");
                    properties.setProperty("DB_Database", "BotName");
                    properties.setProperty("DB_Port", "3306");
                    properties.setProperty("DB_UserName", "UserName");
                    properties.setProperty("DB_Password", "Password");
                    properties.store(outputStream, null);
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        InputStream inputStream = new FileInputStream(file);
        properties.load(inputStream);
    }

    public String getToken() {
        return properties.getProperty("token");
    }

    public Activity.ActivityType getActivityType() {
        return Activity.ActivityType.valueOf(properties.getProperty("activityType"));
    }

    public String getActivityText() {
        return properties.getProperty("activityText");
    }

    /* Database */
    public String getDatabaseHost(){
        return properties.getProperty("DB_Host");
    }

    public int getDatabasePort(){
        return Integer.valueOf(properties.getProperty("DB_Port"));
    }

    public String getDatabaseUserName(){
        return properties.getProperty("DB_UserName");
    }

    public String getDatabasePassword(){
        return properties.getProperty("DB_Password");
    }

    private String db;
    public String getDatabaseDatabase(){
        if(db == null)
            db = properties.getProperty("DB_Database");
        return db;
    }

}
