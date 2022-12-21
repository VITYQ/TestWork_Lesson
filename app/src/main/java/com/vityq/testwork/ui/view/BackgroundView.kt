package com.vityq.testwork.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.vityq.testwork.ui.theme.TestWorkTheme
import com.vityq.testwork.ui.theme.mainBackground

@Composable
fun BackgroundView() {
    ConstraintLayout(
        Modifier
            .fillMaxSize()
            .background(mainBackground)
    ) {
        val (char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11)
                = createRefs()

        Text(
            text = "!", Modifier.constrainAs(char1) {
                top.linkTo(parent.top, 24.dp)
                end.linkTo(parent.end, 24.dp)
            },
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "?", Modifier.constrainAs(char2) {
                top.linkTo(char1.bottom, (-24).dp)
                start.linkTo(parent.start, 24.dp)
            },
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "!", Modifier.constrainAs(char3) {
                top.linkTo(char2.bottom, (-16).dp)
                start.linkTo(char2.end, 32.dp)
            },
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "?", Modifier.constrainAs(char4) {
                end.linkTo(char1.start)
                top.linkTo(char3.bottom, (-32).dp)
            },
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "+", modifier = Modifier.constrainAs(char5) {
                start.linkTo(char3.end)
                end.linkTo(char4.start)
                top.linkTo(char4.bottom, 16.dp)
            },
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview(widthDp = 320, heightDp = 640)
@Composable
fun BackgroundPreview() {
    TestWorkTheme {
        BackgroundView()
    }
}