package com.example.step02_kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCk.setOnClickListener{
            Toast.makeText(applicationContext, "View Binding Java", Toast.LENGTH_SHORT).show()
        }

        btnMove.setOnClickListener{
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}
