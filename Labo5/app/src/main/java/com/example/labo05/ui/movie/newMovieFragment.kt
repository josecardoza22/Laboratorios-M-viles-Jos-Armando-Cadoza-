package com.example.labo05.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.labo05.R
import com.example.labo05.data.model.movieModel


class newMovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private lateinit var nameEditText: EditText
    private lateinit var categoryEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var qualificationEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEditText = view?.findViewById(R.id.inputName) !!
        categoryEditText = view?.findViewById(R.id.inputCategory) !!
        descriptionEditText = view?.findViewById(R.id.inputDescription) !!
        qualificationEditText = view?.findViewById(R.id.inputQualification) !!
        submitButton = view?.findViewById(R.id.submitButton) !!

        submitButton.setOnClickListener{
            val movie = movieModel(nameEditText.text.toString(),categoryEditText.text.toString(), descriptionEditText.text.toString(), qualificationEditText.text.toString())
            movieViewModel.addMovies(movie)

            Log.d("newMovie", movieViewModel.gerMovies().toString())
        }
    }
}
