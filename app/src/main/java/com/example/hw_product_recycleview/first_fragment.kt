package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.databinding.ActivityMainBinding.inflate


class first_fragment : Fragment() {

    private var _binding: first_fragment? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viwe = inflater.inflater(R.layout.fragment_first_fragment,container,false)

        return view

        viwe.buybutton.setOnClickListtener{Navigation.findNavController(viwe).navigate(R.id.mainActivity)}

//        _binding = first_fragment.inflate(inflater, container, false)
//        val view = binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}