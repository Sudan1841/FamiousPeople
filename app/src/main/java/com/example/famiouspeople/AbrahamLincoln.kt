package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class AbrahamLincoln : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abraham_lincoln)
        val Linc = findViewById<Button>(R.id.Linclon)
        Linc.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.battlefields.org/learn/biographies/abraham-lincoln"))) }
    }
}
