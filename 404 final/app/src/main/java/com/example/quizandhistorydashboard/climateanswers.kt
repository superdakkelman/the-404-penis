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



class climateanswers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                climateanswersscreen()
            }
        }
    }
}

@Composable
fun climateanswersscreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_climateanswers, null, false)
            val climateexitbtn = view.findViewById<Button>(R.id.exitbuttoncq)
            val climatenextbtn = view.findViewById<Button>(R.id.nextbuttoncq)
            climateexitbtn?.setOnClickListener {
                val intent = Intent(context, ClimateQuizActivity::class.java)
                context.startActivity(intent)
            }
            climatenextbtn?.setOnClickListener {
                val intent = Intent(context, climatecomplete::class.java)
                context.startActivity(intent)
            }

            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun climateanswerPreview() {
    MaterialTheme {
        climateanswersscreen()
    }
}