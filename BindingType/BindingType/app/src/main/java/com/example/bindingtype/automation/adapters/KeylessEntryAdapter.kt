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
import com.example.bindingtype.automation.KeylessEntryActivity
import com.example.bindingtype.R
import com.example.bindingtype.automation.Data
import com.example.bindingtype.automation.viewmodel.KeylessEntryViewModel

class KeylessEntryAdapter(viewModel: KeylessEntryViewModel, activity: KeylessEntryActivity) : RecyclerView.Adapter<KeylessEntryAdapter.ViewHolder>() {

   private val tag: String = this::class.java.simpleName

    private val contactList: List<Data> = viewModel.list()

    init {
        Log.d(tag, "initialized")
        viewModel.contacts.observe(activity, Observer {
            notifyDataSetChanged()
        })
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val number: TextView = itemView.findViewById(R.id.number)
        val image: ImageButton = itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     Log.d(tag, "onCreateViewHolder")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_keylessentry, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     Log.d(tag, "onBindViewHolder")
        val currentItem = contactList[position]
        holder.name.text = currentItem.name
        holder.number.text = currentItem.number
        holder.image.id = currentItem.image
    }

    override fun getItemCount(): Int {
     Log.d(tag, "getItemCount")
        return contactList.size
    }
}
