package com.ozancanguz.movieapplication.data.repository

import com.ozancanguz.movieapplication.data.MoviesApi
import com.ozancanguz.movieapplication.data.RemoteDataSource
import com.ozancanguz.movieapplication.models.Movie
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Response
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource){

    val remote=remoteDataSource


}