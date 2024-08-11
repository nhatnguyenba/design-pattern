package com.nhatnguyenba.model.view.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.nhatnguyenba.model.view.viewmodel.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        viewModel.user.observe(
            this
        ) { user ->
            binding.tvName.text = user.name
            binding.tvEmail.text = user.email
        }

        viewModel.loadUser()
    }
}