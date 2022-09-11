package arch.sample.di

import androidx.compose.runtime.compositionLocalOf
import arch.sample.common.feature.Destinations

data class AppProvider(
    val destinations: Destinations
)

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }
