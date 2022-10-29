package com.akhteakh.akhteakh.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.akhteakh.akhteakh.databinding.ActivitySplashBinding
import com.akhteakh.akhteakh.splash.select_figure.SelectFigureActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {
                val intent = Intent(this@SplashActivity, SelectFigureActivity::class.java)
                startActivity(intent)
                finish()
            },
            2000
        )

    }
}