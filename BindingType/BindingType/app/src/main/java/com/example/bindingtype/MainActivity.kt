package com.example.bindingtype

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bindingtype.automation.AutoWiperSensitivityActivity
import com.example.bindingtype.automation.ElectricParkingBreakActivity
import com.example.bindingtype.automation.SampleActivity
import com.example.bindingtype.automation.fragments.AutoWiperSensitivityFragment
import com.example.bindingtype.databinding.ActivityMainBinding
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        click()
    }

    private fun click() {
        binding.myButton.setOnClickListener {
            // Inside your current activity
            val intent = Intent(this, SampleActivity::class.java)
            startActivity(intent)
            // Replace the fragment with a new instance of com.example.autogenerate.MyFragment
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainer, AutoWiperSensitivityFragment())
//                .addToBackStack(null)
//                .commit()
        }
    }
}