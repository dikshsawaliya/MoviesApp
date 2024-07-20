package com.diksh.moviesapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.diksh.moviesapp.data.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO
}