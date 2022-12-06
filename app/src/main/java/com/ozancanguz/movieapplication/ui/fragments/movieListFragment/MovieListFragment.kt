package com.ozancanguz.movieapplication.ui.fragments.movieListFragment


import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import com.ozancanguz.movieapplication.R
import com.ozancanguz.movieapplication.viewmodels.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MovieListFragment : Fragment() {



    private lateinit var viewModel:MovieViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_movie_list, container, false)

        //init viewmodel
        viewModel=ViewModelProvider(this).get(MovieViewModel::class.java)
        observeLiveData()


        return view
    }


    private fun observeLiveData() {

        viewModel.requestApiData()
        viewModel.movieList.observe(viewLifecycleOwner, Observer {
            Log.d("data"," " +it)
        })
    }


}


