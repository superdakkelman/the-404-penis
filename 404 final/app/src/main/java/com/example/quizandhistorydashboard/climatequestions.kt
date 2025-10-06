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



class climatequestions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                climatequestionsscreen()
            }
        }
    }
}

@Composable
fun climatequestionsscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_climatequestions, null, false)
            val climateexitbtn = view.findViewById<Button>(R.id.exitbuttoncq)
            val cqanswer1btn = view.findViewById<Button>(R.id.cqanswer1)
            val cqanswer2btn = view.findViewById<Button>(R.id.cqanswer2)
            val cqanswer3btn = view.findViewById<Button>(R.id.cqanswer3)
            val cqanswer4btn = view.findViewById<Button>(R.id.cqanswer4)

            climateexitbtn?.setOnClickListener {
                val intent = Intent(context, ClimateQuizActivity::class.java)
                context.startActivity(intent)
            }
            cqanswer1btn?.setOnClickListener {
                val intent = Intent(context, climateanswers::class.java)
                context.startActivity(intent)
            }
            cqanswer2btn?.setOnClickListener {
                val intent = Intent(context, climateanswers::class.java)
                context.startActivity(intent)
            }
            cqanswer3btn?.setOnClickListener {
                val intent = Intent(context, climateanswers::class.java)
                context.startActivity(intent)
            }
            cqanswer4btn?.setOnClickListener {
                val intent = Intent(context, climateanswers::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun climatequestionsPreview() {
    MaterialTheme {
        climatequestionsscreen()
    }
}