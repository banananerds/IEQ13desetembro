package com.example.ieq13desetembro.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ieq13desetembro.R

class LiderancaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lideranca, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar botões
        val btnReunioes = view.findViewById<Button>(R.id.btnReunioes)
        val btnContato = view.findViewById<Button>(R.id.btnContato)

        btnReunioes.setOnClickListener {
            Toast.makeText(requireContext(), "Próximas reuniões de liderança!", Toast.LENGTH_SHORT).show()
        }

        btnContato.setOnClickListener {
            Toast.makeText(requireContext(), "Entrando em contato com a liderança...", Toast.LENGTH_SHORT).show()
        }
    }
}