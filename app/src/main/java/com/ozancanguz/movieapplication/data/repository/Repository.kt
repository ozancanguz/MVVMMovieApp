package com.ozancanguz.movieapplication.data.repository

import com.ozancanguz.movieapplication.data.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource,


){

    val remote=remoteDataSource


}