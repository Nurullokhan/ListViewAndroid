package com.example.listview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.adapters.MyArrayAdapter
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var list: ArrayList<String>

    private lateinit var adapter: MyArrayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //listview with "ArrayAdapter"
        list = ArrayList()
        list.add("Java")
        list.add("Kotlin")
        list.add("Android")
        //adapter

        /**
         * val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
         * binding.listView.adapter = arrayAdapter
         *
         *  binding.listView.setOnItemClickListener { adapterView, view, position, id ->
         *
         *   val intent = Intent(this, SecondActivity::class.java)
         *   intent.putExtra("name", list[position])
         *   startActivity(intent)
        }*/

        //listview with custom "ArrayAdapter"
        adapter = MyArrayAdapter(this, list)
        binding.listView.adapter = adapter

        /**
         * item remove from listview
         */
        binding.listView.setOnItemLongClickListener { adapterView, view, position, id ->
            list.removeAt(position)
            adapter.notifyDataSetChanged()
            true
        }

    }
}