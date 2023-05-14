package com.example.modul_4_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentOne : Fragment() {
    private lateinit var btnNext: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        btnNext = view.findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            val fragmentTwo = FragmentTwo()
            val bundle = Bundle()
            bundle.putString("data", "Hello from Fragment One")
            fragmentTwo.arguments = bundle

            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragmentTwo)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }
}
