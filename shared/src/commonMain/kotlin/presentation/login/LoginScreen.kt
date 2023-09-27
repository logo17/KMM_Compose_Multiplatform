package presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.theme.BackgroundGradientEnd
import ui.theme.BackgroundGradientStart
import ui.theme.GreenBM
import ui.theme.Nunito
import ui.theme.OrangeBM
import widget.GradientButton
import widget.TextFieldBM

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginScreen(
    onLogin: () -> Unit,
    onForgotPassword: () -> Unit,
    onRegister: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BackgroundGradientEnd,
                        BackgroundGradientStart
                    ),
                    Float.POSITIVE_INFINITY,
                    0.0f
                )
            ),
        color = Color.Transparent
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                modifier = Modifier
                    .weight(1f)
                    .align(CenterHorizontally)
                    .padding(top = 40.dp),
                painter = painterResource("compose-multiplatform.xml"),
                contentDescription = "Background image"
            )

            Column(
                modifier = Modifier
                    .padding(32.dp)
                    .weight(2f),
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                val emailValue = rememberSaveable { mutableStateOf("") }
                val passwordValue = rememberSaveable { mutableStateOf("") }

                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Iniciar Sesión",
                    style = MaterialTheme.typography.h1,
                    color = GreenBM
                )

                TextFieldBM(
                    textFieldValue = emailValue,
                    textLabel = "Correo electrónico",
                    keyboardType = KeyboardType.Email
                )

                TextFieldBM(
                    textFieldValue = passwordValue,
                    textLabel = "Contraseña",
                    keyboardType = KeyboardType.Password
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ClickableText(
                        modifier = Modifier.wrapContentWidth(),
                        style = TextStyle(
                            textAlign = TextAlign.Center,
                            fontFamily = Nunito()
                        ),
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = GreenBM,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 13.sp
                                )
                            ) {
                                append("Eres nuevo?")
                            }

                            withStyle(
                                style = SpanStyle(
                                    color = OrangeBM,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.sp
                                )
                            ) {
                                append("\tCrear cuenta")
                            }
                        },
                        onClick = { onRegister() }
                    )

                    ClickableText(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(top = 8.dp, bottom = 8.dp),
                        style = MaterialTheme.typography.caption.copy(
                            textAlign = TextAlign.End,
                            color = GreenBM,
                            fontWeight = FontWeight.SemiBold,
                            fontStyle = FontStyle.Italic
                        ),
                        text = buildAnnotatedString { append("¿Olvidó su contraseña?") },
                        onClick = { onForgotPassword() }
                    )
                }

                GradientButton(
                    modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(),
                    text = "Ingresar",
                    textColor = Color.White
                ) {
                    onLogin()
                }

                ClickableText(
                    modifier = Modifier
                        .fillMaxWidth()
                        .paddingFromBaseline(top = 30.dp),
                    style = MaterialTheme.typography.caption.copy(
                        textAlign = TextAlign.Center,
                        color = GreenBM,
                        fontWeight = FontWeight.SemiBold
                    ),
                    text = buildAnnotatedString { append("Términos y condiciones") },
                    onClick = {}
                )
            }
        }
    }
}