package jetpack.tutorial.jctext.component

import android.view.Gravity
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jetpack.tutorial.jctext.ui.theme.JCTextTheme

@Composable
fun JCToast() {
    val context = LocalContext.current
    val toast = Toast.makeText(context, "Toast example", Toast.LENGTH_LONG)
    Button(onClick = {
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }, modifier = Modifier.wrapContentSize()) {
        Text(text = "Press me", modifier = Modifier.padding(12.dp))
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun PreviewJCToast() {
    JCTextTheme {
        JCToast()
    }
}