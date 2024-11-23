//==============================================================================
// @Copyright (C) 2024. All rights reserved.
// Confidential - Restricted information. Do not disclose.
//------------------------------------------------------------------------------
package com.example.bindingtype.automation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingtype.R

class FirstAdapter(viewModel: FirstViewModel, activity: FirstActivity) : RecyclerView.Adapter<FirstAdapter.ViewHolder>() {

    private val tag: String = this::class.java.simpleName

        private var data: List<Data>? = listOf()// Initialize with an empty list

    init {
        viewModel.getContacts().observe(activity, Observer { contacts ->
          updateData(contacts)
        })
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_first, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val currentItem = data?.get(position)
            if (currentItem != null) {
                holder.bind(currentItem)
            }
        }

        override fun getItemCount(): Int {
            return data!!.size
        }

        // Update adapter data
        private fun updateData(newData: List<Data>) {
            data = newData
            notifyDataSetChanged()
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val nameTextView: TextView = itemView.findViewById(R.id.name)
            private val numberTextView: TextView = itemView.findViewById(R.id.number)
            private val imageView: ImageButton = itemView.findViewById(R.id.image)

            fun bind(data: Data) {
                nameTextView.text = data.name
                numberTextView.text = data.number
                imageView.setImageResource(data.image)
            }
        }
    }

