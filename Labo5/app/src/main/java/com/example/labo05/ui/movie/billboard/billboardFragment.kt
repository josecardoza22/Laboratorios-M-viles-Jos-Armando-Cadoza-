package com.example.labo05.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.labo05.R
import com.example.labo05.data.model.movieModel
import com.example.labo05.databinding.FragmentBillboardBinding
import com.example.labo05.ui.movie.billboard.recyclerview.MovieRecylerViewAdapter

class BillboardFragment : Fragment() {
    private lateinit var binding: FragmentBillboardBinding

    private lateinit var adapter: MovieRecylerViewAdapter

    private val movieViewModel: MovieViewModel by activityViewModels() {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun showSelectedItem(movie: movieModel) {
        movieViewModel.setSelectedMovie(movie)
        findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
    }

    private fun displayMovies() {
        adapter.setData(movieViewModel.getMovies())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view: View) {
        binding.cardMovie.layoutManager = LinearLayoutManager(view.context)

        adapter = MovieRecylerViewAdapter { selectedMovie ->
            showSelectedItem(selectedMovie)
        }

        binding.cardMovie.adapter = adapter
        displayMovies()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        binding.add.setOnClickListener {
            view.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }

    }

}