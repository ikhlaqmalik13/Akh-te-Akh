package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivityConeBinding
import com.akhteakh.akhteakh.databinding.ActivityCubeBinding

class ConeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bCalculate.setOnClickListener {
            val radius = binding.etRadius.text.toString().toFloat()
            val height = binding.etHeight.text.toString().toFloat()

            binding.tvAnswer.text = "TSA = ${getTotalSurfaceAreaOfCone(radius, height)} \n LSA = ${
                getCurvedSurfaceAreaOfCone(radius, height)
            } \n VOL = ${getVolumeOfCone(radius, height)}"

        }

    }

    private fun getTotalSurfaceAreaOfCone(radius: Float, height: Float): Float {
        return 3.14f * radius * (height + radius)
    }

    private fun getCurvedSurfaceAreaOfCone(radius: Float, height: Float): Float {
        return 3.14f * radius * height
    }

    private fun getVolumeOfCone(radius: Float, height: Float): Float {
        return (0.34f) * (3.14f * radius * radius * height)
    }
}