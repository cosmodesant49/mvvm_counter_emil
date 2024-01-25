package com.geeks.mvvm_counter_emil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var counter = 0

    /*   val counterLv: MutableLiveData<Int>
           get() = _counterLv

       private val _counterLv = MutableLiveData<Int>()*/
    private val _counterLv = MutableLiveData<Int>()
    val counterLv: LiveData<Int> get() = _counterLv

    fun dec() {
        counter--
        _counterLv.value = counter
    }

    fun inc() {
        counter++
        _counterLv.value = counter
    }
}
