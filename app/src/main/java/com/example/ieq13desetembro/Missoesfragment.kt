package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class MissoesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_missoes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnProjetos = view.findViewById<Button>(R.id.btnProjetos)
        val btnContribuir = view.findViewById<Button>(R.id.btnContribuir)
        val btnVoluntario = view.findViewById<Button>(R.id.btnVoluntario)

        btnProjetos.setOnClickListener {
            Toast.makeText(requireContext(), "Conhecendo projetos missionários...", Toast.LENGTH_SHORT).show()
        }

        btnContribuir.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo formas de contribuição...", Toast.LENGTH_SHORT).show()
        }

        btnVoluntario.setOnClickListener {
            Toast.makeText(requireContext(), "Quero ser voluntário!", Toast.LENGTH_SHORT).show()
        }
    }
}