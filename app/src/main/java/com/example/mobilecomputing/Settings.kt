package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.settings)
    }

    fun back(view: View?){
        val intent = Intent(this, MainScreen::class.java)
        startActivity(intent)
    }

    fun LanguageSelection(view: View?){
        val intent = Intent(this, Language2::class.java)
        startActivity(intent)
    }

    fun LanguageLevelSelection(view: View?){
        val intent = Intent(this, LanguageLevel2::class.java)
        startActivity(intent)
    }

}