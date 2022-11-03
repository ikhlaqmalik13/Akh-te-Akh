package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivityCubeBinding

class CubeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCubeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bCalculate.setOnClickListener {
            val side = binding.etSide.text.toString().toFloat()

            binding.tvAnswer.text = "TSA = ${getTotalSurfaceAreaOfCube(side)} \n LSA = ${
                getLateralSurfaceAreaOfCube(side)
            } \n VOL = ${getVolumeOfCube(side)}"
        }
    }

    private fun getTotalSurfaceAreaOfCube(side: Float): Float {
        return 6 * side * side
    }

    private fun getLateralSurfaceAreaOfCube(side: Float): Float {
        return 4 * side * side
    }

    private fun getVolumeOfCube(side: Float): Float {
        return side * side * side
    }

}