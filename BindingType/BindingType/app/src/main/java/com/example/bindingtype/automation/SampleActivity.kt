package com.example.bindingtype.automation// com.example.bindingtype.automation.MainActivity.kt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingtype.automation.adapters.MyAdapter
import com.example.bindingtype.automation.viewmodel.MainViewModel
import com.example.bindingtype.R

class SampleActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        click()


    }

    override fun onResume() {
        super.onResume()
        adapter = MyAdapter(mainViewModel,this)
        recyclerView.adapter = adapter
    }

    private fun click() {
        val myButton:Button = findViewById(R.id.myButton)
        myButton.setOnClickListener {
            // Inside your current activity
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}
