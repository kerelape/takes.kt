package me.kerelape.takes.core

interface Request : Packet {

    suspend fun method(): String
}
