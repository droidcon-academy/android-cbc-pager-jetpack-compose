package com.droidcon.composepager.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.droidcon.composepager.R

@Composable
fun MainScreenWithOptions(onOptionClick: (String) -> Unit) {
    val list: List<String> = stringArrayResource(id = R.array.screen_options).toList()
    Column(
        modifier = Modifier.padding(top = 20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        list.forEach { listItem ->
            Card(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .clickable {
                        onOptionClick(listItem)
                    }
            ) {
                Box(modifier = Modifier.fillMaxSize().background(Color.Gray), contentAlignment = Alignment.Center) {
                    Text(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp),
                        text = listItem,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
