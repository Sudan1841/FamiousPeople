package com.example.famiouspeople

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class IsaacNewton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isaac_newton)


        val issac = findViewById<Button>(R.id.btnIssac)

        issac.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.britannica.com/biography/Isaac-Newton/Career"))) }
    }
}
