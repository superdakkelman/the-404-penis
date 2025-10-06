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



class SignUpFB : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                FBScreen()
            }
        }
    }
}

@Composable
fun FBScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_signupfb, null, false)
            val btncontinuefb = view.findViewById<Button>(R.id.btnContinueFacebook)
            val btncancel = view.findViewById<Button>(R.id.btnCancel)

            btncontinuefb.setOnClickListener {
                val intent = Intent(context, Badges::class.java)
                context.startActivity(intent)
            }
            btncancel.setOnClickListener {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun SignUpFBPreview() {
    MaterialTheme {
        FBScreen()
    }
}