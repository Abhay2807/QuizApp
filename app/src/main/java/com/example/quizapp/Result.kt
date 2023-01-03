package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName:TextView=findViewById(R.id.username)
        var tvScore:TextView=findViewById(R.id.score)
        var btnReturn:Button=findViewById(R.id.returnApp)
        var btnFinish:Button=findViewById(R.id.finishApp)



        tvName.text=intent.getStringExtra(Constants.USER_NAME)
        var correct_ans:Int=intent.getIntExtra(Constants.CORRECT_ANS,0)
        var total_que:Int=intent.getIntExtra(Constants.TOTAL_QUE,0)

        tvScore.text="Your Score is ${correct_ans} out of ${total_que} "

        btnReturn.setOnClickListener{
            var intent1= Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }

        btnFinish.setOnClickListener{
            finish()
        }


    }
}