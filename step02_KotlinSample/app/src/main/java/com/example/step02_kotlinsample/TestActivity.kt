package com.example.step02_kotlinsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_test.*
import java.util.*

class TestActivity  : AppCompatActivity(){
    var a:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test)
        val tz = TimeZone.getTimeZone("Asia/Seoul")
        val gc = GregorianCalendar(tz)
        var hour= gc.get(GregorianCalendar.HOUR).toString()
        var min = gc.get(GregorianCalendar.MINUTE).toString()
        var sec = gc.get(GregorianCalendar.SECOND).toString()
        tv1.setText(hour+":"+min+":"+sec)

        btn1.setOnClickListener(){
            a+=1
            tv2.text = a.toString()+"Click!"
        }




    }
}