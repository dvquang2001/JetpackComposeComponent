package jetpack.tutorial.jctext.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jetpack.tutorial.jctext.ui.theme.JCTextTheme

@Composable
fun JCColumn(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()) {
        Text(text = "Text 1", color = Color.Red, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Text 2", color = Color.Blue, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Text 3", color = Color.Green, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Text 4", color = Color.DarkGray, fontSize = 25.sp)
    }
}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true
)
fun PreviewJCColumn() {
    JCTextTheme {
        JCColumn()
    }
}