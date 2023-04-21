package com.example.labo05_josearmando

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class billboardFragment : Fragment() {

    private lateinit var buttonAddMovie: FloatingActionButton
    private lateinit var buttonViewMovie: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonViewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
        buttonAddMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }
    }

    private fun bind() {
        buttonViewMovie = view?.findViewById(R.id.starWars_button) as CardView
        buttonAddMovie = view?.findViewById(R.id.addButton) as FloatingActionButton
    }
}