//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.bindingtype.automation.viewmodel.ElectricParkingBreakViewModel
import com.example.bindingtype.automation.adapters.ElectricParkingBreakAdapter
import com.example.bindingtype.databinding.ActivityElectricparkingbreakBinding

class ElectricParkingBreakActivity : AppCompatActivity() {
    private val tag:String = this::class.java.simpleName
    private lateinit var binding: ActivityElectricparkingbreakBinding
    private lateinit var viewModel :ElectricParkingBreakViewModel
    private lateinit var adapter: ElectricParkingBreakAdapter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, " onCreate")
        viewModel = ViewModelProvider(this)[ElectricParkingBreakViewModel::class.java]
        binding = ActivityElectricparkingbreakBinding.inflate(layoutInflater)
        adapter = ElectricParkingBreakAdapter(viewModel, this)
        binding.recyclerView.adapter
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, " onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, " onResume")

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
