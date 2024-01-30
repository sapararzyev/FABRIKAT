package com.example.fabrikat.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.example.fabrikat.R

abstract class BaseFragment<VB : ViewBinding>(
    private val bindingInflater
    : (layoutInflater: LayoutInflater) -> VB
) : Fragment() {

    private var _binding: VB? = null
    protected val binding get() = _binding!!

    private var _controller: NavController? = null
    protected val controller get() = _controller!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as
                    NavHostFragment
        _controller = navHostFragment.navController
        _binding = bindingInflater.invoke(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initialize()
        listeners()
        setupRequest()
    }

    protected open fun initialize() {}
    protected open fun listeners() {}
    protected open fun setupRequest() {}

}