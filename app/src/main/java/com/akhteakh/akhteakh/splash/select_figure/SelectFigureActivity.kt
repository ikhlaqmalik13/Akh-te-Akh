package com.akhteakh.akhteakh.splash.select_figure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivitySelectFigureBinding
import com.akhteakh.akhteakh.splash.figures.CubeActivity
import com.akhteakh.akhteakh.splash.figures.CuboidActivity
import com.akhteakh.akhteakh.splash.figures.CylinderActivity

class SelectFigureActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectFigureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectFigureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llCube.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, CubeActivity::class.java)
            startActivity(intent)
        }

        binding.llCylinder.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, CylinderActivity::class.java)
            startActivity(intent)
        }

        binding.llCuboid.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, CuboidActivity::class.java)
            startActivity(intent)
        }

    }
}