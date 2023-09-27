package ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import font.font


@Composable
fun Nunito() = FontFamily(
    font("Nunito", "nunito_regular", FontWeight.Normal, FontStyle.Normal),
    font("Nunito", "nunito_light", FontWeight.Light, FontStyle.Normal),
    font("Nunito", "nunito_bold", FontWeight.Bold, FontStyle.Normal),
    font("Nunito", "nunito_semibold", FontWeight.SemiBold, FontStyle.Normal),
    font("Nunito", "nunito_extra_bold", FontWeight.ExtraBold, FontStyle.Normal),
    font("Nunito", "nunito_medium", FontWeight.Medium, FontStyle.Normal)
)

@Composable
fun getTypography(): Typography {
    return Typography(
        h1 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 30.sp,
        ),
        h2 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
        ),
        h3 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
        ),
        h4 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        ),
        subtitle1 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Medium,
            fontSize = 15.sp,
        ),
        subtitle2 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
        ),
        body1 = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
        ),
        body2 =  TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
        ),
        caption = TextStyle(
            fontFamily = Nunito(),
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
        )
    )
}