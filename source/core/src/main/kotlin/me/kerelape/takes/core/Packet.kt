package me.kerelape.takes.core

import kotlinx.coroutines.channels.ReceiveChannel

/**
 * Common HTTP packet
 */
interface Packet {

    /**
     * All lines above the [body]
     */
    suspend fun head(): Iterable<Pair<String, String>>

    /**
     * Packet body
     *
     * @return ReceiveChannel of body bytes
     */
    suspend fun body(): ReceiveChannel<Byte>
}
