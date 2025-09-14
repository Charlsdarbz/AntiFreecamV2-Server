package org.darbz.atf_24_server

import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import org.darbz.atf_24_server.commands.verifycommand
import org.darbz.atf_24_server.events.kick
import org.darbz.atf_24_server.events.playerJoinOrQuit

class Atf_24_server : JavaPlugin() {
    val hasMod = mutableListOf<Player>()
    override fun onEnable() {
        // Plugin startup logic
        registerCommands()
        registerEvents()



    }

    override fun onDisable() {
        // Plugin shutdown logic
    }



    fun registerEvents() {
        server.pluginManager.registerEvents(kick(this), this)
        server.pluginManager.registerEvents(playerJoinOrQuit(this), this)

    }

    fun registerCommands() {
        server.getPluginCommand("verify_mod")?.setExecutor(verifycommand(this))
    }


    fun sendData(player: Player, data: String?) {
        player.sendMessage("atf012_" + data)
    }



}
