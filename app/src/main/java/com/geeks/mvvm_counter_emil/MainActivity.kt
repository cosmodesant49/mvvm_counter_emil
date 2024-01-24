package com.geeks.mvvm_counter_emil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.geeks.mvvm_counter_emil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.counterLv.observe(this, Observer { result ->
            binding.tvResult.text = result.toString()
        })
        //viewModel._counterLv.value = 0

        with(binding) {
            btnDec.setOnClickListener {
                viewModel.dec()
            }
            btnInc.setOnClickListener {
                viewModel.inc()
            }
        }
    }
}
