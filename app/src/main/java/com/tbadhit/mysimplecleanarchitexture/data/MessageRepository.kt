package com.tbadhit.mysimplecleanarchitexture.data

import com.tbadhit.mysimplecleanarchitexture.domain.IMessageRepository
import com.tbadhit.mysimplecleanarchitexture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}