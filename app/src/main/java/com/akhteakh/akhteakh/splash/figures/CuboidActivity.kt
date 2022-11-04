package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.databinding.ActivityCubeBinding
import com.akhteakh.akhteakh.databinding.ActivityCuboidBinding

class CuboidActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuboidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuboidBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cCalculate.setOnClickListener {
            val height = binding.etHeight.text.toString().toFloat()
            val length = binding.etLength.text.toString().toFloat()
            val breadth = binding.etBreadth.text.toString().toFloat()


            binding.tvAnswercuboid.text = "TSA = ${getTotalSurfaceAreaOfCuboid (length , breadth , height)} \n LSA = ${getLateralSurfaceAreaOfCuboid(length , breadth , height)}" +
                    "Volume = ${getVolumeOfCuboid(height, length, breadth)}"

        }
    }
    private fun getTotalSurfaceAreaOfCuboid(height : Float, Length: Float , Breadth : Float): Float {
        return 2 * (Length * Breadth + Breadth * height + height * Length)
}

    private fun getLateralSurfaceAreaOfCuboid(height : Float, Length: Float , Breadth : Float): Float {
        return 2 * (Length + Breadth) * height
    }

    private fun getVolumeOfCuboid(height : Float, Length: Float , Breadth : Float): Float {
        return Length * Breadth * height
    }
}


