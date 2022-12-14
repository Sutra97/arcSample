package arch.sample.common.feature

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.google.accompanist.navigation.animation.composable

typealias Destinations = Map<Class<out FeatureEntry>, @JvmSuppressWildcards FeatureEntry>

interface FeatureEntry {

    val featureRoute: String

    val arguments: List<NamedNavArgument>
        get() = emptyList()

    val deepLinks: List<NavDeepLink>
        get() = emptyList()
}

/**
 * for standalone feature
 */
interface ComposableFeatureEntry : FeatureEntry {

    fun NavGraphBuilder.composable(navController: NavHostController, destinations: Destinations) {
        composable(
            route = featureRoute,
            arguments = arguments,
            deepLinks = deepLinks
        ) { backStackEntry ->
            Composable(navController, destinations, backStackEntry)
        }
    }

    @Composable
    fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    )
}

/**
 * for a destination with arguments or a nested nav graph
 */
interface AggregateFeatureEntry : FeatureEntry {

    fun NavGraphBuilder.navigation(navController: NavHostController, destinations: Destinations)
}

inline fun <reified T : FeatureEntry> Destinations.find(): T =
    findOrNull() ?: error("Unable to find '${T::class.java}' destination.")

inline fun <reified T : FeatureEntry> Destinations.findOrNull(): T? =
    this[T::class.java] as? T
