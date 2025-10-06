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
import com.google.android.material.bottomnavigation.BottomNavigationView


class cleanup11 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                cleanup11Screen()
            }
        }
    }
}

@Composable
fun cleanup11Screen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_cleanup11, null, false)
            val backtomenubtn = view.findViewById<Button>(R.id.backButton)
            backtomenubtn?.setOnClickListener {
                val intent = Intent(context, Cleanup::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun cleanup11Preview() {
    MaterialTheme {
        cleanup11Screen()
    }
}