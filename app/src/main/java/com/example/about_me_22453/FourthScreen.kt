package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth_screen.*

class FourthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_screen)

        button_achievements.setOnClickListener {
            goToAchievements()
        }
    }
    private fun goToAchievements(){
        var myFifthScreen = Intent(this, FifthScreen::class.java)
        startActivity(myFifthScreen)
    }
}