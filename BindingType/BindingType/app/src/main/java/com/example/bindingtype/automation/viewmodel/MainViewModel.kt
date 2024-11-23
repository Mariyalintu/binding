package com.example.bindingtype.automation.viewmodel// com.example.bindingtype.automation.viewmodel.MainViewModel.kt

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bindingtype.R
import com.example.bindingtype.automation.Data

class MainViewModel : ViewModel() {
    private val tag: String = this::class.java.simpleName

    private val _timerLiveData = MutableLiveData<Long>()
    val timerLiveData: LiveData<Long> = _timerLiveData
    private val contactList = MutableLiveData<List<Data>>()

    private val timer = object : CountDownTimer(10000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            _timerLiveData.value = millisUntilFinished / 1000
                // Initialize with some sample data
                contactList.value = listOf(
                    Data("Agnes", "123-456-7890", R.drawable.c),
                    Data("Athul S Varghese", "987-654-3210", R.drawable.c),
                    Data("Athul Shaji", "987-654-3210", R.drawable.c)
                )
            //list()
        }

        override fun onFinish() {
            // Do something when the timer finishes
        }
    }

    init {
        // Start the timer when the view model is created
        timer.start()
    }

    override fun onCleared() {
        super.onCleared()
        // Cancel the timer when the view model is cleared
        timer.cancel()
    }
}
