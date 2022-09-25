package com.example.listview.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview.R
import com.example.listview.databinding.ItemBinding

class MyArrayAdapter(context: Context, var list: ArrayList<String>) :
    ArrayAdapter<String>(context, R.layout.item) {

    private val inflater = LayoutInflater.from(context)

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = ItemBinding.inflate(inflater, parent, false)
        binding.textView.text = list[position]
        return binding.root
    }
}