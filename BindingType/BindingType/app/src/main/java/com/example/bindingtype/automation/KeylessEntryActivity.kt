//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.bindingtype.automation.viewmodel.KeylessEntryViewModel
import com.example.bindingtype.automation.adapters.KeylessEntryAdapter
import com.example.bindingtype.databinding.ActivityKeylessentryBinding

class KeylessEntryActivity : AppCompatActivity() {
    private val tag:String = this::class.java.simpleName
    private lateinit var binding: ActivityKeylessentryBinding
    private lateinit var viewModel :KeylessEntryViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, " onCreate")
        viewModel = ViewModelProvider(this)[KeylessEntryViewModel::class.java]
        binding = ActivityKeylessentryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, " onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, " onResume")
        binding.recyclerView.adapter = KeylessEntryAdapter(viewModel, this)
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, " onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, " onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, " onDestroy")
    }
}
