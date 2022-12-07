package com.ozancanguz.movieapplication.ui.fragments.movieDetails

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import androidx.navigation.fragment.navArgs
import com.ozancanguz.movieapplication.R
import com.ozancanguz.movieapplication.ui.fragments.movieListFragment.MovieListFragment
import com.ozancanguz.movieapplication.util.loadImage
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_movie_details.*
import kotlinx.android.synthetic.main.fragment_movie_details.view.*
import kotlinx.android.synthetic.main.movies_row_layout.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MovieDetailsFragment : Fragment() {

    private val args: MovieDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_movie_details, container, false)


      //get data from args

        if(args.currentMovie != null) {
           view.details_name.text=args.currentMovie.name.toString()
         view.details_desc.text=args.currentMovie.desc.toString()
          view.details_img.loadImage(args.currentMovie.imageUrl)
        }


    return view
    }



}