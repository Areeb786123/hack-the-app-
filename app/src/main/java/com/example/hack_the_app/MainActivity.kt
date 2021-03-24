package com.example.hack_the_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var pass: EditText
    lateinit var login_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        pass = findViewById(R.id.pass)
        login_btn = findViewById(R.id.login_btn)
        //val name1: String = name.text.toString()


        val a = "Nahamcom"
        val b = "pink_panther@786"
        //val pass1: String = pass.text.toString()

        login_btn.setOnClickListener {

            login_btn.setOnClickListener {
                if (name.text.toString().equals(a) || pass.text.toString().equals(b)) {
                    val flag_intent = Intent(this, flag::class.java)
                    startActivity(flag_intent)
                } else {
                    val toast = Toast.makeText(applicationContext, "ERROR", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }


        }


    }
}