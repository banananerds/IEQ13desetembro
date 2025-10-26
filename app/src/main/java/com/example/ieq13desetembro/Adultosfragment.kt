package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class AdultosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_adultos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnEstudos = view.findViewById<Button>(R.id.btnEstudos)
        val btnEventos = view.findViewById<Button>(R.id.btnEventos)
        val btnGrupos = view.findViewById<Button>(R.id.btnGrupos)

        btnEstudos.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo estudos bíblicos...", Toast.LENGTH_SHORT).show()
        }

        btnEventos.setOnClickListener {
            Toast.makeText(requireContext(), "Ver próximos eventos...", Toast.LENGTH_SHORT).show()
        }

        btnGrupos.setOnClickListener {
            Toast.makeText(requireContext(), "Conhecendo os grupos...", Toast.LENGTH_SHORT).show()
        }
    }
}