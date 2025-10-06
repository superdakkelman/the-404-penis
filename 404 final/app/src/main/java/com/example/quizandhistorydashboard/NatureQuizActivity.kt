package com.example.quizandhistorydashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme



class NatureQuizActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NatureQuizScreen()
            }
        }
    }
}

@Composable
fun NatureQuizScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_naturequiz, null, false)
            val naturebackbtn = view.findViewById<Button>(R.id.backbutton1)
            val startbuttonnq = view.findViewById<Button>(R.id.startbuttonnq)

            naturebackbtn?.setOnClickListener {
                val intent = Intent(context, QuizandGames::class.java)
                context.startActivity(intent)
            }
            startbuttonnq?.setOnClickListener {
                val intent = Intent(context, naturequestions::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun NatureQuizActivityPreview() {
    MaterialTheme {
        NatureQuizScreen()
    }
}