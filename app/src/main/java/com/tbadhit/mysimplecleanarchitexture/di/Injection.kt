package com.tbadhit.mysimplecleanarchitexture.di

import com.tbadhit.mysimplecleanarchitexture.data.IMessageDataSource
import com.tbadhit.mysimplecleanarchitexture.data.MessageDataSource
import com.tbadhit.mysimplecleanarchitexture.data.MessageRepository
import com.tbadhit.mysimplecleanarchitexture.domain.IMessageRepository
import com.tbadhit.mysimplecleanarchitexture.domain.MessageInteractor
import com.tbadhit.mysimplecleanarchitexture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}