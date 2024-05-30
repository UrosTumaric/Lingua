package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LanguageLevel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.language_level)
    }

    fun continueButton(view: View?){
        val intent = Intent(this, StartPage::class.java)
        startActivity(intent)
    }
}