package com.camoutech.firstapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.camoutech.firstapp.data.Data
import com.camoutech.firstapp.model.Content

@Composable
fun LastContent(listLastContent: List<Content> = Data.lastContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = "Derniers contenus publiés",
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold,
            softWrap = false,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        listLastContent.forEach {
            LastContentItem(it)
        }


    }
}

@Composable
fun LastContentItem(content: Content) {
    Card(elevation = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {


    Column(modifier = Modifier.padding(8.dp)) {
        Row() {
            Image(
                painter = painterResource(id = content.thumbnail),
                contentDescription = null,
                modifier = Modifier
                    .size(height = 50.dp, width = 100.dp)
                    .aspectRatio(2f)
            )
            Column() {
                Text(
                    text = content.title,
                    style = MaterialTheme.typography.body2,
                    softWrap = false,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = content.duration,
                    style = MaterialTheme.typography.caption,
                    softWrap = false,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider()
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color.Gray
                )
                Text(
                    text = "${content.stars}",
                    style = MaterialTheme.typography.body2
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                    tint = Color.Gray
                )
                Text(
                    text = "${content.likes}",
                    style = MaterialTheme.typography.body2
                )

            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Gray
                )
                Text(
                    text = "${content.favorites}",
                    style = MaterialTheme.typography.body2
                )

            }
            


        }

    }
         } 
}

@Preview(showBackground = true)
@Composable
fun LastContentPreview() {
    LastContent()
}