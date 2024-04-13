package com.example.otbor_na_stazhirovku

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.otbor_na_stazhirovku.Constants.IMAGE_KEY
import com.example.otbor_na_stazhirovku.Constants.NAME_KEY
import com.example.otbor_na_stazhirovku.Constants.YEAR_KEY
import com.example.otbor_na_stazhirovku.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val itemList = arrayListOf(
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
        ItemModel(
            "https://w.forfun.com/fetch/51/5146d10292e6a81a26fb26b9dd0c5006.jpeg",
            "Mp4 12C",
            "2002"
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ItemAdapter(itemList, this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onClick(item: ItemModel) {
        val bundle = Bundle()
        bundle.putString(NAME_KEY, item.name)
        bundle.putString(IMAGE_KEY, item.image)
        bundle.putString(YEAR_KEY, item.year)
        val ditailFragment = DitailFragment()
        ditailFragment.arguments = bundle
        findNavController().navigate(R.id.ditailFragment, bundle)
    }

}