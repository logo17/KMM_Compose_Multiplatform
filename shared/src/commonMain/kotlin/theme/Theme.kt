package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember


private val AppDarkColorScheme = darkColors(
    primary = GreenBM,
    secondary = OrangeBM
)

private val AppLightColorScheme = lightColors(
    primary = GreenBM,
    secondary = OrangeBM

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CustomTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val currentColorScheme = remember { if (darkTheme) AppDarkColorScheme else AppLightColorScheme }
    MaterialTheme(
        colors = currentColorScheme,
        typography = getTypography(),
        shapes = Shapes,
        content = {
            content()
        })
}