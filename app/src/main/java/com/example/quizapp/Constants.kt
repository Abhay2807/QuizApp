package com.example.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUE:String="total_que"
    const val CORRECT_ANS:String="correct_ans"


    fun getQuestions():ArrayList<Question>{

        val questionsList=ArrayList<Question>()

        val que1=Question(
            1,
            "Which country does the flag belong to?",
            R.drawable.ic_albania,
            "Angola",
            "Algeria",
            "Albania",
            "Andorra",
            3
        )

        questionsList.add(que1)

        val que2=Question(
            2,
            "Which country does the flag belong to?",
            R.drawable.ic_baha,
            "Bahamas",
            "Benin",
            "Belize",
            "Bhutan",
            1
        )

        questionsList.add(que2)

        val que3=Question(
            3,
            "Which country does the flag belong to?",
            R.drawable.ic_cam,
            "Cabo Verde",
            "Cambodia",
            "Cameroon",
            "Canada",
            3
        )

        questionsList.add(que3)

        val que4=Question(
            4,
            "Which country does the flag belong to?",
            R.drawable.ic_egy,
            "Ecuador" ,
                    "Egypt" ,
                    "El Salvador" ,
                    "Equatorial Guinea",

            2
        )

        questionsList.add(que4)

        val que5=Question(
            5,
            "Which country does the flag belong to?",
            R.drawable.ic_fizi,
            "Fiji",
                    "Finland",
                    "France" ,
            "England" ,


            1
        )

        questionsList.add(que5)

        val que6=Question(
            6,
            "Which country does the flag belong to?",
            R.drawable.ic_isr,
            "Iraq",
                    "Ireland",
                    "Israel",
                    "Italy",


            3
        )

        questionsList.add(que6)

        val que7=Question(
            7,
            "Which country does the flag belong to?",
            R.drawable.ic_mon,
            "Mexico",
                    "Micronesia",
                    "Moldova",
                    "Monaco",



            4
        )

        questionsList.add(que7)

        val que8=Question(
            8,
            "Which country does the flag belong to?",
            R.drawable.ic_rwa,
            "Republic of the Congo" ,
                    "Romania" ,
                    "Russia" ,
                    "Rwanda",




            4
        )

        questionsList.add(que8)

        val que9=Question(
            9,
            "Which country does the flag belong to?",
            R.drawable.ic_kir,
            "Kiribati" ,
                    "Korea" ,
                    "Kosovo" ,
                    "Kuwait" ,

            1
        )

        questionsList.add(que9)

        val que10=Question(
            10,
            "Which country does the flag belong to?",
            R.drawable.ic_sm,
            "Saint Lucia" ,
                    "Saint Vincent and the Grenadines" ,
                    "Samoa",
                    "San Marino" ,


            4
        )

        questionsList.add(que10)


        val que11=Question(
            11,
            "Which country does the flag belong to?",
            R.drawable.ic_nic,
            "New Zealand" ,
                    "Nicaragua" ,
                    "Niger" ,
                    "Nigeria" ,

            2
        )

        questionsList.add(que11)

        val que12=Question(
            12,
            "Which country does the flag belong to?",
            R.drawable.ic_tan,
            "Tajikistan" ,
                    "Tanzania" ,
                    "Thailand" ,
                    "Timor-Leste" ,


            2
        )

        questionsList.add(que12)

        val que13=Question(
            13,
            "Which country does the flag belong to?",
            R.drawable.ic_libya,
            "Liberia" ,
                    "Libya" ,
                    "Liechtenstein" ,
                    "Lithuania" ,



            2
        )

        questionsList.add(que13)

        val que14=Question(
            14,
            "Which country does the flag belong to?",
            R.drawable.ic_ind,
            "INDIA" ,
            "IRAQ" ,
            "IRAN" ,
            "INDONESIA" ,



            1
        )

        questionsList.add(que14)

        val que15=Question(
            15,
            "Which country does the flag belong to?",
            R.drawable.ic_zam,
            "YEMEN" ,
            "IRAQ" ,
            "Zambia" ,
                    "Zimbabwe" ,



            3
        )

        questionsList.add(que15)

        val que16=Question(
            16,
            "Which country does the flag belong to?",
            R.drawable.ic_ghana,
            "Georgia" ,
                    "Germany" ,
                    "Ghana" ,

                    "Greece" ,




            3
        )

        questionsList.add(que16)

        val que17=Question(
            17,
            "Which country does the flag belong to?",
            R.drawable.ic_pal,

            "Pakistan" ,
                    "Palau" ,
                    "Panama",
                    "Papua New Guinea",

            2
        )

        questionsList.add(que17)

        val que18=Question(
            18,
            "Which country does the flag belong to?",
            R.drawable.ic_dom,

            "Democratic Republic of the Congo" ,
                    "Denmark" ,
                    "Djibouti" ,
                    "Dominica" ,


            4
        )



        questionsList.add(que18)

        val que19=Question(
            19,
            "Which country does the flag belong to?",
            R.drawable.ic_hk,

            "Holy See" ,
                    "Honduras" ,
                    "Hungary" ,
            "Hong Kong" ,



            4
        )



        questionsList.add(que19)


        val que20=Question(
            20,
            "Which country does the flag belong to?",
            R.drawable.ic_dom,

            "Democratic Republic of the Congo" ,
            "Denmark" ,
            "Djibouti" ,
            "Dominica" ,


            4
        )



        questionsList.add(que20)


        return questionsList
    }
}