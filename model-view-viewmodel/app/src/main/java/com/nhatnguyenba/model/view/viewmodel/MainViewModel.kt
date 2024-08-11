package com.nhatnguyenba.model.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val userLiveData = MutableLiveData<User>()
    val user: LiveData<User> get() = userLiveData

    fun loadUser() {
        // Simulating data loading
        val user = User("John Doe", "johndoe@example.com")
        userLiveData.value = user
    }
}