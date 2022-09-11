package arch.sample.di

import arch.sample.common.feature.Destinations
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideAppProvider(
        destinations: Destinations
    ) = AppProvider(destinations)
}
