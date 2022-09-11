package arch.sample.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun NavigationScreen(
    navController: NavHostController = rememberAnimatedNavController(),
    modifier: Modifier = Modifier,
    startDestination: String
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {}
    ) { padding ->
        AnimatedNavHost(
            modifier = Modifier.padding(padding),
            navController = navController,
            startDestination = startDestination,
        ) {
            appManNavGraph()
        }
    }
}
