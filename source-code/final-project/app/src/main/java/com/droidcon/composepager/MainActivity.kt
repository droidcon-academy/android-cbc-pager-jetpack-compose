package com.droidcon.composepager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.droidcon.composepager.screens.HorizontalPagerWithImageAndIndicators
import com.droidcon.composepager.screens.HorizontalPagerWithNextAndPrevButtons
import com.droidcon.composepager.screens.MainScreenWithOptions
import com.droidcon.composepager.screens.SimpleHorizontalPager
import com.droidcon.composepager.screens.SimpleVerticalPager
import com.droidcon.composepager.screens.VerticalPagerWithImages
import com.droidcon.composepager.ui.theme.ComposePagerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePagerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Utils.Screens.MainScreenWithOptions.name
                ) {
                    composable(Utils.Screens.MainScreenWithOptions.name) {
                        MainScreenWithOptions(onOptionClick = {
                            when (it) {
                                Utils.Screens.SimpleHorizontalPager.name -> {
                                    navController.navigate(Utils.Screens.SimpleHorizontalPager.name)
                                }

                                Utils.Screens.SimpleVerticalPager.name -> {
                                    navController.navigate(Utils.Screens.SimpleVerticalPager.name)
                                }

                                Utils.Screens.VerticalPagerWithImages.name -> {
                                    navController.navigate(Utils.Screens.VerticalPagerWithImages.name)
                                }

                                Utils.Screens.HorizontalPagerWithNextAndPreviousButtons.name -> {
                                    navController.navigate(Utils.Screens.HorizontalPagerWithNextAndPreviousButtons.name)
                                }

                                Utils.Screens.HorizontalPagerWithIndicators.name -> {
                                    navController.navigate(Utils.Screens.HorizontalPagerWithIndicators.name)
                                }
                            }
                        })
                    }
                    composable(Utils.Screens.SimpleHorizontalPager.name) {
                        SimpleHorizontalPager()
                    }
                    composable(Utils.Screens.SimpleVerticalPager.name) {
                        SimpleVerticalPager()
                    }
                    composable(Utils.Screens.VerticalPagerWithImages.name) {
                        VerticalPagerWithImages(images = Utils.images)
                    }
                    composable(Utils.Screens.HorizontalPagerWithNextAndPreviousButtons.name) {
                        HorizontalPagerWithNextAndPrevButtons()
                    }
                    composable(Utils.Screens.HorizontalPagerWithIndicators.name) {
                        HorizontalPagerWithImageAndIndicators(images = Utils.images)
                    }
                }
            }
        }
    }
}

