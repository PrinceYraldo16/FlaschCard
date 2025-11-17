package com.example.flashcardapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val FlashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val BtnSui = findViewById<Button>(R.id.BtnS)

        FlashcardAnswer.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.redcolor, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.white, null))
            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.white, null))
        }

        FlashcardAnswer2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.Vert, null))
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.white, null))
            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.white, null))
        }

        flashcard_answe1.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.redcolor, null))
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.white, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.white, null))
        }

        BtnSui.setOnClickListener {

        }

        BtnSui.setOnClickListener {
            setContentView(R.layout.activite1)
        }

        FlashcardQuestion.setOnClickListener {
            FlashcardAnswer.visibility = View.VISIBLE
            FlashcardQuestion.visibility = View.INVISIBLE

        }

    }
}