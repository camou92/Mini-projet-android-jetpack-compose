package com.camoutech.firstapp.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MyTopAppBar(){
    TopAppBar{
        Box(modifier = Modifier.fillMaxWidth()){
            Text(
                text = "Camoutech",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.align(Alignment.CenterStart)
            )
            Icon(imageVector = Icons.Default.Info,
                contentDescription = "Info",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(8.dp)
            )
        }

    }
}