package com.tms.homeworkk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myhomework.R
import com.tms.Homework2.Garage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val Car = Garage.Cars()
        println(Car)
    }
}