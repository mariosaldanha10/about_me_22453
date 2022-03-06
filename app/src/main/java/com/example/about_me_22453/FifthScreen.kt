package com.example.about_me_22453

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_fifth_screen.*
import kotlin.system.exitProcess

class FifthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_screen)

        button_goBack_To_Hobbies.setOnClickListener {

            goBackToHobbiesScreen()
        }

    val button_exit = findViewById<Button>(R.id.button_exit)
        button_exit.setOnClickListener {
            finishAffinity()
        }
    }
    private fun goBackToHobbiesScreen(){
        var goToHobbiesScreen = Intent(this, FourthScreen::class.java)
        startActivity(goToHobbiesScreen)
    }
}




