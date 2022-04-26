package me.kerelape.takes.core

interface Response : Packet {

    suspend fun status(): String
}
