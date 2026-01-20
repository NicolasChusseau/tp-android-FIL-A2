package moi.helloword.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import moi.helloword.data.model.mockMovieList
import moi.helloword.ui.composable.MovieCard

@Composable
fun MovieDetailScreen(
    movieId: Int,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(modifier = modifier) {
        Button(onClick = {
            navController.navigate("movieList")
        }) {
            Text(text = "Back to Movie List")
        }
        Spacer(modifier = Modifier.height(8.dp))
        MovieCard(movie = mockMovieList.first { it.id == movieId }, modifier = modifier)
    }
}