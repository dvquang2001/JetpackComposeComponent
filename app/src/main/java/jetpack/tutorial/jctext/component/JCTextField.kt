package jetpack.tutorial.jctext.component

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jetpack.tutorial.jctext.ui.theme.JCTextTheme
import kotlin.math.sin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JCTextField(modifier: Modifier = Modifier) {
    val input = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = input.value, onValueChange = {
            input.value = it
        },
        enabled = true,
        label = { Text(text = "Enter your name")},
        leadingIcon = { IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Icon",
            tint = Color.Black
            )
        }},
        trailingIcon = { IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = "Icon",
                tint = Color.Black
            )
        }},
        singleLine = true,
        shape = RoundedCornerShape(size = 12.dp),
        colors = TextFieldDefaults.textFieldColors(textColor = Color.Red, focusedLabelColor = Color.Green),
        modifier = modifier.wrapContentSize()
    )
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewJCTextField() {
    JCTextTheme {
        JCTextField()
    }
}