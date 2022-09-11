package arch.sample.presentation.feature.home.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import arch.sample.common.feature.Destinations
import arch.sample.presentation.feature.home.api.HomeFeatureEntry
import javax.inject.Inject

class HomeFeatureEntryImpl @Inject constructor() : HomeFeatureEntry {
    override val featureRoute: String = "home"

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        Text(
            modifier = Modifier.fillMaxSize().background(Color.Blue),
            text = "Home"
        )
    }
}
