package com.example.famiouspeople

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MohammedAli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mohammed_ali)
        val Ali = findViewById<Button>(R.id.btnAli)
        Ali.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.biographyonline.net/sport/muhammad-ali.html"))) }
    }
}