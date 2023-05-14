package com.example.modul_4_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FragmentTwo : Fragment() {
    private lateinit var btnBack: Button
    private lateinit var tvData: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        btnBack = view.findViewById(R.id.btn_back)
        tvData = view.findViewById(R.id.tv_data)

        val data = arguments?.getString("data")
        tvData.text = data

        btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        return view
    }
}
