package com.ozancanguz.movieapplication.models


import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("category")
    val category: String,
    @SerializedName("desc")
    val desc: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("name")
    val name: String
)