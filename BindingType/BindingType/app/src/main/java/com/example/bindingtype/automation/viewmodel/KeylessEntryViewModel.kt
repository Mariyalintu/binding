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

class KeylessEntryViewModel: ViewModel() {
    private val tag: String = this::class.java.simpleName
    private val _contacts = MutableLiveData<List<Data>>()
    val contacts: LiveData<List<Data>> = _contacts

    fun list(): List<Data> {
        Log.d(tag, "list")
        // Simulate fetching data from a data source
        return listOf(

            Data("Agnes", "123-456-7890", R.drawable.c),
            Data("Athul S Varghese", "987-654-3210", R.drawable.c),
            Data("Athul Shaji", "987-654-3210", R.drawable.c),
            // Add more contacts as needed...
        )

    }

}
