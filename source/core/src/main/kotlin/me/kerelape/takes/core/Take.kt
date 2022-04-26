package me.kerelape.takes.core

interface Take {

    /**
     * @return Response for the [request]
     */
    suspend fun response(request: Packet): Packet
}
