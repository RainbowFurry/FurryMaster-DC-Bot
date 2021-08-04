package builder;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.requests.restaction.RoleAction;

import java.awt.*;

/**
 * @author DarkSide_Wolf
 * File was created in 23:16 01.08.2021
 * Copyright (c) 2018 by DarkSide_Wolf to present. All rights reserved.
 * Website: DarkWolfCraft.net
 */
public class RoleBuilder {

    private RoleAction roleAction;

    public RoleBuilder(Guild guild){
        roleAction = guild.createRole();
    }

    public void setName(String name){
        roleAction = roleAction.setName(name);
    }

    public void setPermission(Permission... permissions){
        roleAction = roleAction.setPermissions(permissions);
    }

    public void setColor(Color color){
        roleAction = roleAction.setColor(color);
    }

    public void setMentionable(boolean mentionable){
        roleAction = roleAction.setMentionable(mentionable);
    }

    public Role build(){
        return roleAction.complete();
    }

}
