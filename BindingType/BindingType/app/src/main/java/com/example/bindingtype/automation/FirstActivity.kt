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

class FirstActivity : AppCompatActivity() {
    private val tag: String = this::class.java.simpleName
    private lateinit var mainViewModel: FirstViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FirstAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")
        setContentView(R.layout.activity_first)
        mainViewModel = ViewModelProvider(this)[FirstViewModel::class.java]

        recyclerView = findViewById(R.id.recyclerView)
        adapter = FirstAdapter(mainViewModel,this)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        adapter = FirstAdapter(mainViewModel,this)
        recyclerView.adapter = adapter
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
