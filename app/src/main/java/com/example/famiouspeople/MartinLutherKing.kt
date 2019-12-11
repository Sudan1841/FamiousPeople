package com.example.famiouspeople

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MartinLutherKing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_martin_luther_king)
        val marti = findViewById<Button>(R.id.btnMaritina)
        marti.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nobelprize.org/prizes/peace/1964/king/biographical/"))) }
    }
}