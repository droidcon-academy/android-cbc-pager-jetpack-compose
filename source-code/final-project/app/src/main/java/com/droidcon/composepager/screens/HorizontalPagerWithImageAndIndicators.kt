package com.droidcon.composepager.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPagerIndicator

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerWithImageAndIndicators(images: List<Int>) {
    val pagerState = rememberPagerState()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        HorizontalPager(pageCount = 5, state = pagerState) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = images[it]),
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Fit,
                    contentDescription = ""
                )
            }
        }
        HorizontalPagerIndicator(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 100.dp),
            pageCount = 5,
            pagerState = pagerState
        )
    }
}