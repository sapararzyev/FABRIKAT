package com.example.fabrikat.presentatin.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fabrikat.R
import com.example.fabrikat.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var controller: NavController
    private lateinit var binding: ActivityMainBinding
    private lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navView = binding.bottomNavigationBar

        initNavController()
    }

    private fun initNavController() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        controller = navHostFragment.navController


        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.basketFragment,
                R.id.addFragment,
                R.id.profileFragment
            )
        )

        setupActionBarWithNavController(controller, appBarConfiguration)
        navView.setupWithNavController(controller)

        controller.addOnDestinationChangedListener { _, destination, _ ->
    val list:ArrayList<Int> = arrayListOf()
            list.add(R.id.homeFragment)
            list.add(R.id.basketFragment)
            list.add(R.id.addFragment)
            list.add(R.id.profileFragment)
        }
    }
}


