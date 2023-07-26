package com.camoutech.firstapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.camoutech.firstapp.data.Data
import com.camoutech.firstapp.model.DataRevenue


@Composable
fun Revenue(listDataRevenue: List<DataRevenue> = Data.revenueData){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    ) {
        Text(
            text = "Vos revenus",
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Text(
            text = "Estimation 3 derniers mois",
            style = MaterialTheme.typography.body2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Card(
            elevation = 1.dp,
            modifier = Modifier.padding(8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
              val maxValue = listDataRevenue.maxByOrNull {
                  it.amount
              }
                listDataRevenue.forEach {
                    RevenuByMonthItem(
                        revenueData = it,
                        ratio = it.amount/maxValue!!.amount
                    )
                }
            }
        }
    }
}

@Composable
fun RevenuByMonthItem(revenueData : DataRevenue, ratio : Float){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = revenueData.month,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            modifier = Modifier.weight(1f)
        )
        Row(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .padding(vertical = 8.dp)) {
            Box(modifier = Modifier
                .height(10.dp)
                .fillMaxWidth(ratio)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colors.secondary)
            ){

            }

        }
        Text(
            text = "${revenueData.amount} \$US",
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.End
        )
    }
}
@Preview(showBackground = true)
@Composable
fun RevenuPreview(){
    Revenue()
}