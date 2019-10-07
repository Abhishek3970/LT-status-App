package com.example.testspinner

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

       lateinit var day: String
       lateinit var time: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        val str=arrayOf("Chose Day:","Monday","Tuesday","Wednesday","Thursday","Friday")
        var daySelectied: String = ""
        var timeSelectied: String = ""

        spinner1.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                textView1.text="Nothing"

            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {


                    val temp = str[p2]
                    daySelectied = temp
                    day=daySelectied
                    textView1.text = "Day:$temp"
                    //   spinner2.visibility = View.VISIBLE
                    onClick(daySelectied)


            }

        }
        spinner1.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            str
        )








        val str3=arrayOf("Chose time slot:","8:30-9:30","9:30-10:15","10:15-11:00","11:00-11:45","11:45-12:30","12:30-1:15","1:15-2:00","2:00-2:45","2:45-3:30")

        spinner3.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            @SuppressLint("SetTextI18n")
            override fun onNothingSelected(p0: AdapterView<*>?) {
                textView2.text="Nothing"

            }

            @SuppressLint("SetTextI18n")
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val temp=str3[p2]
                textView2.text= "S3 Time Slot:$temp"
                timeSelectied=temp
                time=timeSelectied
            }

        }


        spinner3.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            str3
        )


            val str1=arrayOf("Chose time slot:","8:30-9:30","9:30-10:30","10:30-11:30","11:30-12:30","12:30-1:30","1:30-2:30","2:30-3:30","3:30-4:30","4:30-5:30")

            spinner2.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
                @SuppressLint("SetTextI18n")
                override fun onNothingSelected(p0: AdapterView<*>?) {
                    textView2.text="Nothing"

                }

                @SuppressLint("SetTextI18n")
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    val temp=str1[p2]
                    textView2.text= "S2 Time Slot:$temp"
                    timeSelectied=temp
                    time=timeSelectied
                }

            }


            spinner2.adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                str1
            )









        }

    private fun onClick(daySelected: Any) {


        if(daySelected=="Wednesday") {
            spinner3.visibility = View.VISIBLE
            spinner2.visibility = View.INVISIBLE
        }
        else {
            spinner2.visibility = View.VISIBLE
            spinner3.visibility = View.INVISIBLE
        }


    }

    @SuppressLint("SetTextI18n")
    fun buttonClick(view: View) {       //Fill this using if else day,time

        if(day=="Chose Day:" || time=="Chose time slot:")
            Toast.makeText(this, "Enter valid day and time slot", Toast.LENGTH_SHORT).show()
        else{

            if(day=="Monday"){
                when(time){
                    "8:30-9:30"->textView7.text="LT2\nLT3\nLT5\nLT6\nLT7\nLT8\n"
                    "9:30-10:30"->textView7.text="LT6\n"
                    "10:30-11:30"->textView7.text="No LT empty.."
                    "11:30-12:30"->textView7.text="No LT empty.."
                    "12:30-1:30"->textView7.text="LT5\nLT6\n"
                    "1:30-2:30"->textView7.text="LT2\nLT3\nLT4\nLT6\nLT7\nLT8\n"
                    "2:30-3:30"->textView7.text="LT3\nLT6\n"
                    "3:30-4:30"->textView7.text="LT6\nLT7\n"
                    "4:30-5:30"->textView7.text="LT2\nLT7\n"
                }

            }
            else if(day=="Tuesday"){
                when(time){
                    "8:30-9:30"->textView7.text="LT2\nLT3\nLT5\nLT6\nLT7\nLT8\n"
                    "9:30-10:30"->textView7.text="No LT empty.."
                    "10:30-11:30"->textView7.text="No LT empty.."
                    "11:30-12:30"->textView7.text="LT3\n"
                    "12:30-1:30"->textView7.text="LT2\nLT3\nLT4\nLT5\nLT6\n"
                    "1:30-2:30"->textView7.text="LT4\nLT7\n"
                    "2:30-3:30"->textView7.text="LT6\n"
                    "3:30-4:30"->textView7.text="LT3\nLT6\nLT8\n"
                    "4:30-5:30"->textView7.text="LT2\nLT5\nLT6\n"
                }
            }
            else if(day=="Wednesday"){
                when(time){
                    "8:30-9:30"->textView7.text="LT1\nLT2\nLT3\nLT6\nLT7\nLT8\n"
                    "9:30-10:15"->textView7.text="LT1\n"
                    "10:15-11:00"->textView7.text="No LT empty.."
                    "11:00-11:45"->textView7.text="LT8\n"
                    "11:45-12:30"->textView7.text="No LT empty.."
                    "12:30-1:15"->textView7.text="LT3\nLT4\nLT5\n"
                    "1:15-2:00"->textView7.text="No LT empty.."
                    "2:00-3:45"->textView7.text="LT6\n"
                    "2:45-3:30"->textView7.text="LT6\n"
                }
            }
            else if(day=="Thursday"){
                when(time){
                    "8:30-9:30"->textView7.text="LT1\nLT3\nLT4\nLT6\nLT7\nLT8\n"
                    "9:30-10:30"->textView7.text="No LT empty.."
                    "10:30-11:30"->textView7.text="LT6\nLT8\n"
                    "11:30-12:30"->textView7.text="LT3\nLT4\nLT6\n"
                    "12:30-1:30"->textView7.text="LT1\nLT4\nLT6\nLT8\n"
                    "1:30-2:30"->textView7.text="LT6\n"
                    "2:30-3:30"->textView7.text="No LT empty.."
                    "3:30-4:30"->textView7.text="LT8\n"
                    "4:30-5:30"->textView7.text="LT1\nLT7\nLT8\n"
                }
            }
            else if(day=="Friday"){
                when(time){
                    "8:30-9:30"->textView7.text="LT1\nLT3\nLT4\nLT6\nLT7\nLT8\n"
                    "9:30-10:30"->textView7.text="No LT empty.."
                    "10:30-11:30"->textView7.text="No LT empty.."
                    "11:30-12:30"->textView7.text="No LT empty.."
                    "12:30-1:30"->textView7.text="LT4\nLT5\nLT6\n"
                    "1:30-2:30"->textView7.text="LT2\nLT3\n"
                    "2:30-3:30"->textView7.text="LT3\nLT6\n"
                    "3:30-4:30"->textView7.text="LT3\nLT6\nLT8\n"
                    "4:30-5:30"->textView7.text="LT1\nLT2\nLT3\n"
                }
            }
        }
    }


}


//"8:30-9:30","9:30-10:30","10:30-11:30","11:30-12:30","12:30-1:30","1:30-2:30","2:30-3:30","3:30-4:30","4:30-5:30"
//"Monday","Tuesday","Wednesday","Thursday","Friday"
//"8:30-9:30","9:30-10:15","10:15-11:00","11:00-11:45","11:45-12:30","12:30-1:15","1:15-2:00","2:00-3:45","2:45-3:30"