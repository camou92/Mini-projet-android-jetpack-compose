package com.camoutech.firstapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen(){
    Scaffold(
        topBar = {
            MyTopAppBar()
        },
        bottomBar = {
            MyBottomAppBar()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Profiles()
            Analytics()
            Revenue()
            LastContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview(){
    Screen()
}