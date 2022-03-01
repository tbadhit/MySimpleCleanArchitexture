package com.tbadhit.mysimplecleanarchitexture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tbadhit.mysimplecleanarchitexture.di.Injection
import com.tbadhit.mysimplecleanarchitexture.domain.MessageUseCase
import java.lang.IllegalArgumentException

class MainViewModelFactory(
    private var messageUseCase: MessageUseCase
): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw  IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }

    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }
}