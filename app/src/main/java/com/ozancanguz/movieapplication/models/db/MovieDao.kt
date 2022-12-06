package com.ozancanguz.movieapplication.models.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ozancanguz.movieapplication.models.Movie
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg movies: Movie):List<Long>

    @Query("SELECT * FROM movie")
    fun getAllMovies():List<Movie>


    @Query("SELECT*FROM movie where uuid= :movieId")
    suspend fun getMovie(movieId:Int):Movie


}