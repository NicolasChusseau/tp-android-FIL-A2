package moi.helloword.ui.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import moi.helloword.data.model.Movie
import moi.helloword.data.model.mockMovieList

@Composable
fun MovieList(
    movies: List<Movie>,
    navController: NavController? = null,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(8.dp)) {
        items(movies) { movie ->
            MovieCard(
                movie = movie,
                modifier = modifier.clickable {
                    navController?.navigate("movieDetail/${movie.id}")
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewMovieList() {
    MovieList(movies = mockMovieList)
}