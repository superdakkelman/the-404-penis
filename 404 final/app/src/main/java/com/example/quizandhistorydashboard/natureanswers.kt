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



class natureanswers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                natureanswersscreen()
            }
        }
    }
}

@Composable
fun natureanswersscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_natureanswers, null, false)
            val natureexitbtn = view.findViewById<Button>(R.id.exitbuttonnq)
            val naturenextbtn = view.findViewById<Button>(R.id.nextbuttonnq)
            natureexitbtn?.setOnClickListener {
                val intent = Intent(context, NatureQuizActivity::class.java)
                context.startActivity(intent)
            }
            naturenextbtn?.setOnClickListener {
                val intent = Intent(context, naturecomplete::class.java)
                context.startActivity(intent)
            }

            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun natureanswerPreview() {
    MaterialTheme {
        natureanswersscreen()
    }
}