package com.tbadhit.mysimplecleanarchitexture.data

import com.tbadhit.mysimplecleanarchitexture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}