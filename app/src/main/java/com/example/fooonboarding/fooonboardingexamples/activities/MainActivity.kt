package com.example.fooonboarding.fooonboardingexamples.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fooonboarding.R
import com.example.fooonboarding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun onClick(view: View) {
        when (view.id) {

            R.id.btn_example1 -> {
                val intent =
                    Intent(applicationContext, OnboardingExample1Activity::class.java)
                startActivity(intent)
            }

            R.id.btn_example2 -> {
                val intent =
                    Intent(applicationContext, OnboardingExample2Activity::class.java)
                startActivity(intent)
            }
            R.id.btn_example3 -> {
                val intent =
                    Intent(applicationContext, OnboardingExample3Activity::class.java)
                startActivity(intent)
            }
            R.id.btn_example4 -> {
                val intent =
                    Intent(applicationContext, OnboardingExample4Activity::class.java)
                startActivity(intent)
            }
            R.id.btn_example5 -> {
                val intent =
                    Intent(applicationContext, OnboardingExample5Activity::class.java)
                startActivity(intent)
            }
        }
    }

}
