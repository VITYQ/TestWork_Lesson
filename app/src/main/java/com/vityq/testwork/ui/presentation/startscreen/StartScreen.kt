package com.vityq.testwork.ui.presentation.startscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun StartScreen(onStartGameClick: () -> Unit) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1.7f))
        Button(onClick = {
            onStartGameClick()
        }) {
            Text(text = "Начать игру", style = MaterialTheme.typography.h4)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}