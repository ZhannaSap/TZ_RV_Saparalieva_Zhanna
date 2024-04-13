package com.example.otbor_na_stazhirovku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.otbor_na_stazhirovku.Constants.IMAGE_KEY
import com.example.otbor_na_stazhirovku.Constants.NAME_KEY
import com.example.otbor_na_stazhirovku.Constants.YEAR_KEY
import com.example.otbor_na_stazhirovku.databinding.FragmentDitailBinding

class DitailFragment : Fragment() {
    private lateinit var binding: FragmentDitailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDitailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvName.text = arguments?.getString(NAME_KEY)
        binding.tvYear.text = arguments?.getString(YEAR_KEY)
        Glide.with(this)
            .load(arguments?.getString(IMAGE_KEY))
            .into(binding.image)
    }


}