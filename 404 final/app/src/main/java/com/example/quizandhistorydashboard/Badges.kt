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


class Badges : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BadgeScreen()
            }
        }
    }
}

@Composable
fun BadgeScreen(modifier: Modifier = Modifier) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            val view = LayoutInflater.from(context).inflate(R.layout.activity_badges, null, false)
            val EcoStarterBtn = view.findViewById<Button>(R.id.ecostarter)
            EcoStarterBtn?.setOnClickListener {
                val intent = Intent(context, EcoStarter::class.java)
                context.startActivity(intent)
            }
            val EcoHelperBtn = view.findViewById<Button>(R.id.ecohelper)
            EcoHelperBtn?.setOnClickListener {
                val intent = Intent(context, EcoHelper::class.java)
                context.startActivity(intent)
            }
            val EcoChampionBtn = view.findViewById<Button>(R.id.ecochampion)
            EcoChampionBtn?.setOnClickListener {
                val intent = Intent(context, EcoChampion::class.java)
                context.startActivity(intent)
            }
            val EcoLegendBtn = view.findViewById<Button>(R.id.ecolegend)
            EcoLegendBtn?.setOnClickListener {
                val intent = Intent(context, EcoLegend::class.java)
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
fun BadgesPreview() {
    MaterialTheme {
        BadgeScreen()
    }
}