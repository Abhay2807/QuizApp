package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button =findViewById(R.id.BtnStart)
        val name: EditText=findViewById(R.id.InputName)


        btnStart.setOnClickListener{
         if(name.text.isEmpty())
         {
             Toast.makeText(this,
                 "Please Enter Your Name!!!",
                 Toast.LENGTH_SHORT).show()
         }
            else
         {
             // In order to move from 1 activity to an another activity we need to create an intent
                // Intent(activity1(source),activity2(destination))
             val intent=Intent(this,QUIZQuestions::class.java)
             intent.putExtra(Constants.USER_NAME,name.text.toString())
             startActivity(intent)  // move to the 2nd activity
             finish() //Closes the current screen( 1st/Source Activity )
         }
        }

    }
}