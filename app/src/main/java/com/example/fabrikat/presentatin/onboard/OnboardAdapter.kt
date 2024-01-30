package com.example.fabrikat.presentatin.onboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fabrikat.ComeinFragment
import com.example.fabrikat.RegistFragment

@Suppress("UNREACHABLE_CODE")
class OnboardAdapter(fragmentActivity: FragmentActivity, private val contents: List<String>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ComeinFragment()
            1 -> RegistFragment()
            else -> ComeinFragment()
        }
        return OnboardFragment()
    }

    override fun getItemCount(): Int {
        return 2
    }

}