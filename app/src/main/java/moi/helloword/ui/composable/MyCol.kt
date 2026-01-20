package moi.helloword.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import moi.helloword.R

@Composable
fun MyCol(modifier: Modifier = Modifier) {

    var cpt by rememberSaveable { mutableIntStateOf(0) }

    Column(
        modifier = modifier.rotate(cpt * 10f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.valeur) + cpt,
            textDecoration = TextDecoration.Underline
        )
        Button(
            onClick = {
            cpt++
        }) {
            Text(
                text = stringResource(R.string.plus1),
                fontWeight = FontWeight.Bold
            )
        }
    }
}
