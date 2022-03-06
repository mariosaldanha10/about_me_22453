package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third_screen.*

class ThirdScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)

        button_Next_To_Hobbies.setOnClickListener {

            goToFourthScreen()
        }

        button_goBack_To_Education.setOnClickListener {

            goToSecondScreen()
        }
    }

    private fun goToSecondScreen(){

        var mySecondScreen = Intent(this, SecondScreen::class.java)
        startActivity(mySecondScreen)
    }
    private fun goToFourthScreen(){

        var myFourthScreen = Intent(this, FourthScreen::class.java)
        startActivity(myFourthScreen)

    }
}