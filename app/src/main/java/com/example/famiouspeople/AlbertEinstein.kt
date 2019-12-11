package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlbertEinstein : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_albert_einstein)

        val alber = findViewById<Button>(R.id.btnAlbert)
        alber.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.biographyonline.net/scientists/albert-einstein.html"))) }
    }
}
