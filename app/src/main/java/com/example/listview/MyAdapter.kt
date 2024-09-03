package com.example.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview.databinding.ItemBinding

class MyAdapter(
    private val context: Activity,
    private val array: Array<DataClass>
) : ArrayAdapter<DataClass>(
    context, R.layout.item, array
) {
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ItemBinding = ItemBinding.inflate(context.layoutInflater)
        binding.imgCountry.setImageResource(array[position].image)
        binding.txtCountryName.text = array[position].CountryName
        binding.txtCountryContinent.text = array[position].secondName
        return binding.root
    }
}