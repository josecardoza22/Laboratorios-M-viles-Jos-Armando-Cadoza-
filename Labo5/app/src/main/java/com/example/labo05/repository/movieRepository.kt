package com.example.labo05.repository

import com.example.labo05.data.model.movieModel

class movieRepository(private val movies: MutableList<movieModel>) {

    fun getMovies() = movies

    fun addMovies(movie: movieModel) = movies.add(movie)
}