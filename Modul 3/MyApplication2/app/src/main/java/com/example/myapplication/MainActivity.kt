package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextbutton =findViewById<Button>(R.id.NextButton)

        nextbutton.setOnClickListener{
            Intent(this,activity_kedua::class.java).also {
                startActivity(it)
            }
        }
        val button_unggah = findViewById<Button>(R.id.button)
        val img = findViewById<ImageView>(R.id.imageView)

        button_unggah.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            val img = findViewById<ImageView>(R.id.imageView)
            img.setImageURI(uri)
        }
    }
    }
