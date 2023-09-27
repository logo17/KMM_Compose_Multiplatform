package widget

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.theme.PrimaryButtonGradientBackground1
import ui.theme.PrimaryButtonGradientBackground2
import ui.theme.PrimaryButtonGradientBackground3

@Composable
fun GradientButton(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: List<Color> = listOf(
        PrimaryButtonGradientBackground1,
        PrimaryButtonGradientBackground2,
        PrimaryButtonGradientBackground3
    ),
    fontSize: TextUnit = 16.sp,
    onClick: () -> Unit
) {
    Button(
        elevation = ButtonDefaults.elevation(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
        ),
        onClick = { onClick() },
        modifier = modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = backgroundColor,
                    0.0f,
                    Float.POSITIVE_INFINITY
                ),
                shape = RoundedCornerShape(30.dp)
            )
    ) {

        Text(
            style = MaterialTheme.typography.body2.copy(
                fontSize = fontSize,
                fontWeight = FontWeight.Bold
            ),
            text = text,
            color = textColor
        )

    }
}