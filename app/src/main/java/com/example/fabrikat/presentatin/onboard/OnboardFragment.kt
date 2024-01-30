package com.example.fabrikat.presentatin.onboard

import com.example.fabrikat.utils.BaseFragment
import com.example.fabrikat.databinding.FragmentOnboardBinding
import com.google.android.material.tabs.TabLayoutMediator


class OnboardFragment : BaseFragment<FragmentOnboardBinding>(FragmentOnboardBinding::inflate) {

    private val adapter: OnboardAdapter by lazy {
        OnboardAdapter(
            this.requireActivity(),
            contents = listOf()
        )
    }

    override fun initialize() {
        binding.pager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
           when(position){
               0 -> tab.text = "Войти"
               1 -> tab.text = "Регистрация"
           }
        }.attach()
    }

}
