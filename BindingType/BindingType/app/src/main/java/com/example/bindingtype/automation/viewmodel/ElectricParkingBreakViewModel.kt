//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation.viewmodel
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bindingtype.automation.Data
import com.example.bindingtype.R

class ElectricParkingBreakViewModel: ViewModel() {
    private val tag: String = this::class.java.simpleName
    private val contactList = MutableLiveData<List<Data>>()

    init {
        Log.d(tag, "Initialized")
        // Initialize with some sample data
        contactList.value = listOf(
            Data("Agnes", "123-456-7890", R.drawable.c),
            Data("Athul S Varghese", "987-654-3210", R.drawable.c),
            Data("Athul Shaji", "987-654-3210", R.drawable.c)
        )
    }

    fun getContacts(): LiveData<List<Data>> {
        return contactList
    }
}

