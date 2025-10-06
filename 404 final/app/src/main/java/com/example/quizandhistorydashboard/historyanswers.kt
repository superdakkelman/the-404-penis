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



class historyanswers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                historyanswersscreen()
            }
        }
    }
}

@Composable
fun historyanswersscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_historyanswers, null, false)
            val historyexitbtn = view.findViewById<Button>(R.id.exitbuttonhq)
            val historynextbtn = view.findViewById<Button>(R.id.nextbuttonhq)
            historyexitbtn?.setOnClickListener {
                val intent = Intent(context, HistoryQuizActivity::class.java)
                context.startActivity(intent)
            }
            historynextbtn?.setOnClickListener {
                val intent = Intent(context, histcomplete::class.java)
                context.startActivity(intent)
            }

            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun historyanswerPreview() {
    MaterialTheme {
        historyanswersscreen()
    }
}