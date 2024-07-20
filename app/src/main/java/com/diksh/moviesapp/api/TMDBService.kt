package com.diksh.moviesapp.api

import com.diksh.moviesapp.data.MovieList
import retrofit2.http.GET


interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(

        @retrofit2.http.Query(
            "api_key"
        ) apiKey: String
    ): retrofit2.Response<MovieList>

    }
