package com.example.myhomework.gallery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.myhomework.R
import android.widget.Toast.makeText as makeText1

class MyAdapter(var context: Context, var images :IntArray): PagerAdapter() {
    var layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === "object" as LinearLayout
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view=layoutInflater.inflate(R.layout.item,container,false)
        val imageView= view.findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageResource(images[position])
        container.addView(view)

        imageView.setOnClickListener{ makeText1(context, "Images"+(position+1),
            Toast.LENGTH_LONG).show()
        }
        return view
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView("object" as LinearLayout)
    }

}