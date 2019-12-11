package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class Bob : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bob)
        val bob = findViewById<Button>(R.id.BtnBob)
        bob.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udiscovermusic.com/bob-marley/bob-marley-biography/"))) }
    }
}
