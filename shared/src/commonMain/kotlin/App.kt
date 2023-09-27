import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.Routes
import org.jetbrains.compose.resources.ExperimentalResourceApi
import presentation.login.LoginScreen
import ui.theme.CustomTheme

@Composable
fun App() {
    val navigator = rememberNavigator()
    CustomTheme {
        NavHost(
            navigator = navigator,
            initialRoute = Routes.login
        ) {
            scene(Routes.login) {
                LoginScreen(
                    onLogin = {},
                    onForgotPassword = {},
                    onRegister = {}
                )
            }
        }
    }
}