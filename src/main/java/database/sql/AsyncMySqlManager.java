package database.sql;

import net.dv8tion.jda.api.entities.Guild;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author DarkSide_Wolf
 * File was created in 12:52 02.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class AsyncMySqlManager {

    private final ExecutorService executor;
    private final MySQL sql;

    public AsyncMySqlManager(final String host, final int port, final String user, final String password) throws Throwable {
        this.executor = Executors.newCachedThreadPool();
        sql = new MySQL(host, port, user, password);
    }

    public void changeDatabase(final String database) {
        this.query("USE " + database + ";");
    }

    public void createDatabase(final String database) {
        this.update("CREATE DATABASE IF NOT EXISTS " + database + ";");
    }

    public void deleteDatabase(final String database) {
        this.update("DROP DATABASE IF EXISTS " + database + ";");
    }

    public void deleteDatabase(final Guild guild) {
        String database;
        if(guild != null) {
            database = "FurryMaster_" + guild.getId();
            this.changeDatabase("FurryMaster_" + guild.getId());
        }else {
            database = "FurryMaster_Master";
            this.changeDatabase("FurryMaster_Master");
        }
        this.update("DROP DATABASE IF EXISTS " + database + ";");
    }

    public void createTable(final Guild guild, final String table, final String values) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        this.update("CREATE TABLE IF NOT EXISTS " + table + "(" + values + ");");
    }

    public void deleteTable(final Guild guild, final String table) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        this.update("DROP TABLE " + table + ";");
    }

    public void insertInto(final Guild guild, final String table, final String check, final String checkValue, final String values, final String content) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        if(this.valueExists(guild, table, check, checkValue))
            return;
        this.update("INSERT INTO " + table + "(" + values + ") VALUES (" + content + ");");
    }

    public void update(final Guild guild, final String table, final String updateValue, final Object updateContent) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        this.update("UPDATE " + table + " SET " + updateValue + "='" + updateContent + "';");
    }

    public void update(final Guild guild, final String table, final String updateValue, final Object updateContent, final String where, final Object result) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        this.update("UPDATE " + table + " SET " + updateValue + "='" + updateContent + "' WHERE " + where + "='" + result + "';");
    }

    public void delete(final Guild guild, final String table, final String where, final Object result) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        this.update("DELETE FROM " + table + " WHERE " + where + "='" + result + "';");
    }

    public ArrayList<Object> getObjects(final Guild guild, final String table, final String where, final Object result, final String get) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        final ArrayList<Object> arrayList = new ArrayList<>();
        final ResultSet resultSet = this.query("SELECT * FROM " + table + " WHERE " + where + "='" + result + "';");
        try {
            while(resultSet.next())
                arrayList.add(resultSet.getObject(get));
        } catch (Throwable throwable) {
            System.out.println(guild.getId() + ": Cannot find " + get + " in database");
        }
        return arrayList;
    }

    public Object getObject(final Guild guild, final String table, final String where, final Object result, final String get) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        Object object = null;
        final ResultSet resultSet = this.query("SELECT * FROM " + table + " WHERE " + where + "='" + result + "';");
        try {
            if(!resultSet.next())
                return null;
            object = resultSet.getObject(get);
        } catch (Throwable throwable) {
            System.out.println(guild.getId() + ": Cannot find " + get + " in database");
        }
        return object;
    }

    private boolean valueExists(final Guild guild, final String table, final String where, final Object result) {
        if(guild != null)
            this.changeDatabase("FurryMaster_" + guild.getId());
        else
            this.changeDatabase("FurryMaster_Master");
        final ResultSet resultSet = this.query("SELECT * FROM " + table + " WHERE " + where + "='" + result + "';");
        try {
            return resultSet.next();
        } catch (Throwable throwable) {
            System.out.println(guild.getId() + ": Cannot find " + result + " in database");
            return false;
        }
    }

    private void update(final String statement) {
        executor.execute(() -> {
            try {
                sql.queryUpdate(statement);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    private ResultSet query(final String statement) {
        final AtomicReference<ResultSet> resultSet = new AtomicReference<>();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        executor.execute(() -> {
            try {
                resultSet.set(sql.query(statement));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            atomicBoolean.set(true);
        });
        while (!atomicBoolean.get()) {
        }
        return resultSet.get();
    }

    class MySQL {

        private final String host, user, password;
        private final int port;

        private Connection conn;

        MySQL(final String host, final int port, final String user, final String password) throws Throwable {
            this.host = host;
            this.port = port;
            this.user = user;
            this.password = password;

            this.openConnection();
        }

        void queryUpdate(final String query) throws Throwable {
            checkConnection();
            PreparedStatement statement = conn.prepareStatement(query);
            queryUpdate(statement);
        }

        void queryUpdate(final PreparedStatement statement) throws Throwable {
            checkConnection();
            statement.executeUpdate();
            statement.close();
        }

        ResultSet query(final String query) throws Throwable {
            checkConnection();
            return query(conn.prepareStatement(query));
        }

        ResultSet query(final PreparedStatement statement) throws Throwable {
            checkConnection();
            return statement.executeQuery();
        }

        private void checkConnection() throws Throwable {
            if (this.conn == null || !this.conn.isValid(10) || this.conn.isClosed())
                openConnection();
        }

        void openConnection() throws Throwable {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "?serverTimezone=UTC", this.user, this.password);
        }

    }
}
