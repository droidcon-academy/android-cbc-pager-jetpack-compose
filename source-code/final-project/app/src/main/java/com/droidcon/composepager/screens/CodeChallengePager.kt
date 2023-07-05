import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPagerIndicator

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CodeChallengePager(images: List<Int>) {
    val pagerState = rememberPagerState()
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(pageCount = 5, state = pagerState) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Image(
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp),
                    painter = painterResource(id = images[it]),
                    contentDescription = ""
                )
            }
        }
        HorizontalPagerIndicator(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(100.dp),
            pagerState = pagerState,
            pageCount = 5,
            activeColor = Color.DarkGray,
            inactiveColor = Color.Gray,
            indicatorHeight = 10.dp,
            spacing = 4.dp
        )
    }
}