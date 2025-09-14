package org.darbz.atf_24_server.events

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.scheduler.BukkitRunnable
import org.darbz.atf_24_server.Atf_24_server

class kick(private val plugin: Atf_24_server) : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        object : BukkitRunnable() {
            override fun run() {
                if (!plugin.hasMod.contains(e.player)) {
                    e.player.kickPlayer("${ChatColor.RED}${ChatColor.ITALIC}You need Anti Freecam to play on this server")
                }
            }

        }.runTaskLater(plugin, 25L)

    }
}
