package com.ozancanguz.movieapplication.data

import com.ozancanguz.movieapplication.models.Movie
import retrofit2.Response

class RemoteDataSource(private val moviesApi: MoviesApi) {


    suspend fun getMovies(): Response<List<Movie>> {

        return moviesApi.getAllMovies()
    }
}