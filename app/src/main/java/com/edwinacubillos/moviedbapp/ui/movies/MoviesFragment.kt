package com.edwinacubillos.moviedbapp.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.edwinacubillos.moviedbapp.R

class MoviesFragment : Fragment() {

    private lateinit var moviesViewModel: MoviesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        moviesViewModel =
            ViewModelProviders.of(this).get(MoviesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_movies, container, false)

        return root
    }
}