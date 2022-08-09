package com.hyosang.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tw1 = findViewById<ImageView>(R.id.member1)
        var tw2 = findViewById<ImageView>(R.id.member2)
        var tw3 = findViewById<ImageView>(R.id.member3)
        var tw4 = findViewById<ImageView>(R.id.member4)
        var tw5 = findViewById<ImageView>(R.id.member5)
        var tw6 = findViewById<ImageView>(R.id.member6)
        var tw7 = findViewById<ImageView>(R.id.member7)
        var tw8 = findViewById<ImageView>(R.id.member8)
        var tw9 = findViewById<ImageView>(R.id.member9)

        tw1.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            startActivity(intent)
        }
        tw2.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }
        tw3.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }
        tw4.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }
        tw5.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }
        tw6.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }
        tw7.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }
        tw8.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)
        }
        tw9.setOnClickListener {
            var intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","9")
            startActivity(intent)
        }

    }
}