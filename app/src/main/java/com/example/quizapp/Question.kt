package com.example.quizapp

data class Question(
val id:Int,
val que:String,
val img:Int,
val opt1:String,
val opt2:String,
val opt3:String,
val opt4:String,
val correctAns:Int
)
