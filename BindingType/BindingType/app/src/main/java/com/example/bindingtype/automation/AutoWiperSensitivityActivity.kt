//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingtype.R
import com.example.bindingtype.automation.adapters.AutoWiperSensitivityAdapter
import com.example.bindingtype.automation.viewmodel.AutoWiperSensitivityViewModel

class AutoWiperSensitivityActivity : AppCompatActivity() {
    private val tag:String = this::class.java.simpleName
   // private lateinit var binding: ActivityAutowipersensitivityBinding
    private lateinit var viewModel :AutoWiperSensitivityViewModel
    private lateinit var adapter :AutoWiperSensitivityAdapter
    private lateinit var recyclerView: RecyclerView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, " onCreate")
            setContentView(R.layout.activity_autowipersensitivity)
            viewModel = ViewModelProvider(this)[AutoWiperSensitivityViewModel::class.java]

            recyclerView = findViewById(R.id.recyclerView)
            adapter = AutoWiperSensitivityAdapter(viewModel,this)

            recyclerView.layoutManager = LinearLayoutManager(this)
        }

        override fun onStart() {
            super.onStart()
            Log.d(tag, "onStart")
        }

        override fun onResume() {
            super.onResume()
//            adapter = AutoWiperSensitivityAdapter(viewModel,this)
//            recyclerView.adapter = adapter
            Log.d(tag, "onResume")
        }

        override fun onPause() {
            super.onPause()
            Log.d(tag, "onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d(tag, "onStop")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(tag, "onDestroy")
        }
    }
