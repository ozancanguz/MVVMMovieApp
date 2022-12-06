package com.ozancanguz.movieapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ozancanguz.movieapplication.R
import com.ozancanguz.movieapplication.models.Movie
import com.ozancanguz.movieapplication.util.loadImage
import kotlinx.android.synthetic.main.movies_row_layout.view.*



class MovieAdapter:RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    var movieList= emptyList<Movie>()

    // last thing
    fun updateData(newData:List<Movie>){
        this.movieList=newData.toMutableList()
        notifyDataSetChanged()
    }

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.movies_row_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentMovie=movieList[position]
        holder.itemView.moviename_tv.text=currentMovie.name
        holder.itemView.desc_textview.text=currentMovie.desc

        //glide ile sonradan ekledik
        holder.itemView.movie_imageview.loadImage(currentMovie.imageUrl)


    }


    override fun getItemCount(): Int {
       return movieList.size
    }

}