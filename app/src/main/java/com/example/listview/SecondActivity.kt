package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv.text = intent.getStringExtra("name")

    }
}