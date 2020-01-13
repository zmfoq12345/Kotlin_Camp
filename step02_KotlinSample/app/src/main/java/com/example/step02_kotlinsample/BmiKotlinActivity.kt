package com.example.step02_kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiKotlinActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        btnBMI.setOnClickListener(){
            val tall = editTall.text.toString().toDouble()
            val weight = editWeight.text.toString().toDouble()
            val bmi = weight/Math.pow(tall/100, 2.0)

            resultLabel.text =
                    "키 : ${editTall.text.toString()}\n" +
                    "체중 : ${editWeight.text.toString()} \n" +
                    "BMI : $bmi"
        }
    }
}