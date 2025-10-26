package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class DiaconatoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_diaconato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnSocorro = view.findViewById<Button>(R.id.btnSocorro)
        val btnDoacoes = view.findViewById<Button>(R.id.btnDoacoes)
        val btnVisitas = view.findViewById<Button>(R.id.btnVisitas)

        btnSocorro.setOnClickListener {
            Toast.makeText(requireContext(), "Solicitando socorro imediato...", Toast.LENGTH_SHORT).show()
        }

        btnDoacoes.setOnClickListener {
            Toast.makeText(requireContext(), "Abrindo opções de doação...", Toast.LENGTH_SHORT).show()
        }

        btnVisitas.setOnClickListener {
            Toast.makeText(requireContext(), "Agendando visita...", Toast.LENGTH_SHORT).show()
        }
    }
}