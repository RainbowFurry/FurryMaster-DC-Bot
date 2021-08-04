package database;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author DarkSide_Wolf
 * File was created in 22:22 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class BotFileManager {

    private File file = new File("config.txt");

    public void loadFile(){

        if(file.exists()){
            //FileReader fileReader = new FileReader();
        }

    }

    public void createFile(){

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
