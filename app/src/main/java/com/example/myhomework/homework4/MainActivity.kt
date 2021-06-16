package com.example.myhomework.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myhomework.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        fun work() {
            println("John работает")
        }
    }
}