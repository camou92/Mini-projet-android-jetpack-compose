package com.camoutech.firstapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.camoutech.firstapp.R

@Composable
fun Profiles(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Surface(modifier = Modifier
            .size(70.dp)
            .clip(RoundedCornerShape(50))) {
            Image(
                painter = painterResource(id = R.drawable.fg),
                contentDescription = null)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = "Mohamed Camara",
                style = MaterialTheme.typography.subtitle1
            )
            Text(
                text = "67",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Nombre total de contenus publiés",
                style = MaterialTheme.typography.body2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview(){
    Profiles()
}