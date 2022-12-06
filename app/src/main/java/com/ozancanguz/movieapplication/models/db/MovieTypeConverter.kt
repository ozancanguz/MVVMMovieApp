package com.ozancanguz.movieapplication.models.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ozancanguz.movieapplication.models.Movie

class MovieTypeConverter {

    var gson = Gson()

    @TypeConverter
    fun foodRecipeToString(movie: Movie): String {
        return gson.toJson(movie)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): Movie {
        val listType = object : TypeToken<Movie>() {}.type
        return gson.fromJson(data, listType)
    }
}