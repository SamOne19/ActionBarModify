package com.samone.actionbarmodify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_just_a.*

class JustAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_just_a)

        button2.setOnClickListener {
            val intent = Intent(this, Child2Activity::class.java)
            Toast.makeText(this,"Going to child Activity",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

    }
}