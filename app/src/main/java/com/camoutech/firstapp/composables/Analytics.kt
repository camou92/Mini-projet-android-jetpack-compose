package com.camoutech.firstapp.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.camoutech.firstapp.data.Data
import com.camoutech.firstapp.model.DataAnalytic

@Composable
fun Analytics(listDataAnalytic: List<DataAnalytic> = Data.analyticsData){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Données analytiques du créateur",
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(2F).padding(horizontal = 8.dp),
                softWrap = false,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "28 derniers jours",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .size(height = 20.dp, width = 100.dp)
                    .weight(1F)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            listDataAnalytic.forEach{
                CardElement(dataAnalytic = it, modifier = Modifier.weight(1f).padding(8.dp))
            }
        }

    }
}

@Composable
fun CardElement(dataAnalytic: DataAnalytic, modifier: Modifier = Modifier){
    Card(elevation = 1.dp, shape = RoundedCornerShape(8.dp), modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = dataAnalytic.title,
                style = MaterialTheme.typography.overline
            )
            Row {
                Text(
                    text = dataAnalytic.value,
                    style = MaterialTheme.typography.h5
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null,
                    tint = Color.Blue
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun AnalyticsPreview(){
    Analytics()
}