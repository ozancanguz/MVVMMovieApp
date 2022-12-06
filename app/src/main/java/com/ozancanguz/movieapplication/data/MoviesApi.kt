package com.ozancanguz.movieapplication.data

import com.ozancanguz.movieapplication.models.Movie
import retrofit2.Response
import retrofit2.http.GET

interface MoviesApi {

    @GET("movielist.json")
    suspend fun getAllMovies(): Response<List<Movie>>


}