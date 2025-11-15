package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val FlashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val FlashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcard_answe1 = findViewById<TextView>( R.id.flashcard_answer1)

        FlashcardAnswer.setOnClickListener {

        }

        FlashcardQuestion.setOnClickListener {
            FlashcardAnswer.visibility = View.VISIBLE
            FlashcardQuestion.visibility = View.INVISIBLE

        }

    }
}