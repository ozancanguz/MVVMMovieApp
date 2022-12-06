package com.ozancanguz.movieapplication.ui.fragments.movieListFragment


import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.movieapplication.Adapter.MovieAdapter
import com.ozancanguz.movieapplication.R
import com.ozancanguz.movieapplication.viewmodels.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_movie_list.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MovieListFragment : Fragment() {



    private lateinit var viewModel:MovieViewModel
    private var movieAdapter=MovieAdapter()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_movie_list, container, false)

        //init viewmodel
        viewModel=ViewModelProvider(this).get(MovieViewModel::class.java)
        observeLiveData()

        // init rv
        view.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        view.recyclerView.adapter=movieAdapter



        return view
    }


    private fun observeLiveData() {

        viewModel.requestApiData()
        viewModel.movieList.observe(viewLifecycleOwner, Observer { newData ->
            movieAdapter.updateData(newData)
        })
    }


}


