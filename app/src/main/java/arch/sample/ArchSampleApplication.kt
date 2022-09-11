package arch.sample

import android.app.Application
import arch.sample.di.AppProvider
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class ArchSampleApplication : Application() {

    @Inject
    lateinit var appProvider: AppProvider

    override fun onCreate() {
        super.onCreate()
    }
}

val Application.appProvider: AppProvider
    get() = (this as ArchSampleApplication).appProvider
