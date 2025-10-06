package com.example.quizandhistorydashboard

import android.content.Intent
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
            val view = LayoutInflater.from(context).inflate(R.layout.activity_quizandgames, null, false)


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
