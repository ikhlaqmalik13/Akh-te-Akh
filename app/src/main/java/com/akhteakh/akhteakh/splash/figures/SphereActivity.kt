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

        binding.bCalculate.setOnClickListener {
            val radius = binding.etRadius.text.toString().toFloat()
            binding.tvAnswer.text =
                "TSA = ${getTotalSurfaceAreaOfSphere(radius)} \n LSA = ${
                    getCurvedSurfaceAreaOfSphere(radius)
                } \n VOL = ${getVolumeOfSphere(radius)}"
        }
    }

    private fun getTotalSurfaceAreaOfSphere(radius: Float): Float {
        return 4 * 3.14f * radius * radius
    }

    private fun getCurvedSurfaceAreaOfSphere(radius: Float): Float {
        return 4 * 3.14f * radius * radius
    }

    private fun getVolumeOfSphere(radius: Float): Float {
        return 1.34f * 3.14f * radius * radius * radius
    }

}