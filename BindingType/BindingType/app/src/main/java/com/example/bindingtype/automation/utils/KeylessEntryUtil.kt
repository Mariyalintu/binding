//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation.utils

import android.content.Context
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.View
import com.example.bindingtype.R

class KeylessEntryUtil(context: Context, view: View) {
    private val tag:String = this::class.java.simpleName
    private val requireContext = context

    init {
        Log.d(tag, "KeylessEntryUtil initialized")
        val myButton: Button = view.findViewById(R.id.myButton)
        clickListener(myButton)
    }

    private fun clickListener(myButton: Button) {
        Log.d(tag, "KeylessEntryUtil clickListener")
        myButton.setOnClickListener {
            showToast("Button in KeylessEntryFragment clicked!")
        }
    }

    private fun showToast(message: String) {
        Log.d(tag, "KeylessEntryUtil showToast")
        Toast.makeText(requireContext, message, Toast.LENGTH_SHORT).show()
    }
}
