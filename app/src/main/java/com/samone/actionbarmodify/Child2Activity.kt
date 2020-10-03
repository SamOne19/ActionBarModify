package com.samone.actionbarmodify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Child2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}