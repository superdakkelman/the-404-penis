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



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
                    val view = LayoutInflater.from(context).inflate(R.layout.activity_signup, null, false)
                    val btnContinuetoApp = view.findViewById<Button>(R.id.btnContinue)
                    val btnGoogle = view.findViewById<Button>(R.id.buttongoogle)
                    val btnFacebook = view.findViewById<Button>(R.id.buttonfb)

                    btnContinuetoApp.setOnClickListener {
                        val intent = Intent(context, Badges::class.java)
                        context.startActivity(intent)
                    }
                    btnGoogle.setOnClickListener {
                        val intent = Intent(context, SignUpGoogle::class.java)
                        context.startActivity(intent)
                    }
                    btnFacebook.setOnClickListener {
                        val intent = Intent(context, SignUpFB::class.java)
                        context.startActivity(intent)
                    }
                    view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    MaterialTheme {
        LoginScreen()
    }
}