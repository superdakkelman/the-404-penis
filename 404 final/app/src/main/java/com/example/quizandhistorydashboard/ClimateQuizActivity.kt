package com.example.quizandhistorydashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme



class ClimateQuizActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ClimateQuizScreen()
            }
        }
    }
}

@Composable
fun ClimateQuizScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_climatequiz, null, false)
            val naturebackbtn = view.findViewById<Button>(R.id.backbutton1)
            val startbuttonclimq = view.findViewById<Button>(R.id.startbuttoncq)

            naturebackbtn?.setOnClickListener {
                val intent = Intent(context, QuizandGames::class.java)
                context.startActivity(intent)
            }
            startbuttonclimq?.setOnClickListener {
                val intent = Intent(context, climatequestions::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun ClimateQuizActivityPreview() {
    MaterialTheme {
        ClimateQuizScreen()
    }
}