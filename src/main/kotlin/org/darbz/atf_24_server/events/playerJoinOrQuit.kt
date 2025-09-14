package org.darbz.atf_24_server.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.darbz.atf_24_server.Atf_24_server

class playerJoinOrQuit(private val plugin: Atf_24_server) : Listener{
    @EventHandler
    fun onJoin(e: PlayerJoinEvent) {
        plugin.sendData(e.player, "0")




    }

    @EventHandler
    fun onQuit(e: PlayerQuitEvent) {
        plugin.hasMod.remove(e.player)

    }


}