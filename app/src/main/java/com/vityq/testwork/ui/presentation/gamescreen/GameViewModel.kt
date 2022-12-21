package com.vityq.testwork.ui.presentation.gamescreen


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GameViewModel: ViewModel() {

    var timer by mutableStateOf(300)


    fun startTimer() {
        CoroutineScope(Dispatchers.Default).launch {
            while (true) {
                delay(100)
                timer--
            }
        }
    }

}