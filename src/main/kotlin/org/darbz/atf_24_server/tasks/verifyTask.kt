package org.darbz.atf_24_server.tasks


import org.darbz.atf_24_server.Atf_24_server


class verifyTask(private val plugin2: Atf_24_server) : Task(plugin2)  {
    public override fun run() {
        for (player in plugin!!.hasMod) {
            plugin?.sendData(player, "1")


        }
    }
}