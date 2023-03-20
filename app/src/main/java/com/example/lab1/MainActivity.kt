package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1=findViewById<TextView>(R.id.textView2)
        val text2=findViewById<TextView>(R.id.textView3)
        val text3=findViewById<TextView>(R.id.textView4)
        val button1=findViewById<Button>(R.id.button)
        val button2=findViewById<Button>(R.id.button3)
        val button3=findViewById<Button>(R.id.button2)


        val image1=resources.getIdentifier("cat1","drawable",packageName)
        val image2=resources.getIdentifier("cat3","drawable",packageName)
        val image3=resources.getIdentifier("cat2","drawable",packageName)
        var cat1=Animal("Мурзик",5,"Сіресенький грайливий котик")
        var cat2=Animal("Пончик",5,"Сіренький повненький котик")
        var cat3=Animal("Пако",5,"Білесенький котик")
        text1.text=cat1.name;
        text2.text=cat3.name;
        text3.text=cat2.name;
        button1.setOnClickListener {
            goactivity(image1,cat1)
        }
        button2.setOnClickListener {
            goactivity(image2,cat2)
        }
        button3.setOnClickListener {
            goactivity(image3,cat3)
        }





    }
    fun goactivity(image:Int, cat:Animal){

        startActivity(Intent(this, card::class.java).apply {
            putExtra("name",cat.name)
            putExtra("desc",cat.description)
            putExtra("image",image)

        }
        )

        //val image1 = findViewById<ImageView>(R.id.imageView4)
       // val nameText = findViewById<TextView>(R.id.textView)
       // val descriptionText = findViewById<TextView>(R.id.textView5)
       // nameText.text=cat.name
      //  descriptionText.text=cat.description
     //   image1.setImageResource(image)
    }
}