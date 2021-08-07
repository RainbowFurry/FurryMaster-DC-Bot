/*
 * Copyright (c) 2021 All rights reserved to
 * @author Jason Hoffmann
 * NickName: DarkSide_Wolf
 * Websides:
 * https://darkwolfcraft.net/
 * https://zeroworks.de/
 * https://jasonjt.de/
 */

package listener.essentials;

import commands.groups.admin.RainbowRole;
import net.dv8tion.jda.api.events.ShutdownEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class RainbowListener extends ListenerAdapter {

    @Override
    public void onShutdown(@Nonnull ShutdownEvent event) {
        //RainbowRole.timerstart.get(args[1]).cancel();
        //event.getJDA().getRolesByName(args[1], false).get(0).getManager().setColor(RainbowRole.start.get(args[1])).queue();
    }

}
