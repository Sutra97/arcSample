package arch.sample.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import arch.sample.common.feature.find
import arch.sample.di.LocalAppProvider
import arch.sample.presentation.feature.home.api.HomeFeatureEntry
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun NavigationScreen() {
    val navController = rememberAnimatedNavController()
    val destinations = LocalAppProvider.current.destinations
    Scaffold() { padding ->
        AppMainNavHost(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            navController = navController,
            startDestination = destinations.find<HomeFeatureEntry>().featureRoute
        )
    }
}

@Composable
fun AppMainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String
) {
    val destinations = LocalAppProvider.current.destinations
    val homeFeature = destinations.find<HomeFeatureEntry>()
    AnimatedNavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        with(homeFeature) {
            composable(navController, destinations)
        }
    }
}
