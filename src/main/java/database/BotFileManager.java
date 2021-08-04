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
                    properties.setProperty("activityText", "auf der Erde");
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
}
