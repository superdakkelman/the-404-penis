package com.example.quizandhistorydashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
// Removed unused import: import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
// Removed unused import: import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import com.google.android.material.bottomnavigation.BottomNavigationView


class Leaderboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                LeaderboardScreen()
            }
        }
    }
}

@Composable
fun LeaderboardScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            val view = LayoutInflater.from(context).inflate(R.layout.activity_leaderboard, null, false)

            val profile1btn = view.findViewById<Button>(R.id.profile1)
            profile1btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile2btn = view.findViewById<Button>(R.id.profile2)
            profile2btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile3btn = view.findViewById<Button>(R.id.profile3)
            profile3btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile4btn = view.findViewById<Button>(R.id.profile4)
            profile4btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile5btn = view.findViewById<Button>(R.id.profile5)
            profile5btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile6btn = view.findViewById<Button>(R.id.profile6)
            profile6btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile7btn = view.findViewById<Button>(R.id.profile7)
            profile7btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile8btn = view.findViewById<Button>(R.id.profile8)
            profile8btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile9btn = view.findViewById<Button>(R.id.profile9)
            profile9btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
                context.startActivity(intent)
            }
            val profile10btn = view.findViewById<Button>(R.id.profile10)
            profile10btn.setOnClickListener {
                val intent = Intent(context, Profile::class.java)
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
fun LeaderboardPreview() {
    MaterialTheme {
        LeaderboardScreen()
    }
}