package com.example.labo05.ui.movie.billboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labo05.data.model.movieModel
import com.example.labo05.databinding.MovieItemBinding

class MovieRecylerViewAdapter (
    private val clickListener: (movieModel) -> Unit
) : RecyclerView.Adapter<MovieRecyclerViewHolder>() {
            private val movies = ArrayList<movieModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieRecyclerViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieRecyclerViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie, clickListener)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun setData(moviesList: List<movieModel>) {
        movies.clear()
        movies.addAll(moviesList)
    }
}