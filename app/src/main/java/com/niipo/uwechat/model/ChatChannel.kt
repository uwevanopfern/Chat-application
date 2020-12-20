package com.niipo.uwechat.model


data class ChatChannel(val userIds: MutableList<String>) {
    constructor() : this(mutableListOf())
}