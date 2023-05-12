package com.example.labo05.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.labo05.data.model.movieModel
import com.example.labo05.databinding.MovieItemBinding


class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: movieModel, clickListener: (movieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }



}