package com.example.listview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listItems = arrayOf(
            DataClass(R.drawable.gray, "USA", "North America"),
            DataClass(R.drawable.gray, "Iran", "Asia"),
            DataClass(R.drawable.gray, "Brazil", "South America"),
            DataClass(R.drawable.gray, "Germany", "Europe"),
            DataClass(R.drawable.gray, "Kenya", "Africa"),
            DataClass(R.drawable.gray, "Australia", "Australia"),
        )

        //listview with custom "ArrayAdapter"
        binding.ListView.adapter = MyAdapter(this, listItems)
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


        /*binding.listView.setOnItemLongClickListener { adapterView, view, position, id ->
            list.removeAt(position)
            adapter.notifyDataSetChanged()
            true
        }*/

    }
}