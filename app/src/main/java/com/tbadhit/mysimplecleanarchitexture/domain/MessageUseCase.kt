package com.tbadhit.mysimplecleanarchitexture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}