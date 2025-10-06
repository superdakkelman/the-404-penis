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


class Cleanup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CleanupScreen()
            }
        }
    }
}

@Composable
fun CleanupScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_cleanup, null, false)
            val cleanup1btn = view.findViewById<Button>(R.id.btnCleanup1)
            cleanup1btn?.setOnClickListener {
                val intent = Intent(context, cleanup1::class.java)
                context.startActivity(intent)
            }
            val cleanup2btn = view.findViewById<Button>(R.id.btnCleanup2)
            cleanup2btn?.setOnClickListener {
                val intent = Intent(context, cleanup2::class.java)
                context.startActivity(intent)
            }
            val cleanup3btn = view.findViewById<Button>(R.id.btnCleanup3)
            cleanup3btn?.setOnClickListener {
                val intent = Intent(context, cleanup3::class.java)
                context.startActivity(intent)
            }
            val cleanup4btn = view.findViewById<Button>(R.id.btnCleanup4)
            cleanup4btn?.setOnClickListener {
                val intent = Intent(context, cleanup4::class.java)
                context.startActivity(intent)
            }
            val cleanup5btn = view.findViewById<Button>(R.id.btnCleanup5)
            cleanup5btn?.setOnClickListener {
                val intent = Intent(context, cleanup5::class.java)
                context.startActivity(intent)
            }
            val cleanup6btn = view.findViewById<Button>(R.id.btnCleanup6)
            cleanup6btn?.setOnClickListener {
                val intent = Intent(context, cleanup6::class.java)
                context.startActivity(intent)
            }
            val cleanup7btn = view.findViewById<Button>(R.id.btnCleanup7)
            cleanup7btn?.setOnClickListener {
                val intent = Intent(context, cleanup7::class.java)
                context.startActivity(intent)
            }
            val cleanup8btn = view.findViewById<Button>(R.id.btnCleanup8)
            cleanup8btn?.setOnClickListener {
                val intent = Intent(context, cleanup8::class.java)
                context.startActivity(intent)
            }
            val cleanup9btn = view.findViewById<Button>(R.id.btnCleanup9)
            cleanup9btn?.setOnClickListener {
                val intent = Intent(context, cleanup9::class.java)
                context.startActivity(intent)
            }
            val cleanup110btn = view.findViewById<Button>(R.id.btnCleanup11)
            cleanup110btn?.setOnClickListener {
                val intent = Intent(context, cleanup11::class.java)
                context.startActivity(intent)
            }
            val cleanup11btn = view.findViewById<Button>(R.id.btnCleanup11)
            cleanup11btn?.setOnClickListener {
                val intent = Intent(context, cleanup11::class.java)
                context.startActivity(intent)
            }
            val bottomNavView = view.findViewById<BottomNavigationView>(R.id.bottomNav)
            bottomNavView?.setOnItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.nav_badges -> {
                        val intent = Intent(context, Badges::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_cleanup -> {
                        val intent = Intent(context, Cleanup::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_button_quizandgames -> {
                        val intent = Intent(context, QuizandGames::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_leaderboard -> {
                        val intent = Intent(context, Leaderboard::class.java)
                        context.startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            view
        },
    )
}

@Preview(showBackground = true)
@Composable
fun CleanupPreview() {
    MaterialTheme {
        CleanupScreen()
    }
}