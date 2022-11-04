package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivityHemiSphereBinding

class HemiSphereActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHemiSphereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHemiSphereBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}