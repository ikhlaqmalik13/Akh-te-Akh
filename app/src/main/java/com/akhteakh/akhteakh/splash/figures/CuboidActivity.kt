package com.akhteakh.akhteakh.splash.figures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akhteakh.akhteakh.R
import com.akhteakh.akhteakh.databinding.ActivityCuboidBinding
import com.akhteakh.akhteakh.databinding.ActivitySelectFigureBinding

class CuboidActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuboidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuboidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bCalculate.setOnClickListener{
            val length = binding.etLength.text.toString().toFloat()
            val breadth = binding.etBreadth.text.toString().toFloat()
            val height = binding.etHeight.text.toString().toFloat()

            binding.tvAnswer.text = "TSA = ${getTotalSurfaceAreaOfCuboid(length, breadth, height)} \n LSA = ${
                getLateralSurfaceAreaOfCuboid(length, breadth, height)
            } \n VOL = ${getVolumeOfCuboid(length, breadth, height)}"

        }


    }
    private fun getTotalSurfaceAreaOfCuboid(length:Float,breadth:Float,height:Float):Float{
        return 2*((length*breadth) + (breadth*height) +(length*height))
    }
    private fun getLateralSurfaceAreaOfCuboid(length:Float,breadth:Float,height:Float):Float{
        return 2*((length+breadth)*height)
    }
    private fun getVolumeOfCuboid(length:Float,breadth:Float,height:Float):Float{
        return length*breadth*height
    }

}