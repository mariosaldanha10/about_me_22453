package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_screen.*

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)


        button_skills.setOnClickListener {

            goToThirdScreen()
        }
    }
    private fun goToThirdScreen(){

        var myThirdScreen = Intent(this, ThirdScreen::class.java)
        startActivity(myThirdScreen)
    }
}