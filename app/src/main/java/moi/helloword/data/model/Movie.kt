package moi.helloword.data.model

data class Movie(
    val id: Int,
    val title: String,
    val author: String,
    val rate: Float
)

val mockMovieList = listOf(
    Movie(id = 1, "Inception", "Christopher Nolan", 4.8f),
    Movie(id = 2, "The Matrix", "The Wachowskis", 4.7f),
    Movie(id = 3, "Interstellar", "Christopher Nolan", 4.6f),
    Movie(id = 4, "The Godfather", "Francis Ford Coppola", 4.9f),
    Movie(id = 5, "Pulp Fiction", "Quentin Tarantino", 4.5f),
    Movie(id = 6, "The Dark Knight", "Christopher Nolan", 4.9f),
    Movie(id = 7, "Fight Club", "David Fincher", 4.4f),
)

val hugeMockMovieList = List(100) {
    Movie(
        id = it + 1,
        title = "Movie Title $it",
        author = "Author $it",
        rate = (3..5).random() + listOf(0.0f, 0.5f).random()
    )
}