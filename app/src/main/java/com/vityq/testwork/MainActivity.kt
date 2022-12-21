package com.vityq.testwork

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vityq.testwork.ui.presentation.gamescreen.GameScreen
import com.vityq.testwork.ui.presentation.startscreen.StartScreen
import com.vityq.testwork.ui.theme.TestWorkTheme
import com.vityq.testwork.ui.view.BackgroundView
import java.util.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestWorkTheme {
                BackgroundView()
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "startScreen") {
                    composable("startScreen") {
                        StartScreen(
                            onStartGameClick = {
                                navController.navigate("gameScreen") {
                                    popUpTo(0)
                                }
                            }
                        )
                    }
                    composable("gameScreen") {
                        GameScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestWorkTheme {
        Greeting("Android")
    }
}