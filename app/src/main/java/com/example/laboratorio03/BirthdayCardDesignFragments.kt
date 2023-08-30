package com.example.laboratorio03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class BirthdayCardDesignFragments : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_birthday_card_design, container, false)

        val design1ImageView = view.findViewById<ImageView>(R.id.design1ImageView)
        val design2ImageView = view.findViewById<ImageView>(R.id.design2ImageView)
        val design3ImageView = view.findViewById<ImageView>(R.id.design3ImageView)
        val design4ImageView = view.findViewById<ImageView>(R.id.design4ImageView)

        design1ImageView.setOnClickListener {
            // Acciones cuando se selecciona el diseño 1
            Toast.makeText(requireContext(), "Diseño 1 seleccionado", Toast.LENGTH_SHORT).show()
        }

        design2ImageView.setOnClickListener {
            // Acciones cuando se selecciona el diseño 2
            Toast.makeText(requireContext(), "Diseño 2 seleccionado", Toast.LENGTH_SHORT).show()
        }

        design3ImageView.setOnClickListener {
            // Acciones cuando se selecciona el diseño 3
            Toast.makeText(requireContext(), "Diseño 3 seleccionado", Toast.LENGTH_SHORT).show()
        }

        design4ImageView.setOnClickListener {
            // Acciones cuando se selecciona el diseño 4
            Toast.makeText(requireContext(), "Diseño 4 seleccionado", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}

