package com.tbadhit.mysimplecleanarchitexture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String) : MessageEntity
}