package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.example.quizapp.Result

class QUIZQuestions : AppCompatActivity(), View.OnClickListener {

    private var global_current_posit:Int=1
    private var global_questions_list:ArrayList<Question>?=null
    private var global_selected_option_pos:Int=0

    private var userName:String?=null
    private var correctAnsNum:Int=0


    private var progressBar:ProgressBar?=null
    private var tvProgress:TextView?=null
    private var tvQue:TextView?=null
    private var ivFlag:ImageView?=null

    private var tvoption1:TextView?=null
    private var tvoption2:TextView?=null
    private var tvoption3:TextView?=null
    private var tvoption4:TextView?=null

    private var submitButton: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestions)

        userName=intent.getStringExtra(Constants.USER_NAME)

        progressBar=findViewById(R.id.progressbar)
        tvProgress=findViewById(R.id.tv_progress)
        tvQue=findViewById(R.id.tv_que)
        ivFlag=findViewById(R.id.iv_flag)

        tvoption1=findViewById(R.id.optionOne)
        tvoption2=findViewById(R.id.optionTwo)
        tvoption3=findViewById(R.id.optionThree)
        tvoption4=findViewById(R.id.optionFour)

        submitButton=findViewById(R.id.btnstart)

        global_questions_list=Constants.getQuestions()

        tvoption1?.setOnClickListener(this)
        tvoption2?.setOnClickListener(this)
        tvoption3?.setOnClickListener(this)
        tvoption4?.setOnClickListener(this)

        submitButton?.setOnClickListener(this)

        setQuestion()

    }

    private fun setQuestion() {
        defaultOptionsBorder()

        var currentQuestion: Question = global_questions_list!![global_current_posit - 1]
        ivFlag?.setImageResource(currentQuestion.img)
        progressBar?.progress = global_current_posit
        tvProgress?.text = "${global_current_posit}/${progressBar?.max}"
        tvQue?.text = currentQuestion.que
        tvoption1?.text = currentQuestion.opt1
        tvoption2?.text = currentQuestion.opt2
        tvoption3?.text = currentQuestion.opt3
        tvoption4?.text = currentQuestion.opt4

        if(global_current_posit==global_questions_list!!.size){
            submitButton?.text="FINISH"
        }
        else
        {
            submitButton?.text="SUBMIT"
        }

    }

    private fun defaultOptionsBorder(){
        val options=ArrayList<TextView>()

        tvoption1?.let{
            options.add(0,it)
        }
        tvoption2?.let{
            options.add(1,it)
        }
        tvoption3?.let{
            options.add(2,it)
        }
        tvoption4?.let{
            options.add(3,it)
        }

        for(x in options){
            x.setTextColor(Color.parseColor("#48cae4"))
            x.typeface= Typeface.DEFAULT
            x.background=ContextCompat.getDrawable(
                this,
                R.drawable.default_bg
            )
        }

    }

    private fun selectedOptionBorder(tv:TextView,selectedOptionNum:Int){
        defaultOptionsBorder()
        global_selected_option_pos=selectedOptionNum
        tv.setTextColor(Color.parseColor("#003049"))
        tv.setTypeface(tv.typeface,Typeface.BOLD_ITALIC)
        tv.background=ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_color
        )
    }

    override fun onClick(view: View?) {
      when(view?.id){

          R.id.optionOne->{
              tvoption1?.let{
                  selectedOptionBorder(it,1)
              }
          }

          R.id.optionTwo->{
              tvoption2?.let{
                  selectedOptionBorder(it,2)
              }
          }

          R.id.optionThree->{
              tvoption3?.let{
                  selectedOptionBorder(it,3)
              }
          }
          R.id.optionFour->{
              tvoption4?.let{
                  selectedOptionBorder(it,4)
              }
          }

          R.id.btnstart->{

              // WHEN WE DIRECTLY PRESS SUBMIT BUTTON WITHOUT SELECTING ANY OPTION OUT OF 4
              // ALSO WHEN ONE OPTION IS SELECTED THEN AT END
              // SUBMIT BUTTON WILL BECOME GO TO NEXT QUESTION AND WHEN WE CLICK ON IT
              // WE WILL COME HERE and increment global_current_posit by 1
              // So now we can access the next question

              if(global_selected_option_pos==0){
                  global_current_posit++

                  when{
                      global_current_posit<=global_questions_list!!.size->{
                          setQuestion()
                      }
                      else->{
                         /* Toast.makeText(this,
                          "End of the quiz",
                          Toast.LENGTH_LONG).show()*/

                          var intent= Intent(this,Result::class.java)
                          intent.putExtra(Constants.USER_NAME,userName)
                          intent.putExtra(Constants.CORRECT_ANS,correctAnsNum)
                          intent.putExtra(Constants.TOTAL_QUE,global_questions_list!!.size)
                          startActivity(intent)
                          finish()

                      }
                  }

              }

              else{
                  val queS=global_questions_list?.get(global_current_posit-1)
                  if(queS!!.correctAns!=global_selected_option_pos)
                  {
                      answerCheck(global_selected_option_pos,R.drawable.wrong_bg)
                  }
                  else
                  {
                      correctAnsNum++
                  }
                  answerCheck(queS.correctAns,R.drawable.correct_bg)

                  if(global_current_posit==global_questions_list!!.size){
                      submitButton?.text="FINISH"
                  }
                  else
                  {
                      submitButton?.text="GO TO NEXT QUESTION"
                  }
                  global_selected_option_pos=0


              }



          }

      }


    }

    private fun answerCheck(ans:Int,drawableView:Int){
        when(ans){
            1->{
                tvoption1?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }

            2->{
                tvoption2?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }

            3->{
                tvoption3?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }

            4->{
                tvoption4?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }

    }



}