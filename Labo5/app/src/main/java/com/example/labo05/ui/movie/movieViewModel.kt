package com.example.labo05.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.labo05.data.model.movieModel
import com.example.labo05.movieReviewerAplication
import com.example.labo05.repository.movieRepository

class MovieViewModel(private val repository: movieRepository) : ViewModel(){

    fun gerMovies() = repository.getMovies()

    fun addMovies(movie: movieModel) = repository.addMovies(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as movieReviewerAplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}