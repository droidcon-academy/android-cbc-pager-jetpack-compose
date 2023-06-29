package com.droidcon.composepager.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerWithImages(images: List<Int>) {
    val pagerState = rememberPagerState()
    VerticalPager(
        pageCount = 5,
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp,
        state = pagerState
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = images[it]),
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .border(BorderStroke(2.dp, Color.Black)),
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit,
                contentDescription = ""
            )
        }
    }
}