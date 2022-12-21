package com.vityq.testwork.ui.presentation.gamescreen

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vityq.testwork.ui.theme.TestWorkTheme
import com.vityq.testwork.ui.theme.headerColor
import com.vityq.testwork.ui.theme.scoreColor

@Composable
fun GameScreen() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(64.dp))
        Card(
            Modifier
                .wrapContentSize()
                .padding(horizontal = 32.dp),
            backgroundColor = headerColor,
            contentColor = Color.White,
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(all = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Таймер",
                    style = MaterialTheme.typography.h5
                )
                Text(text = "167", style = MaterialTheme.typography.h4)
            }
        }

        Spacer(modifier = Modifier.height(64.dp))
        Card(
            Modifier
                .width(200.dp),
            backgroundColor = scoreColor,
            contentColor = Color.White,
            shape = CutCornerShape(20),
            elevation = 8.dp,
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(all = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "34657", style = MaterialTheme.typography.h4)
            }
        }
        Spacer(modifier = Modifier.height(64.dp))
        Card(
            Modifier
                .padding(horizontal = 32.dp)
        )
        {
            Box(modifier = Modifier.padding(horizontal = 32.dp, vertical = 8.dp)) {
                Text(
                    text = "8 + 6",
                    color = headerColor,
                    fontSize = 48.sp,
                    modifier = Modifier.align(
                        Alignment.Center
                    ),
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(64.dp))

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                )
            ) {
                Text(text = "32", color = headerColor)
            }
            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                )
            ) {
                Text(text = "16", color = headerColor)
            }
            Spacer(modifier = Modifier.width(64.dp))
        }

        Spacer(modifier = Modifier.height(128.dp))
    }
}

@Preview
@Composable
fun a() {
    TestWorkTheme {
        GameScreen()
    }
}