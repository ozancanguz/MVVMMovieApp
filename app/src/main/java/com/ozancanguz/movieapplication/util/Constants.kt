package com.ozancanguz.movieapplication.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.movieapplication.R

class Constants {

    companion object{


        const val BASE_URL="https://www.howtodoandroid.com/"

    }
    fun ImageView.downloadFromUrl(url: String?){


        Glide.with(context)
            .load(url)
            .into(this)

    }


}