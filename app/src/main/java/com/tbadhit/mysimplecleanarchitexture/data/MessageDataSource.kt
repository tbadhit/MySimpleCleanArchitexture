package com.tbadhit.mysimplecleanarchitexture.data

import com.tbadhit.mysimplecleanarchitexture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! welcome to Clean Architecture")
    }
}