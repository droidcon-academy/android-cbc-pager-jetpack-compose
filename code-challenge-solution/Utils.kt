package com.droidcon.composepager

import androidx.annotation.StringRes

object Utils {

    enum class Screens(@StringRes val title: Int) {
          CodeChallengePager(title = R.string.code_challenge_pager)
    }

    val images = listOf(
        R.drawable.imageone,
        R.drawable.imagetwo,
        R.drawable.imagethree,
        R.drawable.imagefour,
        R.drawable.imagefive,
    )
}