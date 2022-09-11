package arch.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import arch.sample.navigation.NavigationScreen
import com.example.androidcleanarchitectureonionapproach.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface {
                    NavigationScreen(startDestination = "home")
                }
            }
        }
    }
}
