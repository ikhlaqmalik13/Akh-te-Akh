package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivityCylinderBinding

class CylinderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCylinderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCylinderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bCalculate.setOnClickListener {
            val radius = binding.etRadius.text.toString().toFloat()
            val height = binding.etHeight.text.toString().toFloat()

            binding.tvAnswer.text =
                "TSA = ${getTotalSurfaceAreaOfCylinder(radius, height)} \n LSA = ${
                    getCurvedSurfaceAreaOfCylinder(radius, height)
                } \n VOL = ${getVolumeOfCylinder(radius, height)}"

        }

    }

    private fun getTotalSurfaceAreaOfCylinder(radius: Float, height: Float): Float {
        return 2 * 3.14f * radius * (height + radius)
    }

    private fun getCurvedSurfaceAreaOfCylinder(radius: Float, height: Float): Float {
        return 2 * 3.14f * radius * height
    }

    private fun getVolumeOfCylinder(radius: Float, height: Float): Float {
        return 3.14f * radius * radius * height
    }
}