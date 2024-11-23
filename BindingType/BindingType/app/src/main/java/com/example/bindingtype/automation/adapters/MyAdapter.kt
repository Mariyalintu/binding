package com.example.bindingtype.automation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.bindingtype.automation.SampleActivity
import com.example.bindingtype.automation.viewmodel.MainViewModel
import com.example.bindingtype.R

class MyAdapter(viewModel: MainViewModel, activity: SampleActivity) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private var time: Long = 0

    init {
        viewModel.timerLiveData.observe(activity, Observer { time ->
            // Update the adapter with the new time
            updateTime(time)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(time)
    }

    override fun getItemCount(): Int {
        return 1 // Assuming only one item in the list
    }

    fun updateTime(newTime: Long) {
        time = newTime
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val timerTextView: TextView = itemView.findViewById(R.id.timerTextView)

        fun bind(time: Long) {
            timerTextView.text = time.toString()
        }
    }
}
