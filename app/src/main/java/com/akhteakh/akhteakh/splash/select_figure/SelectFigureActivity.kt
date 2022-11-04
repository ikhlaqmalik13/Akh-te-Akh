package com.akhteakh.akhteakh.splash.select_figure

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivitySelectFigureBinding
import com.akhteakh.akhteakh.splash.figures.*

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
        binding.llCone.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, ConeActivity::class.java)
            startActivity(intent)
        }

        binding.llSphere.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, SphereActivity::class.java)
            startActivity(intent)
        }

        binding.llHemiSphere.setOnClickListener {
            val intent = Intent(this@SelectFigureActivity, HemiSphereActivity::class.java)
            startActivity(intent)
        }
    }
}