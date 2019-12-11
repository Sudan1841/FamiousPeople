package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class BruceLee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bruce_lee)
        val lee = findViewById<Button>(R.id.btnBruce)
        lee.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://brucelee.com/"))) }
    }
}
