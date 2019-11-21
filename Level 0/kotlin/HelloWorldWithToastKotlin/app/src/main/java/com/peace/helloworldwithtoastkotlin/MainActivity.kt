package com.peace.helloworldwithtoastkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
//Kotlin automatically Binds Views with objects

class MainActivity : AppCompatActivity() {

    //private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btn=findViewById(R.id.button)
        //here button is the button in the xml file
        button.setOnClickListener{
            //in Java we used editText.getText() now we simply use editText.text
            Toast.makeText(applicationContext,"Hello World From Kotlin "+editText.text,Toast.LENGTH_SHORT).show()
        }
    }

}
