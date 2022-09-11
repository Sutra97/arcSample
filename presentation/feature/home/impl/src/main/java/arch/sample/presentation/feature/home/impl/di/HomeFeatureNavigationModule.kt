package arch.sample.presentation.feature.home.impl.di

import arch.sample.common.feature.FeatureEntry
import arch.sample.common.feature.FeatureEntryKey
import arch.sample.presentation.feature.home.api.HomeFeatureEntry
import arch.sample.presentation.feature.home.impl.HomeFeatureEntryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HomeFeatureNavigationModule {
    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(HomeFeatureEntry::class)
    fun homeEntry(entry: HomeFeatureEntryImpl): FeatureEntry
}
