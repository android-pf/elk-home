package com.pf.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pf.export_home.HomeARS

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HomeARS.navHome("", "")
    }
}