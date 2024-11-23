//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import androidx.lifecycle.Observer
import com.example.bindingtype.automation.AutoWiperSensitivityActivity
import com.example.bindingtype.R
import com.example.bindingtype.automation.Data
import com.example.bindingtype.automation.viewmodel.AutoWiperSensitivityViewModel

class AutoWiperSensitivityAdapter(viewModel: AutoWiperSensitivityViewModel, activity: AutoWiperSensitivityActivity) : RecyclerView.Adapter<AutoWiperSensitivityAdapter.ViewHolder>() {

   private val tag: String = this::class.java.simpleName

    private var data: List<Data>? = listOf()// Initialize with an empty list

    init {
        Log.d(tag, "initialized")
        viewModel.getContacts().observe(activity, Observer { contacts ->
            updateData(contacts)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(tag, "initialized")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_autowipersensitivity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(tag, "onBindViewHolder")
        val currentItem = data?.get(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }

    override fun getItemCount(): Int {
        Log.d(tag, "getItemCount")
        return data!!.size
    }

    // Update adapter data
    private fun updateData(newData: List<Data>) {
        Log.d(tag, "updateData")
        data = newData
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.name)
        private val numberTextView: TextView = itemView.findViewById(R.id.number)
        private val imageView: ImageButton = itemView.findViewById(R.id.image)

        fun bind(data: Data) {
            Log.d(tag, "bind")
            nameTextView.text = data.name
            numberTextView.text = data.number
            imageView.setImageResource(data.image)
        }
    }
}

