package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth_screen.*

class FourthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_screen)

        button_goBack_Skills.setOnClickListener {

            goBackToSkillsScreen()
        }

        button_Next_To_Achievements.setOnClickListener {
            goToAchievementsScreen()
        }
    }
    private fun goBackToSkillsScreen(){
        var goBackToSkills = Intent(this, ThirdScreen::class.java)
        startActivity(goBackToSkills)
    }
    private fun goToAchievementsScreen(){

        var goToAchievementsScreen = Intent(this, FifthScreen::class.java)
        startActivity(goToAchievementsScreen)
    }
}

