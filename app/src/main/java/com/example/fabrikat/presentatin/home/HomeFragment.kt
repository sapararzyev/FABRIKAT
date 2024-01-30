package com.example.fabrikat.presentatin.home

import com.example.fabrikat.utils.BaseFragment
import com.example.fabrikat.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val adapter: HomeAdapter by lazy { HomeAdapter() }

    override fun setupRequest() {
        binding.itemRv.adapter = adapter
    }
}