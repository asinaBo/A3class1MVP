package com.example.a3class1mvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a3class1mvp.databinding.ActivityMainBinding
import com.example.a3class1mvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
        presenter.attachView(this)
    }

    private fun initClicker() = with(binding) {
        incrementBtn.setOnClickListener {
            presenter.increment()
        }
        decrementBtn.setOnClickListener {
            presenter.decrement()
        }
    }

    override fun showCount(number: Int) {
        binding.countTv.text = number.toString()
    }


    override fun update(number: Int) {
        if (number == 10) {
            Toast.makeText(this, "show MSG", Toast.LENGTH_SHORT).show()
        } else if (number == 15) {
            binding.countTv.setTextColor(Color.parseColor("#4CAF50"))
        } else {
            binding.countTv.setTextColor(Color.parseColor("#FF000000"))
        }
    }
}

