package com.ozancanguz.movieapplication.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ozancanguz.movieapplication.data.repository.Repository
import com.ozancanguz.movieapplication.models.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(private val repository: Repository,application: Application):AndroidViewModel(application) {


    val movieList=MutableLiveData<List<Movie>>()

   var job: Job?=null


    fun requestApiData(){

        job= CoroutineScope(Dispatchers.IO).launch {
           val response=repository.remote.getMovies()
            if(response.isSuccessful){
                movieList.postValue(response.body())
            }
            else{
                Log.d("error","no data")
            }

        }

    }


}