package com.example.ktx

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _livedata:MutableLiveData<Boolean> = MutableLiveData()
    val livedata: LiveData<Boolean> = liveData {
        emitSource(_livedata)
    }

    fun doTaskTiedToViewModelScope(){
        viewModelScope.launch {
            // do your stuff here
        }
    }

}