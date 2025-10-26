package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class LouvorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_louvor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnEscala = view.findViewById<Button>(R.id.btnEscala)
        val btnRepertorio = view.findViewById<Button>(R.id.btnRepertorio)
        val btnEnsaio = view.findViewById<Button>(R.id.btnEnsaio)
        val btnParticipar = view.findViewById<Button>(R.id.btnParticipar)

        btnEscala.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo escala de músicos...", Toast.LENGTH_SHORT).show()
        }

        btnRepertorio.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo repertório...", Toast.LENGTH_SHORT).show()
        }

        btnEnsaio.setOnClickListener {
            Toast.makeText(requireContext(), "Ver horários de ensaio...", Toast.LENGTH_SHORT).show()
        }

        btnParticipar.setOnClickListener {
            Toast.makeText(requireContext(), "Quero participar do ministério!", Toast.LENGTH_SHORT).show()
        }
    }
}