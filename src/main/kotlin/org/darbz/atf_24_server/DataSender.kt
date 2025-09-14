package org.darbz.atf_24_server

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable

class DataSender(
    private val plugin: Atf_24_server,
    private val p: Player
) {
    fun start() {
        object : BukkitRunnable() {
            override fun run() {
                if (plugin.hasMod.contains(p)) {

                    if (!p.isOnline) cancel()
                    plugin.sendData(p, "1")

                }

            }
        }.runTaskTimer(plugin, 0L, 2L)
    }
}
