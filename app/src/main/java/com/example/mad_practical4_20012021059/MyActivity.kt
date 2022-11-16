package com.example.mad_practical4_20012021059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        val intent = intent
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.desc)
        messageTextView.text = "your message is: " + message
    }
}