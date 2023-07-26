package com.camoutech.firstapp.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyBottomAppBar(){
    BottomNavigation {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            BottomMenuItem(icon = Icons.Default.Home, titre = "Dashboard")
            BottomMenuItem(icon = Icons.Default.List, titre = "Contenus")
            BottomMenuItem(icon = Icons.Default.CheckCircle, titre = "Analytics")
            BottomMenuItem(icon = Icons.Default.Email, titre = "Comment")
        }

    }
}

@Composable
fun BottomMenuItem(icon: ImageVector, titre : String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 62.dp, height = 40.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Text(
            text = titre,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            style = MaterialTheme.typography.caption
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyBottomAppBarPreview(){
    MyBottomAppBar()
}