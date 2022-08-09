package com.hyosang.twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getdata = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)
        
        // Toast.makeText(this,getdata, Toast.LENGTH_LONG).show()

        if(getdata =="1"){
            memberImage.setImageResource(R.drawable.member_1)
        }
        if(getdata =="2"){
            memberImage.setImageResource(R.drawable.member_2)
        }
        if(getdata =="3"){
            memberImage.setImageResource(R.drawable.member_3)
        }
        if(getdata =="4"){
            memberImage.setImageResource(R.drawable.member_4)
        }
        if(getdata =="5"){
            memberImage.setImageResource(R.drawable.member_5)
        }
        if(getdata =="6"){
            memberImage.setImageResource(R.drawable.member_6)
        }
        if(getdata =="7"){
            memberImage.setImageResource(R.drawable.member_7)
        }
        if(getdata =="8"){
            memberImage.setImageResource(R.drawable.member_8)
        }
        if(getdata =="9"){
            memberImage.setImageResource(R.drawable.member_9)
        }
    }
}