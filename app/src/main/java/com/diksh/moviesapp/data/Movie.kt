package com.diksh.moviesapp.data

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


@Entity(tableName = "popular_movies")
data class Movie(

    @SerializedName("id")
    val id: Int,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("poster_path")
    val posterPath : String,

    @SerializedName("release_date")
    val releaseDate: String,

)
