package com.example.dentalapp3.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dentalapp3.R

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val quizFragment = QuizFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_quiz_view, quizFragment).commit()
    }
}