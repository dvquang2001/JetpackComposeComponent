package jetpack.tutorial.jctext.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jetpack.tutorial.jctext.ui.theme.JCTextTheme

@Composable
fun JCButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Red
        ),
        shape = RoundedCornerShape(size = 5.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 5.dp),
        modifier = modifier.wrapContentSize()
    ) {
        Text(
            text = "JCButton",
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
        )
    }
}

@Composable
fun JCTextButton(modifier: Modifier = Modifier) {
    TextButton(
        onClick = { /*TODO*/ },
        modifier = modifier
    ) {
        Text(text = "JC Text Button", color = Color.Red)
    }
}

@Composable
fun JCOutlineButton(modifier: Modifier = Modifier) {
    OutlinedButton(onClick = { /*TODO*/ },
        border = BorderStroke(width = 1.dp, color = Color.Blue),
        modifier = modifier) {
        Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "Button")
        Text(text = "JC Outlined Button", color = Color.Red)
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewJCButton() {
    JCTextTheme {
        JCOutlineButton(modifier = Modifier.wrapContentSize())
    }
}