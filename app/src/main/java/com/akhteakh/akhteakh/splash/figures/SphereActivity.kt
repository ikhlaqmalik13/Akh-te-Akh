package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivitySphereBinding

class SphereActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySphereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySphereBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}