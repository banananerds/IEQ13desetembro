package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class MidiaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_midia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnFotos = view.findViewById<Button>(R.id.btnFotos)
        val btnVideos = view.findViewById<Button>(R.id.btnVideos)
        val btnRedes = view.findViewById<Button>(R.id.btnRedes)


        btnFotos.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo galeria de fotos...", Toast.LENGTH_SHORT).show()
        }

        btnVideos.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo vídeos...", Toast.LENGTH_SHORT).show()
        }

        btnRedes.setOnClickListener {
            Toast.makeText(requireContext(), "Acessando redes sociais...", Toast.LENGTH_SHORT).show()
        }

    }
}