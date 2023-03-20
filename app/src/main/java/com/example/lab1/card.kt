package com.example.lab1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val extras = intent.extras
        val imaq = extras!!.getInt("image",1)
            val name = extras?.getString("name")
            val desc = extras?.getString("desc")


        val imagecat=findViewById<ImageView>(R.id.imageView4)
        val namecat=findViewById<TextView>(R.id.textView)
        val desccat=findViewById<TextView>(R.id.textView5)
        namecat.text=name
        imagecat.setImageResource(imaq)
        desccat.text=desc



    }
}