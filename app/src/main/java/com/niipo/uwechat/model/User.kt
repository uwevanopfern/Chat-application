package com.niipo.uwechat.model

data class User(val name: String,val bio: String, val profilePicturePath: String?) {
    constructor(): this("", "", null)
    //val registrationTokens: MutableList<String>
    //, mutableListOf()
}