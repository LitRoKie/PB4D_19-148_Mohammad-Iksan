package com.example.modul_3_tugas_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Mendapatkan button pertama
        val btnExplanation = findViewById<Button>(R.id.btn_explanation)

        // Set OnClickListener untuk button pertama
        btnExplanation.setOnClickListener {
            // Intent untuk pindah ke activity penjelasan
            val intent = Intent(this, ExplanationActivity::class.java)
            startActivity(intent)
        }

        // Mendapatkan button kedua
        val btnDetectObject = findViewById<Button>(R.id.btn_detect_object)

        // Set OnClickListener untuk button kedua
        btnDetectObject.setOnClickListener {
            // Intent untuk membuka aplikasi Google Lens
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)
        }
    }
}