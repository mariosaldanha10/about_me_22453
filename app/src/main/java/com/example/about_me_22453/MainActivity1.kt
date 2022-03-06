package com.example.about_me_22453

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_button_education.setOnClickListener {
            goToActivity()
        }

        click_button_skills.setOnClickListener {
            goToSkills()
        }

        click_button_hobbies.setOnClickListener {
            goToHobbies()
        }
        click_button_achievements.setOnClickListener {
            goToAchievements()
        }
    }

    private fun goToActivity() {

        var activity = Intent(this, SecondScreen::class.java)
        startActivity(activity)
    }

    private fun goToSkills(){
        var myThirdScreen = Intent(this, ThirdScreen::class.java)
        startActivity(myThirdScreen)
    }

    private fun goToHobbies(){
        var myFourthScreen = Intent(this, FourthScreen::class.java)
        startActivity(myFourthScreen)
    }
    private fun goToAchievements(){
        var myFifthScreen = Intent(this, FifthScreen::class.java)
        startActivity(myFifthScreen)
    }
}