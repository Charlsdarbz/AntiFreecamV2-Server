package org.darbz.atf_24_server.tasks

import org.darbz.atf_24_server.Atf_24_server

abstract class Task(protected val plugin: Atf_24_server?) {

    var id: Int = 0
    private var tick = 0
    var tickThreshold: Int = 1
    var cancel: Boolean = false

    fun tick() {
        tick++
        if (tick < tickThreshold) return

        run()
        tick = 0
    }


    abstract fun run()

    open fun onCancel() {}
}
