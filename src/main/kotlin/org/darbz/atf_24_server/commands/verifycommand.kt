package org.darbz.atf_24_server.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.darbz.atf_24_server.Atf_24_server
import org.darbz.atf_24_server.DataSender

class verifycommand(private val plugin: Atf_24_server) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("Only players can use this command.")
            return true
        }

        val player = sender as Player

        if (!plugin.hasMod.contains(player)) {
            plugin.hasMod.add(player)
            player.sendMessage("Client Has Been Verified")
            DataSender(plugin, player).start()
        } else {
            player.sendMessage("You have already been verified.")
        }

        return true
    }
}
