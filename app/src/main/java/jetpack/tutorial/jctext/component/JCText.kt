package jetpack.tutorial.jctext.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import jetpack.tutorial.jctext.ui.theme.JCTextTheme

@Composable
fun JCText(modifier: Modifier = Modifier) {
    val text = "Jetpack Compose in Android is more popular in 2024"
    Text(
        text = text,
        color = Color.Red,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        textDecoration = TextDecoration.None,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Serif,
        letterSpacing = 1.sp,
        textAlign = TextAlign.Start,
        lineHeight = 40.sp,
        modifier = modifier
    )
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewTextInCompose() {
    JCTextTheme {
        JCText()
    }
}