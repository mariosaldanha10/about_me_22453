package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fifth_screen.*
import kotlin.system.exitProcess

class FifthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_screen)
        title = "about_me_22453"
    }
    fun exitApp(view: View){
        this@FifthScreen.finish()
        exitProcess(0)
    }
}



