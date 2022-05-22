package com.aldikitta.room_mad_aac

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aldikitta.room_mad_aac.database.SubscriberRepository

class SubscriberViewModelFactory(private val repository: SubscriberRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)) {
            return SubscriberViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}