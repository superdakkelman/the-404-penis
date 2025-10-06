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



class naturequestions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                naturequestionsscreen()
            }
        }
    }
}

@Composable
fun naturequestionsscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_naturequestions, null, false)
            val natureexitbtn = view.findViewById<Button>(R.id.exitbuttonnq)
            val nqanswer1btn = view.findViewById<Button>(R.id.nqanswer1)
            val nqanswer2btn = view.findViewById<Button>(R.id.nqanswer2)
            val nqanswer3btn = view.findViewById<Button>(R.id.nqanswer3)
            val nqanswer4btn = view.findViewById<Button>(R.id.nqanswer4)

            natureexitbtn?.setOnClickListener {
                val intent = Intent(context, NatureQuizActivity::class.java)
                context.startActivity(intent)
            }
            nqanswer1btn?.setOnClickListener {
                val intent = Intent(context, natureanswers::class.java)
                context.startActivity(intent)
            }
            nqanswer2btn?.setOnClickListener {
                val intent = Intent(context, natureanswers::class.java)
                context.startActivity(intent)
            }
            nqanswer3btn?.setOnClickListener {
                val intent = Intent(context, natureanswers::class.java)
                context.startActivity(intent)
            }
            nqanswer4btn?.setOnClickListener {
                val intent = Intent(context, natureanswers::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun naturequestionsPreview() {
    MaterialTheme {
        naturequestionsscreen()
    }
}