package jetpack.tutorial.jctext.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import jetpack.tutorial.jctext.ui.theme.JCTextTheme

@OptIn(ExperimentalCoilApi::class)
@Composable
fun JCImage(modifier: Modifier = Modifier) {
    val imageUrl = "https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=vi"
    Image(
        painter = rememberImagePainter(data = imageUrl),
        contentDescription = "Compose image",
        modifier = modifier
            .width(100.dp)
            .height(100.dp)
    )
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewJCImage() {
    JCTextTheme {
        JCImage()
    }
}