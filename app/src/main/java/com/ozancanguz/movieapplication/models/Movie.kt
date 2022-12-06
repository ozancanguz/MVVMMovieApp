package com.ozancanguz.movieapplication.models


import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity()
data class Movie(

    @ColumnInfo(name="db_category")
    @SerializedName("category")
    val category: String,

    @ColumnInfo(name="db_desc")
    @SerializedName("desc")
    val desc: String,

    @ColumnInfo(name="db_imageUrl")
    @SerializedName("imageUrl")
    val imageUrl: String,

    @ColumnInfo(name="db_name")
    @SerializedName("name")
    val name: String
){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int=0
}