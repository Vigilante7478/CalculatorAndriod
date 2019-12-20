package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.setOnClickListener(){
            val n1: Int = no1.getText().toString().toInt()
            val n2: Int = no2.getText().toString().toInt()

            val n3: Int = n1 + n2
            ans.setText(n3.toString())
        }

        sub.setOnClickListener(){
            val n1: Int = no1.getText().toString().toInt()
            val n2: Int = no2.getText().toString().toInt()

            val n3: Int = n1 - n2
            ans.setText(n3.toString())
        }
    }
}
