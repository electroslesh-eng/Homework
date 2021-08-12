package com.example.myhomework.gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.myhomework.R
import com.example.myhomework.gallery.adapter.MyAdapter

class MainActivity : AppCompatActivity() {

    var viewPager: ViewPager? = null
    var images= intArrayOf(R.drawable.and,R.drawable.index,R.drawable.indexs,R.drawable.logo)
    var myAdapter: MyAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager= findViewById(R.id.viewPager)
        myAdapter=MyAdapter(this,images)
        viewPager!!.adapter = myAdapter
    }
}