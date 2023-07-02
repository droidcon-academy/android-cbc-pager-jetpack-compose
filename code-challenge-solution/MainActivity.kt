package com.droidcon.composepager

import CodeChallengePager
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
                                Utils.Screens.CodeChallengePager.name -> {
                                    navController.navigate(Utils.Screens.CodeChallengePager.name)
                                }
                            }
                        })
                    }
                    composable(Utils.Screens.CodeChallengePager.name) {
                        CodeChallengePager(images = Utils.images)
                    }
                }
            }
        }
    }
}

