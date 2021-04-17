package com.ltts.database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
                var k = Intent(this, MainActivity3::class.java)
                startActivity(k)

        }
        tvsignin.setOnClickListener {
            var v = Intent(this, MainActivity2::class.java)
            startActivity(v)

        }
    }
}


