package com.example.quizandhistorydashboard

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.material.bottomnavigation.BottomNavigationView

class QuizandGames : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MyXmlLayout()
                }
            }
        }
    }
}

@Composable
fun MyXmlLayout(modifier: Modifier = Modifier) {
    AndroidView(
        factory = { context ->
            // Inflate the XML layout
            val view = LayoutInflater.from(context).inflate(R.layout.activity_quizandgames, null, false)

            // --- Part 1: Your existing button listeners (which were already correct!) ---
            val historyBtn = view.findViewById<Button>(R.id.btnHistoryQuiz)
            val natureBtn = view.findViewById<Button>(R.id.btnNatureQuiz)
            val climateBtn = view.findViewById<Button>(R.id.btnClimateQuiz)

            historyBtn?.setOnClickListener {
                val intent = Intent(context, HistoryQuizActivity::class.java)
                context.startActivity(intent)
            }
            natureBtn?.setOnClickListener {
                val intent = Intent(context, NatureQuizActivity::class.java)
                context.startActivity(intent)
            }
            climateBtn?.setOnClickListener {
                val intent = Intent(context, ClimateQuizActivity::class.java)
                context.startActivity(intent)
            }

            // --- Part 2: The corrected BottomNavigationView logic ---

            // FIX 1: Find the bottomNavView *inside* the inflated view
            val bottomNavView = view.findViewById<BottomNavigationView>(R.id.bottomNav)

            // FIX 2: Get the current Activity by casting the context
            val currentActivity = context as? Activity

            bottomNavView?.setOnItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.nav_badges -> {
                        // Check if we are already in the Badges activity
                        if (currentActivity is Badges) {
                            return@setOnItemSelectedListener true // Do nothing
                        }
                        // FIX 3: Use the provided `context` for the Intent and to start the activity
                        val intent = Intent(context, Badges::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_cleanup -> {
                        if (currentActivity is Cleanup) {
                            return@setOnItemSelectedListener true // Do nothing
                        }
                        val intent = Intent(context, Cleanup::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_button_quizandgames -> {
                        if (currentActivity is QuizandGames) {
                            return@setOnItemSelectedListener true // Do nothing
                        }
                        // This navigation is redundant, but the logic is here for completeness
                        val intent = Intent(context, QuizandGames::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_leaderboard -> {
                        if (currentActivity is Leaderboard) {
                            return@setOnItemSelectedListener true // Do nothing
                        }
                        val intent = Intent(context, Leaderboard::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        context.startActivity(intent)
                        true
                    }
                    else -> false
                }
            }

            // Return the inflated view. This is required by the factory lambda.
            view
        },
        modifier = modifier
    )
}


@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        MyXmlLayout()
    }
}
