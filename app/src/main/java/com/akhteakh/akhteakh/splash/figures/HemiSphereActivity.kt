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

        binding.bCalculate.setOnClickListener {
            val radius = binding.etRadius.text.toString().toFloat()
            binding.tvAnswer.text =
                "TSA = ${getTotalSurfaceAreaOfHemiSphere(radius)} \n LSA = ${
                    getCurvedSurfaceAreaOfHemiSphere(radius)
                } \n VOL = ${getVolumeOfHemiSphere(radius)}"
        }
    }

    private fun getTotalSurfaceAreaOfHemiSphere(radius: Float): Float {
        return 3 * 3.14f * radius * radius
    }

    private fun getCurvedSurfaceAreaOfHemiSphere(radius: Float): Float {
        return 2 * 3.14f * radius * radius
    }

    private fun getVolumeOfHemiSphere(radius: Float): Float {
        return 0.67f * 3.14f * radius * radius * radius
    }

}