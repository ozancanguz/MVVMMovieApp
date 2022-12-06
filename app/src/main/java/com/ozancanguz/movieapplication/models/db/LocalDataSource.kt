package com.ozancanguz.movieapplication.models.db

import com.ozancanguz.movieapplication.models.Movie
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class LocalDataSource @Inject constructor(
    private val movieDao: MovieDao
) {

    fun getAllMovies(): List<Movie> {
        return movieDao.getAllMovies()
    }

    suspend fun insertAll(movie: Movie) {
        movieDao.insertAll(movie)
    }

}