package com.akhteakh.akhteakh.splash.select_figure

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivitySelectFigureBinding

class SelectFigureActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectFigureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectFigureBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}