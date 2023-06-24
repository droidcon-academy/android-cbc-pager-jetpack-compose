package com.droidcon.composepager

import androidx.annotation.StringRes

object Utils {

    enum class Screens(@StringRes val title: Int) {
        MainScreenWithOptions(title = R.string.main_screen_with_options),
        SimpleHorizontalPager(title = R.string.simple_horizontal_pager),
        SimpleVerticalPager(title = R.string.simple_vertical_pager),
        VerticalPagerWithImages(title = R.string.vertical_pager_with_images),
        HorizontalPagerWithNextAndPreviousButtons(title = R.string.horizontal_pager_with_next_and_prev_buttons),
        HorizontalPagerWithIndicators(title = R.string.horizontal_pager_with_indicator)
    }

    val images = listOf(
        R.drawable.imageone,
        R.drawable.imagetwo,
        R.drawable.imagethree,
        R.drawable.imagefour,
        R.drawable.imagefive,
    )
}