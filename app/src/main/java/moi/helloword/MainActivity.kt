package moi.helloword

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import moi.helloword.data.model.hugeMockMovieList
import moi.helloword.ui.composable.MovieList
import moi.helloword.ui.screens.MovieDetailScreen
import moi.helloword.ui.screens.MovieListScreen
import moi.helloword.ui.theme.HelloWordTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWordTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "movieList"
                    ) {
                        composable(route= "movieList") {
                            MovieListScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }
                        composable(route= "movieDetail/{movieId}",
                            arguments = listOf(navArgument("movieId") { type = NavType.IntType })) { backStackEntry ->
                            val movieId = backStackEntry.arguments?.getInt("movieId") ?: 0
                            MovieDetailScreen(
                                movieId = movieId,
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }
                    }

                }
            }
        }
    }
}
