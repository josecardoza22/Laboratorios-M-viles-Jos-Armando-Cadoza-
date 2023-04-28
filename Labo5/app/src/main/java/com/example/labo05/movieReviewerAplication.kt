package com.example.labo05

import android.app.Application
import com.example.labo05.data.movies
import com.example.labo05.repository.movieRepository

class movieReviewerAplication : Application() {
    val movieRepository: movieRepository by lazy {
        movieRepository(movies)
    }
}