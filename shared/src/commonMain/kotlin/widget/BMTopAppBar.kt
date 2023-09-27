package widget

import androidx.compose.foundation.clickable
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BMTopAppBar(
    title: String,
    onBackClicked: () -> Unit = {},
    backgroundColor: Color = Color.Transparent
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.onSurface
            )
        },
        navigationIcon = {
            Icon(
                Icons.Default.ArrowBack,
                modifier = Modifier
                    .clickable {
                        onBackClicked()
                    },
                contentDescription = null
            )
        },
        backgroundColor = backgroundColor
    )
}