package moi.helloword.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import moi.helloword.data.model.mockMovieList
import moi.helloword.ui.composable.MovieList

@Composable
fun MovieListScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    MovieList(movies = mockMovieList, navController = navController, modifier = modifier)
}