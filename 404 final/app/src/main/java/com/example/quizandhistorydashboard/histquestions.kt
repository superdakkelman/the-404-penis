package com.example.quizandhistorydashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme



class histquestions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                histquestionsscreen()
            }
        }
    }
}

@Composable
fun histquestionsscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_historyquestion1, null, false)
            val historyexitbtn = view.findViewById<Button>(R.id.exitbuttonhq)
            val hqanswer1btn = view.findViewById<Button>(R.id.hqanswer1)
            val hqanswer2btn = view.findViewById<Button>(R.id.hqanswer2)
            val hqanswer3btn = view.findViewById<Button>(R.id.hqanswer3)
            val hqanswer4btn = view.findViewById<Button>(R.id.hqanswer4)

            historyexitbtn?.setOnClickListener {
                val intent = Intent(context, HistoryQuizActivity::class.java)
                context.startActivity(intent)
            }
            hqanswer1btn?.setOnClickListener {
                val intent = Intent(context, historyanswers::class.java)
                context.startActivity(intent)
            }
            hqanswer2btn?.setOnClickListener {
                val intent = Intent(context, historyanswers::class.java)
                context.startActivity(intent)
            }
            hqanswer3btn?.setOnClickListener {
                val intent = Intent(context, historyanswers::class.java)
                context.startActivity(intent)
            }
            hqanswer4btn?.setOnClickListener {
                val intent = Intent(context, historyanswers::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun histquestionsPreview() {
    MaterialTheme {
        histquestionsscreen()
    }
}