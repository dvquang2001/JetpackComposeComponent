package jetpack.tutorial.jctext.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun JCState(modifier: Modifier = Modifier) {
    val variable by remember {
        mutableStateOf(0)
    }
}